
package bullyingstop;

import java.sql.*;
import java.sql.Connection;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class BullyingStop extends javax.swing.JFrame {
    
   conexionMysql con = new conexionMysql();                                     //creamos la variable para la conexión
   Connection cn = con.conectar();
  
    
    public BullyingStop() {     
        
        initComponents();
        jPanel1.setVisible(false);                                         
        jPanel2.setVisible(false);
        jPanel3.setVisible(false);
        mostrardatos();                                                         //creamos metodo
        limpiardatos();                                                         //creamos metodo
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtnombre = new javax.swing.JTextField();
        txtid = new javax.swing.JTextField();
        txtapellidos = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        txtcurso = new javax.swing.JTextField();
        txtalias = new javax.swing.JTextField();
        txtcontraseña = new javax.swing.JTextField();
        btnregistrar = new javax.swing.JButton();
        btnactualizar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtabledatos = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PANEL DE CONTROL");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "STOPBULLYING ALUMNOS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(204, 253, 221));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ingrese la siguiente información", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N

        txtnombre.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre"));

        txtid.setBorder(javax.swing.BorderFactory.createTitledBorder("Id"));
        txtid.setEnabled(false);

        txtapellidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Apellidos"));

        txtemail.setBorder(javax.swing.BorderFactory.createTitledBorder("Email"));

        txtcurso.setBorder(javax.swing.BorderFactory.createTitledBorder("Curso"));

        txtalias.setBorder(javax.swing.BorderFactory.createTitledBorder("Alias"));

        txtcontraseña.setBorder(javax.swing.BorderFactory.createTitledBorder("Contraseña"));

        btnregistrar.setText("Registrar");
        btnregistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistrarActionPerformed(evt);
            }
        });

        btnactualizar.setText("Actualizar");
        btnactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarActionPerformed(evt);
            }
        });

        btneliminar.setText("Eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtapellidos, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                    .addComponent(txtemail)
                    .addComponent(txtcurso)
                    .addComponent(txtalias)
                    .addComponent(txtcontraseña)
                    .addComponent(txtnombre)
                    .addComponent(btneliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnregistrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnactualizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtid)
                    .addComponent(txtnombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtapellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtcurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtalias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtcontraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnregistrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnactualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btneliminar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 253, 221));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Listado de Alumnos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N

        jtabledatos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jtabledatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtabledatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtabledatosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtabledatos);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 809, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(356, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(74, 74, 74))
        );

        jPanel2.getAccessibleContext().setAccessibleDescription("");

        jMenu1.setText("Usuarios");

        jMenuItem1.setText("Nuevo Usuario");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

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

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        jPanel1.setVisible(true);
        jPanel2.setVisible(true);
        jPanel3.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btnregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistrarActionPerformed
        // TODO add your handling code here:
         try {
         PreparedStatement ps = cn.prepareStatement ("INSERT INTO usuarios (nombre,apellidos,email,curso,alias,contraseña) VALUES (?,?,?,?,?,?)"); //integramos nuestro comando para registrar el usuario en la BBDD
         ps.setString(1, txtnombre.getText());                          //posicion en la cual el usuario va a registrar en la caja de texto y asi sucesivamente
         ps.setString(2, txtapellidos.getText());
         ps.setString(3, txtemail.getText());
         ps.setString(4, txtcurso.getText());
         ps.setString(5, txtalias.getText());
         ps.setString(6, txtcontraseña.getText());
         ps.execute();
         JOptionPane.showMessageDialog(null, "DATOS GUARDADOS CORRECTAMENTE");  //nos va a mostrar un mensaje como que se ha registrado el usuario
         mostrardatos();
         limpiardatos();  
         
        }catch (SQLException e) {
             JOptionPane.showMessageDialog(null, "ERROR AL GUARDAR USUARIO" +e);      // o en su defecto dará un error
        }
    }//GEN-LAST:event_btnregistrarActionPerformed

    private void btnactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarActionPerformed
        // TODO add your handli ng code here:
        try {
         PreparedStatement ps = cn.prepareStatement 
        ("UPDATE usuarios SET nombre = ?,apellidos = ?,email = ?,curso = ?,alias = ?,contraseña = ? WHERE usuarios.id ='"+txtid.getText()+"';"); //integramos nuestro comando para actualizar el usuario en la BBDD
         ps.setString(1, txtnombre.getText());
         ps.setString(2, txtapellidos.getText());
         ps.setString(3, txtemail.getText());
         ps.setString(4, txtcurso.getText());
         ps.setString(5, txtalias.getText());
         ps.setString(6, txtcontraseña.getText());
         ps.execute();
         JOptionPane.showMessageDialog(null, "DATOS ACTUALIZADOS CORRECTAMENTE");  //nos va a mostrar un mensaje como que se ha actualizado el usuario
         mostrardatos();
         limpiardatos();  
         
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR AL ACTUALIZAR EL USUARIO" +e);    // o en su defecto dará un error
        }
        
    }//GEN-LAST:event_btnactualizarActionPerformed

    private void jtabledatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtabledatosMouseClicked
            // TODO add your handling code here:
                                                                                //creamos este evento para redireccionarnos a la tabla
            int selectedRow = jtabledatos.getSelectedRow();                     //vamos a seleccionar la fila de la tabla

            if (selectedRow != -1) {
                
                Object id =  jtabledatos.getValueAt(selectedRow, 0);
                Object nombre = jtabledatos.getValueAt(selectedRow, 1);
                Object apellidos = jtabledatos.getValueAt(selectedRow, 2);
                Object email = jtabledatos.getValueAt(selectedRow, 3);
                Object curso = jtabledatos.getValueAt(selectedRow, 4);
                Object alias = jtabledatos.getValueAt(selectedRow, 5);
                Object contraseña = jtabledatos.getValueAt(selectedRow, 6);

               txtid.setText(id.toString());                                  //settexteamos todo lo que se recupere de la posicion 0 de la fila y asi sucesivamente 
               txtnombre.setText(nombre.toString());
               txtapellidos.setText(apellidos.toString());
               txtemail.setText(email.toString());
               txtcurso.setText(curso.toString());
               txtalias.setText(alias.toString());
               txtcontraseña.setText(contraseña.toString());

            }
    }//GEN-LAST:event_jtabledatosMouseClicked

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        try {
                 PreparedStatement ps = cn.prepareStatement 
                ("DELETE FROM usuarios WHERE usuarios.id ='"+txtid.getText()+"';");  //integramos nuestro comando para eliminar el usuario en la BBDD
                 ps.execute();
                 JOptionPane.showMessageDialog(null, "USUARIO ELIMINADO CORRECTAMENTE");  //nos va a mostrar un mensaje como que se ha eliminado el usuario
                 mostrardatos();
                 limpiardatos();  

                }catch (SQLException e) {
                     JOptionPane.showMessageDialog(null, "HA HABIDO UN ERROR AL ELIMINAR" +e);   // o en su defecto dará un error
                }
    }//GEN-LAST:event_btneliminarActionPerformed

    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BullyingStop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BullyingStop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BullyingStop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BullyingStop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BullyingStop().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnactualizar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnregistrar;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtabledatos;
    private javax.swing.JTextField txtalias;
    private javax.swing.JTextField txtapellidos;
    private javax.swing.JTextField txtcontraseña;
    private javax.swing.JTextField txtcurso;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables

    private void mostrardatos() {
        DefaultTableModel modelo=new DefaultTableModel();                       //modelo de tabla en el cual vamos a agregar columnas
        modelo.addColumn ("Id");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellidos");
        modelo.addColumn("Email");
        modelo.addColumn("Curso");
        modelo.addColumn("Alias");
        modelo.addColumn("Contraseña");
        jtabledatos.setModel(modelo);                                   //a la tabla se le asigna el modelo
        String consultasql="select*from usuarios";                              //consulta sql para la BBDD
        String data[]=new String[7];                                            //string data para almacenar 7 indices
        
        Statement st;
        try {
            st=cn.createStatement();
            ResultSet rs=st.executeQuery(consultasql);
            while(rs.next()){                                                   //recorre los datos con un while
                data[0]=rs.getString(1);                                      //get string para ubicar nuestros datos
                data[1]=rs.getString(2);
                data[2]=rs.getString(3);
                data[3]=rs.getString(4);
                data[4]=rs.getString(5);
                data[5]=rs.getString(6);
                data[6]=rs.getString(7);
                modelo.addRow(data);
            }
        }catch (SQLException e) {
            System.out.println("Error al mostrar Datos " + e);
            }
        }

    private void limpiardatos() {
        txtid.setText("");                                                    //metodo para limpiar los datos del usuario en cada caja de texto
        txtnombre.setText("");
        txtapellidos.setText("");
        txtemail.setText("");
        txtcurso.setText("");
        txtalias.setText("");
        txtcontraseña.setText("");   
    }

}
    
