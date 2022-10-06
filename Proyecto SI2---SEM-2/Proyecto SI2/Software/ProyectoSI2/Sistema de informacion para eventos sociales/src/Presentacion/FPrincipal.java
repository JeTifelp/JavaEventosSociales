
package Presentacion;

import Datos.Sql;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.sql.SQLException;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class FPrincipal extends javax.swing.JFrame implements INF412{
        
    public FPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null); 
        Init.setImagenLogo(Fondo);
        desactivarPrivilegios();
        this.setTitle("Empresa "+Init.config.getProperty("empresa"));     
        String db=Init.config.getProperty("nombre_bd");
        try {
            Sql.conectarODBC("ESTUDIO");
        } catch (SQLException ex) {
            Logger.getLogger(FPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new jcMousePanel.jcMousePanel();
        barraAccesoRapido = new javax.swing.JToolBar();
        mb = new javax.swing.JMenuBar();
        mInicio = new javax.swing.JMenu();
        miIniciarSesion = new javax.swing.JMenuItem();
        miCambiarSesion = new javax.swing.JMenuItem();
        miCerrarSesion = new javax.swing.JMenuItem();
        s1 = new javax.swing.JPopupMenu.Separator();
        miSalir = new javax.swing.JMenuItem();
        mRegistro = new javax.swing.JMenu();
        miCliente = new javax.swing.JMenuItem();
        miEmpleado = new javax.swing.JMenuItem();
        miCargoLaboral = new javax.swing.JMenuItem();
        miEquipo = new javax.swing.JMenuItem();
        miTipoEquipo = new javax.swing.JMenuItem();
        mServicios = new javax.swing.JMenu();
        smContratos = new javax.swing.JMenu();
        miContratoEvento = new javax.swing.JMenuItem();
        miCobros = new javax.swing.JMenuItem();
        miTipoEvento = new javax.swing.JMenuItem();
        miReserva = new javax.swing.JMenuItem();
        smPaquete = new javax.swing.JMenu();
        miPaquete = new javax.swing.JMenuItem();
        miComponente = new javax.swing.JMenuItem();
        miCategoria = new javax.swing.JMenuItem();
        mAdmistracion = new javax.swing.JMenu();
        miAgenda = new javax.swing.JMenuItem();
        miOrdenTrabajo = new javax.swing.JMenuItem();
        miAsignacionEquipos = new javax.swing.JMenuItem();
        miGruposUsuarios = new javax.swing.JMenuItem();
        mReportes = new javax.swing.JMenu();
        miReportes = new javax.swing.JMenuItem();
        mHerramientas = new javax.swing.JMenu();
        miPerfilUsuario = new javax.swing.JMenuItem();
        miPerfilEmpresa = new javax.swing.JMenuItem();
        miCambiarPassword = new javax.swing.JMenuItem();
        miBackupRestore = new javax.swing.JMenuItem();
        miBitacoraUsuarios = new javax.swing.JMenuItem();
        mAyuda = new javax.swing.JMenu();
        miInformacionSistema = new javax.swing.JMenuItem();
        miAcercaDe = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(417, 332));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        Fondo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Fondo.setMinimumSize(new java.awt.Dimension(417, 332));
        Fondo.setModo(4);
        Fondo.setPreferredSize(new java.awt.Dimension(417, 332));
        Fondo.setTransparencia(0.0F);
        Fondo.setVisibleLogo(false);

        barraAccesoRapido.setBackground(new java.awt.Color(0, 102, 102));
        barraAccesoRapido.setOrientation(javax.swing.SwingConstants.VERTICAL);
        barraAccesoRapido.setRollover(true);

        javax.swing.GroupLayout FondoLayout = new javax.swing.GroupLayout(Fondo);
        Fondo.setLayout(FondoLayout);
        FondoLayout.setHorizontalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addComponent(barraAccesoRapido, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 377, Short.MAX_VALUE))
        );
        FondoLayout.setVerticalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(barraAccesoRapido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
        );

        mInicio.setText("Inicio");

        miIniciarSesion.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        miIniciarSesion.setText("Iniciar Sesion");
        miIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miIniciarSesionActionPerformed(evt);
            }
        });
        mInicio.add(miIniciarSesion);

        miCambiarSesion.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        miCambiarSesion.setText("Cambiar Sesion");
        miCambiarSesion.setEnabled(false);
        miCambiarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCambiarSesionActionPerformed(evt);
            }
        });
        mInicio.add(miCambiarSesion);

        miCerrarSesion.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        miCerrarSesion.setText("Cerrar Sesion");
        miCerrarSesion.setEnabled(false);
        miCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCerrarSesionActionPerformed(evt);
            }
        });
        mInicio.add(miCerrarSesion);
        mInicio.add(s1);

        miSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        miSalir.setText("Salir");
        miSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSalirActionPerformed(evt);
            }
        });
        mInicio.add(miSalir);

        mb.add(mInicio);

        mRegistro.setText("Registro");

        miCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.SHIFT_MASK));
        miCliente.setText("Cliente");
        miCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miClienteActionPerformed(evt);
            }
        });
        mRegistro.add(miCliente);

        miEmpleado.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.SHIFT_MASK));
        miEmpleado.setText("Empleado");
        miEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miEmpleadoActionPerformed(evt);
            }
        });
        mRegistro.add(miEmpleado);

        miCargoLaboral.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_3, java.awt.event.InputEvent.SHIFT_MASK));
        miCargoLaboral.setText("Tipo de cargo laboral");
        miCargoLaboral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCargoLaboralActionPerformed(evt);
            }
        });
        mRegistro.add(miCargoLaboral);

        miEquipo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_4, java.awt.event.InputEvent.SHIFT_MASK));
        miEquipo.setText("Equipo");
        miEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miEquipoActionPerformed(evt);
            }
        });
        mRegistro.add(miEquipo);

        miTipoEquipo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_5, java.awt.event.InputEvent.SHIFT_MASK));
        miTipoEquipo.setText("Tipo de equipos");
        miTipoEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miTipoEquipoActionPerformed(evt);
            }
        });
        mRegistro.add(miTipoEquipo);

        mb.add(mRegistro);

        mServicios.setText("Servicios");

        smContratos.setText("Contratos para Eventos");

        miContratoEvento.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.ALT_MASK));
        miContratoEvento.setText("Contratos");
        miContratoEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miContratoEventoActionPerformed(evt);
            }
        });
        smContratos.add(miContratoEvento);

        miCobros.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.ALT_MASK));
        miCobros.setText("Cobros");
        miCobros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCobrosActionPerformed(evt);
            }
        });
        smContratos.add(miCobros);

        miTipoEvento.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_3, java.awt.event.InputEvent.ALT_MASK));
        miTipoEvento.setText("Tipo de Eventos");
        miTipoEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miTipoEventoActionPerformed(evt);
            }
        });
        smContratos.add(miTipoEvento);

        mServicios.add(smContratos);

        miReserva.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_4, java.awt.event.InputEvent.ALT_MASK));
        miReserva.setText("Reservas para Eventos");
        miReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miReservaActionPerformed(evt);
            }
        });
        mServicios.add(miReserva);

        smPaquete.setText("Paquetes & Complementos");

        miPaquete.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_5, java.awt.event.InputEvent.ALT_MASK));
        miPaquete.setText("Paquete");
        miPaquete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miPaqueteActionPerformed(evt);
            }
        });
        smPaquete.add(miPaquete);

        miComponente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_6, java.awt.event.InputEvent.ALT_MASK));
        miComponente.setText("Componentes");
        miComponente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miComponenteActionPerformed(evt);
            }
        });
        smPaquete.add(miComponente);

        miCategoria.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_7, java.awt.event.InputEvent.ALT_MASK));
        miCategoria.setText("Categorias");
        miCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCategoriaActionPerformed(evt);
            }
        });
        smPaquete.add(miCategoria);

        mServicios.add(smPaquete);

        mb.add(mServicios);

        mAdmistracion.setText("Admistracion");

        miAgenda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_6, java.awt.event.InputEvent.SHIFT_MASK));
        miAgenda.setText("Agenda");
        miAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAgendaActionPerformed(evt);
            }
        });
        mAdmistracion.add(miAgenda);

        miOrdenTrabajo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_7, java.awt.event.InputEvent.SHIFT_MASK));
        miOrdenTrabajo.setText("Orden de Trabajo");
        miOrdenTrabajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miOrdenTrabajoActionPerformed(evt);
            }
        });
        mAdmistracion.add(miOrdenTrabajo);

        miAsignacionEquipos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_8, java.awt.event.InputEvent.SHIFT_MASK));
        miAsignacionEquipos.setText("Asignacion de Equipos");
        miAsignacionEquipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAsignacionEquiposActionPerformed(evt);
            }
        });
        mAdmistracion.add(miAsignacionEquipos);

        miGruposUsuarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_9, java.awt.event.InputEvent.SHIFT_MASK));
        miGruposUsuarios.setText("Grupos & Usuarios");
        miGruposUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miGruposUsuariosActionPerformed(evt);
            }
        });
        mAdmistracion.add(miGruposUsuarios);

        mb.add(mAdmistracion);

        mReportes.setText("Reportes");

        miReportes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        miReportes.setText("Realizar reportes");
        miReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miReportesActionPerformed(evt);
            }
        });
        mReportes.add(miReportes);

        mb.add(mReportes);

        mHerramientas.setText("Herramientas");

        miPerfilUsuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.CTRL_MASK));
        miPerfilUsuario.setText("Configurar mi perfil de usuario");
        miPerfilUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miPerfilUsuarioActionPerformed(evt);
            }
        });
        mHerramientas.add(miPerfilUsuario);

        miPerfilEmpresa.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.CTRL_MASK));
        miPerfilEmpresa.setText("Configurar perfil de la empresa");
        miPerfilEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miPerfilEmpresaActionPerformed(evt);
            }
        });
        mHerramientas.add(miPerfilEmpresa);

        miCambiarPassword.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_3, java.awt.event.InputEvent.CTRL_MASK));
        miCambiarPassword.setText("Cambiar mi password");
        miCambiarPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCambiarPasswordActionPerformed(evt);
            }
        });
        mHerramientas.add(miCambiarPassword);

        miBackupRestore.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_4, java.awt.event.InputEvent.CTRL_MASK));
        miBackupRestore.setText("Realizar backup & restore");
        miBackupRestore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miBackupRestoreActionPerformed(evt);
            }
        });
        mHerramientas.add(miBackupRestore);

        miBitacoraUsuarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_5, java.awt.event.InputEvent.CTRL_MASK));
        miBitacoraUsuarios.setText("Mostrar bitacoras de los usuarios");
        miBitacoraUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miBitacoraUsuariosActionPerformed(evt);
            }
        });
        mHerramientas.add(miBitacoraUsuarios);

        mb.add(mHerramientas);

        mAyuda.setText("Ayuda");

        miInformacionSistema.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        miInformacionSistema.setText("Informacion de Sistema");
        miInformacionSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miInformacionSistemaActionPerformed(evt);
            }
        });
        mAyuda.add(miInformacionSistema);

        miAcercaDe.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        miAcercaDe.setText("Acerca De???");
        miAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAcercaDeActionPerformed(evt);
            }
        });
        mAyuda.add(miAcercaDe);

        mb.add(mAyuda);

        setJMenuBar(mb);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miIniciarSesionActionPerformed
        Init.iniciarSesion.setTitle("Iniciar Sesion");
        Init.iniciarSesion.setVisible(true);
        if(Init.iniciarSesion.isOk()){
            miIniciarSesion.setEnabled(false);
            miCambiarSesion.setEnabled(true);
            miCerrarSesion.setEnabled(true);
            Init.loadPrivilegios();
            String perfil=Init.config.getProperty("perfil."+Init.user.getLogin());
            Object array[]=Init.castPerfil(perfil);
            Init.repaintAllForms((Color)array[0],(float)array[1],(Color)array[2],(Font)array[3]);
            this.repaint();
        }        
    }//GEN-LAST:event_miIniciarSesionActionPerformed

    private void miCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCerrarSesionActionPerformed
        desactivarPrivilegios();
        miIniciarSesion.setEnabled(true);        
        miCerrarSesion.setEnabled(false);
        miCambiarSesion.setEnabled(false);
        Object array[]=Init.castPerfil(Init.defaultPerfilUser);        
        Init.repaintAllForms((Color)array[0],(float)array[1],(Color)array[2],(Font)array[3] );
    }//GEN-LAST:event_miCerrarSesionActionPerformed

    private void miSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSalirActionPerformed
        formWindowClosing(null); 
        System.exit(0);
    }//GEN-LAST:event_miSalirActionPerformed

    private void miClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miClienteActionPerformed
        Init.cliente.setVisible(true);
    }//GEN-LAST:event_miClienteActionPerformed

    private void miEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miEmpleadoActionPerformed
        Init.empleado.setVisible(true);
    }//GEN-LAST:event_miEmpleadoActionPerformed

    private void miCargoLaboralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCargoLaboralActionPerformed
        Init.cargoLaboral.setVisible(true);
    }//GEN-LAST:event_miCargoLaboralActionPerformed

    private void miContratoEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miContratoEventoActionPerformed
        Init.contratoEvento.setVisible(true);
    }//GEN-LAST:event_miContratoEventoActionPerformed

    private void miPaqueteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miPaqueteActionPerformed
        Init.paquete.setVisible(true);
    }//GEN-LAST:event_miPaqueteActionPerformed

    private void miReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miReservaActionPerformed
        Init.reserva.setVisible(true);
    }//GEN-LAST:event_miReservaActionPerformed

    private void miAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAgendaActionPerformed
        Init.agenda.setVisible(true);
    }//GEN-LAST:event_miAgendaActionPerformed

    private void miOrdenTrabajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miOrdenTrabajoActionPerformed
        Init.ordenTrabajo.setVisible(true);
    }//GEN-LAST:event_miOrdenTrabajoActionPerformed

    private void miGruposUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miGruposUsuariosActionPerformed
        Init.UG.setVisible(true);
    }//GEN-LAST:event_miGruposUsuariosActionPerformed

    private void miPerfilUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miPerfilUsuarioActionPerformed
        Init.perfilUsuario.setVisible(true);        
    }//GEN-LAST:event_miPerfilUsuarioActionPerformed

    private void miPerfilEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miPerfilEmpresaActionPerformed
        Init.perfilEmpresa.setVisible(true);
    }//GEN-LAST:event_miPerfilEmpresaActionPerformed

    private void miCambiarPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCambiarPasswordActionPerformed
        Init.cambiarPassword.setVisible(true);
    }//GEN-LAST:event_miCambiarPasswordActionPerformed

    private void miBackupRestoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miBackupRestoreActionPerformed
        Init.backupRestore.setVisible(true);
    }//GEN-LAST:event_miBackupRestoreActionPerformed

    private void miBitacoraUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miBitacoraUsuariosActionPerformed
        Init.inputBitacora.setVisible(true);
    }//GEN-LAST:event_miBitacoraUsuariosActionPerformed

    private void miInformacionSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miInformacionSistemaActionPerformed
        
    }//GEN-LAST:event_miInformacionSistemaActionPerformed

    private void miAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAcercaDeActionPerformed
        
    }//GEN-LAST:event_miAcercaDeActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        Sql.desconectar();        
    }//GEN-LAST:event_formWindowClosing

    private void miCobrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCobrosActionPerformed
        Init.cobros.setVisible(true);
    }//GEN-LAST:event_miCobrosActionPerformed

    private void miEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miEquipoActionPerformed
        Init.equipo.setVisible(true);
    }//GEN-LAST:event_miEquipoActionPerformed

    private void miTipoEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miTipoEquipoActionPerformed
        Init.tipoEquipos.setVisible(true);
    }//GEN-LAST:event_miTipoEquipoActionPerformed

    private void miTipoEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miTipoEventoActionPerformed
        Init.tipoEvento.setVisible(true);
    }//GEN-LAST:event_miTipoEventoActionPerformed

    private void miComponenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miComponenteActionPerformed
        Init.componente.setVisible(true);
    }//GEN-LAST:event_miComponenteActionPerformed

    private void miCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCategoriaActionPerformed
        Init.categoriaComponente.setVisible(true);
    }//GEN-LAST:event_miCategoriaActionPerformed

    private void miAsignacionEquiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAsignacionEquiposActionPerformed
        Init.asignacionEquipo.setVisible(true);
    }//GEN-LAST:event_miAsignacionEquiposActionPerformed

    private void miCambiarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCambiarSesionActionPerformed
        Init.iniciarSesion.setTitle("Cambiar Sesion");
        Init.iniciarSesion.setVisible(true);
        if(Init.iniciarSesion.isOk()){
            Init.loadPrivilegios();
            String perfil=Init.config.getProperty("perfil."+Init.user.getLogin());
            Object array[]=Init.castPerfil(perfil);
            Init.repaintAllForms((Color)array[0],(float)array[1],(Color)array[2],(Font)array[3]);
            this.repaint();
        }
    }//GEN-LAST:event_miCambiarSesionActionPerformed

    private void miReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miReportesActionPerformed
        Init.reportes.setVisible(true);
    }//GEN-LAST:event_miReportesActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Windows look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private jcMousePanel.jcMousePanel Fondo;
    private javax.swing.JToolBar barraAccesoRapido;
    private javax.swing.JMenu mAdmistracion;
    private javax.swing.JMenu mAyuda;
    private javax.swing.JMenu mHerramientas;
    private javax.swing.JMenu mInicio;
    private javax.swing.JMenu mRegistro;
    private javax.swing.JMenu mReportes;
    private javax.swing.JMenu mServicios;
    private javax.swing.JMenuBar mb;
    private javax.swing.JMenuItem miAcercaDe;
    private javax.swing.JMenuItem miAgenda;
    private javax.swing.JMenuItem miAsignacionEquipos;
    private javax.swing.JMenuItem miBackupRestore;
    private javax.swing.JMenuItem miBitacoraUsuarios;
    private javax.swing.JMenuItem miCambiarPassword;
    private javax.swing.JMenuItem miCambiarSesion;
    private javax.swing.JMenuItem miCargoLaboral;
    private javax.swing.JMenuItem miCategoria;
    private javax.swing.JMenuItem miCerrarSesion;
    private javax.swing.JMenuItem miCliente;
    private javax.swing.JMenuItem miCobros;
    private javax.swing.JMenuItem miComponente;
    private javax.swing.JMenuItem miContratoEvento;
    private javax.swing.JMenuItem miEmpleado;
    private javax.swing.JMenuItem miEquipo;
    private javax.swing.JMenuItem miGruposUsuarios;
    private javax.swing.JMenuItem miInformacionSistema;
    private javax.swing.JMenuItem miIniciarSesion;
    private javax.swing.JMenuItem miOrdenTrabajo;
    private javax.swing.JMenuItem miPaquete;
    private javax.swing.JMenuItem miPerfilEmpresa;
    private javax.swing.JMenuItem miPerfilUsuario;
    private javax.swing.JMenuItem miReportes;
    private javax.swing.JMenuItem miReserva;
    private javax.swing.JMenuItem miSalir;
    private javax.swing.JMenuItem miTipoEquipo;
    private javax.swing.JMenuItem miTipoEvento;
    private javax.swing.JPopupMenu.Separator s1;
    private javax.swing.JMenu smContratos;
    private javax.swing.JMenu smPaquete;
    // End of variables declaration//GEN-END:variables

    public void desactivarPrivilegios(){
        miCliente.setEnabled(false);
        miEmpleado.setEnabled(false);
        miCargoLaboral.setEnabled(false);
        miEquipo.setEnabled(false);
        miTipoEquipo.setEnabled(false);
        miContratoEvento.setEnabled(false);
        miCobros.setEnabled(false);
        miTipoEvento.setEnabled(false);        
        miReserva.setEnabled(false);
        miPaquete.setEnabled(false);
        miComponente.setEnabled(false);
        miCategoria.setEnabled(false);
        miAgenda.setEnabled(false);
        miOrdenTrabajo.setEnabled(false);
        miAsignacionEquipos.setEnabled(false);
        miGruposUsuarios.setEnabled(false);
        mReportes.setEnabled(false);
        miPerfilUsuario.setEnabled(false);
        miPerfilEmpresa.setEnabled(false);
        miCambiarPassword.setEnabled(false);
        miBackupRestore.setEnabled(false);        
    }
    
    @Override
    public void activarPrivilegios(String privilegios){
        StringTokenizer token=new StringTokenizer(privilegios,"*");
        miCliente.setEnabled(token.nextToken().charAt(0)=='V');
        miEmpleado.setEnabled(token.nextToken().charAt(0)=='V');
        miCargoLaboral.setEnabled(token.nextToken().charAt(0)=='V');
        miEquipo.setEnabled(token.nextToken().charAt(0)=='V');
        miTipoEquipo.setEnabled(token.nextToken().charAt(0)=='V');
        miContratoEvento.setEnabled(token.nextToken().charAt(0)=='V');
        miCobros.setEnabled(token.nextToken().charAt(0)=='V');
        miTipoEvento.setEnabled(token.nextToken().charAt(0)=='V');        
        miReserva.setEnabled(token.nextToken().charAt(0)=='V');
        miPaquete.setEnabled(token.nextToken().charAt(0)=='V');
        miComponente.setEnabled(token.nextToken().charAt(0)=='V');
        miCategoria.setEnabled(token.nextToken().charAt(0)=='V');        
        miAgenda.setEnabled(token.nextToken().charAt(0)=='V');
        miOrdenTrabajo.setEnabled(token.nextToken().charAt(0)=='V');
        miAsignacionEquipos.setEnabled(token.nextToken().charAt(0)=='V');
        miGruposUsuarios.setEnabled(token.nextToken().charAt(0)=='V');
        mReportes.setEnabled(token.nextToken().charAt(0)=='V');
        miPerfilUsuario.setEnabled(true);
        miPerfilEmpresa.setEnabled(token.nextToken().charAt(0)=='V');
        miCambiarPassword.setEnabled(true);
        miBackupRestore.setEnabled(token.nextToken().charAt(0)=='V');
    }    
    
    @Override
    public void repaintAll(Color colorFondo,float transparencia,Color colorFuente,Font font){
        Fondo.setBackground(colorFondo);
        Fondo.setTransparencia(transparencia);
        Component c[]=Fondo.getComponents();
        for (Component ci : c) {
            ci.setForeground(colorFuente);
            ci.setFont(font);
        }
        this.repaint();
    }    

    @Override
    public void clear() {
    
    }
    
}
