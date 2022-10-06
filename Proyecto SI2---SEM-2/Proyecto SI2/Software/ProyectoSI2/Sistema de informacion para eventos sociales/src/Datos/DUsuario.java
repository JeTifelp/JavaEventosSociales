
package Datos;

import java.io.Serializable;
import java.util.StringTokenizer;

public class DUsuario implements Serializable {

    private String login;
    private String password;
    private String idGrupo;
    private String ci;

    public DUsuario() {
        
    }

    public DUsuario(String login, String password, String idGrupo, String ci) {
        this.login = login;
        this.password = password;
        this.idGrupo = idGrupo;
        this.ci = ci;
    }

    public DUsuario(DUsuario usuario) {
        if (usuario != null) {
            this.login = usuario.login;
            this.password = usuario.password;
            this.idGrupo = usuario.idGrupo;
            this.ci = usuario.ci;
        }
    }

    public void setCI(String ci) {
        this.ci = ci;
    }

    public void setIdGrupo(String idGrupo) {
        this.idGrupo = idGrupo;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCI() {
        return ci;
    }

    public String getIdGrupo() {
        return idGrupo;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return login + "|" + password + "|" + idGrupo + "|" + ci ;
    }

    public static DUsuario toUsuario(String tupla) {
        StringTokenizer token = new StringTokenizer(tupla, "|");
        DUsuario u = new DUsuario();
        u.login=token.nextToken();
        u.password=token.nextToken();
        u.idGrupo=token.nextToken();
        u.ci=token.nextToken();
        return u;
    }
}