/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controler.Conexion;
import Controler.Facade;
import java.awt.MenuBar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Menu extends javax.swing.JFrame {

    PreparedStatement ps;
    ResultSet res;
    Connection con;
    private String loginBuscar;
    private Consulta dataPerson;
    private Facade facade;
    private Compras compras;
    private PASSWORD viewPass;

    public Menu() {

        con = Conexion.conectar();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        button1 = new java.awt.Button();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNameUser = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        m_historial = new javax.swing.JMenu();
        btnCompras = new javax.swing.JMenu();
        M_Cerrar = new javax.swing.JMenu();
        m_datosperson = new javax.swing.JMenu();
        btnCuenta = new javax.swing.JMenu();

        button1.setLabel("button1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setText(" TE DAMOS LA BIENVENIDA.");

        jLabel2.setBackground(new java.awt.Color(204, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/mapa-marcador-inicio (3).png"))); // NOI18N

        txtNameUser.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(txtNameUser, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(97, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(197, 197, 197))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNameUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                .addGap(24, 24, 24))
        );

        jMenuBar1.setName(""); // NOI18N

        m_historial.setText("Historial");
        jMenuBar1.add(m_historial);

        btnCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/carrito-de-compras (3).png"))); // NOI18N
        btnCompras.setText("Compras ");
        btnCompras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnComprasMouseClicked(evt);
            }
        });
        btnCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprasActionPerformed(evt);
            }
        });
        btnCompras.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnComprasKeyPressed(evt);
            }
        });
        jMenuBar1.add(btnCompras);

        M_Cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/salida.png"))); // NOI18N
        M_Cerrar.setText("Cerrar Sesion ");
        M_Cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                M_CerrarMouseClicked(evt);
            }
        });
        jMenuBar1.add(M_Cerrar);

        m_datosperson.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/usuario-de-archivo (1).png"))); // NOI18N
        m_datosperson.setText("Datos personales ");
        m_datosperson.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m_datospersonMouseClicked(evt);
            }
        });
        jMenuBar1.add(m_datosperson);

        btnCuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/archivo-factura-dolar.png"))); // NOI18N
        btnCuenta.setText("Cambiar Password");
        btnCuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCuentaMouseClicked(evt);
            }
        });
        jMenuBar1.add(btnCuenta);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprasActionPerformed
    }//GEN-LAST:event_btnComprasActionPerformed

    private void btnComprasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnComprasKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnComprasKeyPressed

    private void btnComprasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnComprasMouseClicked
        compras = new Compras();
        compras.setMenu(this);
        compras.setLoginBuscar(loginBuscar);
        compras.setLocationRelativeTo(null);
        this.setVisible(false);
        compras.setVisible(true);
        compras.searchUser();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnComprasMouseClicked

    private void M_CerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_M_CerrarMouseClicked
        facade.openLogin();
        setVisible(false);
    }//GEN-LAST:event_M_CerrarMouseClicked

    private void m_datospersonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m_datospersonMouseClicked
        dataPerson = new Consulta();
        dataPerson.setLoginBuscar(loginBuscar);
        dataPerson.setMenu(this);
        this.setVisible(false);
        dataPerson.setVisible(true);
        dataPerson.setLocationRelativeTo(null);
        dataPerson.queryInformation();
    }//GEN-LAST:event_m_datospersonMouseClicked

    private void btnCuentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCuentaMouseClicked
        this.setVisible(false);
        viewPass = new PASSWORD();
        viewPass.setMenu(this);
        viewPass.setVisible(true);
        viewPass.setLocationRelativeTo(null);
        viewPass.setCurrentUser(loginBuscar);
    }//GEN-LAST:event_btnCuentaMouseClicked

    @Override
    public MenuBar getMenuBar() {
        return super.getMenuBar(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    public void setFacade(Facade facade) {
        this.facade = facade;
    }

    public Facade getFacade() {
        return facade;
    }

    public void setLoginBuscar(String loginBuscar) {
        this.loginBuscar = loginBuscar;
    }

    public String getLoginBuscar() {
        return loginBuscar;
    }

    public void searchUser() {
        try {
            String sqlQuery;
            sqlQuery = "SELECT n.DsNombre,ap.DsApellido,am.DsApellido\n"
                    + ",DsTpPerson\n"
                    + "FROM mUsuario as u JOIN mdtPerson as mdt ON  u.Cvperson = mdt.CvPerson \n"
                    + "jOIN cNombre as n ON mdt.CvNombre= n.cvNombre\n"
                    + "jOIN capellido as ap ON mdt.CvApePat= ap.cvApellido\n"
                    + "jOIN capellido as am ON mdt.CvApeMat= am.cvApellido\n"
                    + "JOIN ctpperson as ctp ON ctp.CvTpPerson = mdt.CvTpPerson\n"
                    + "JOIN caficion as af ON af.CvAficion = mdt.CvAficion\n"
                    + "WHERE login = (?)";
            ps = con.prepareStatement(sqlQuery);
            ps.setString(1, loginBuscar);
            res = ps.executeQuery();
            if (res.next()) {
                String name = res.getString("n.DsNombre");
                String pat = res.getString("ap.DsApellido");
                String mat = res.getString("am.DsApellido");
                String type = res.getString("DsTpPerson");
                txtNameUser.setText(" " + name.concat(" " + pat.concat(" " + mat).concat(" (".concat(type).concat(")"))));
            }

        } catch (SQLException ex) {
            Logger.getLogger(Compras.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu M_Cerrar;
    private javax.swing.JMenu btnCompras;
    private javax.swing.JMenu btnCuenta;
    private java.awt.Button button1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu m_datosperson;
    private javax.swing.JMenu m_historial;
    private javax.swing.JTextField txtNameUser;
    // End of variables declaration//GEN-END:variables
}