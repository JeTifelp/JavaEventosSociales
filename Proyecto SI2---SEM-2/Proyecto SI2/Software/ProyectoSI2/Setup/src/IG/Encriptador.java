package IG;

import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class Encriptador {

    public Encriptador(){
    }

    public static String encriptar(String msj, String pw) throws Exception {
        byte[] keyData = pw.getBytes();
        Key clave = new SecretKeySpec(keyData, "AES");
        Cipher encriptar = Cipher.getInstance("AES/ECB/PKCS5Padding");
        encriptar.init(Cipher.ENCRYPT_MODE, clave);
        byte[] msjEncriptado = encriptar.doFinal(msj.getBytes(), 0, msj.getBytes().length);
        return Base64.encode(msjEncriptado);
    }

    public static String desencriptar(String c, String pw) throws Exception {
        byte[] keyData = pw.getBytes();
        Key clave = new SecretKeySpec(keyData, "AES");        
        byte[] msjEncriptado = Base64.decode(c);
        Cipher desencriptar = Cipher.getInstance("AES/ECB/PKCS5Padding");
        desencriptar.init(Cipher.DECRYPT_MODE, clave);
        byte[] msjDesencriptado = desencriptar.doFinal(msjEncriptado);
        return new String(msjDesencriptado);
    }
}