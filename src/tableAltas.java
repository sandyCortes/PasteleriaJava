import com.sun.javafx.geom.ConcentricShapePair;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
public class tableAltas extends javax.swing.JFrame {

    public tableAltas() {
        initComponents();
       // mostrarDatos();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField4 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ctidProducto = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        ctDescripcion = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        ctExistencia = new javax.swing.JTextField();
        cbTipo = new javax.swing.JComboBox();
        btnGuardar = new javax.swing.JButton();
        ctPrecio = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnTabla = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbProductos = new javax.swing.JTable();
        btnLlamado1 = new javax.swing.JButton();
        btnLlamado2 = new javax.swing.JButton();
        mbMenu = new javax.swing.JMenuBar();
        menuSalir = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        jTextField4.setText("jTextField1");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("IdProducto");

        jLabel2.setText("Descripcion");

        jLabel3.setText("Precio");

        jLabel4.setText("Tipo");

        jLabel5.setText("Existencia");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Altas");

        jLabel7.setText("$");

        cbTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Venta", "Gasto", " " }));

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guardar.png"))); // NOI18N
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/borrar.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buscar.png"))); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/modificar.png"))); // NOI18N
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnTabla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tabla.png"))); // NOI18N
        btnTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTablaActionPerformed(evt);
            }
        });

        tbProductos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tbProductos);

        btnLlamado1.setText("Llamado al procedimiento");
        btnLlamado1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLlamado1ActionPerformed(evt);
            }
        });

        btnLlamado2.setText("Llamada a Procedimiento2");
        btnLlamado2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLlamado2ActionPerformed(evt);
            }
        });

        menuSalir.setText("File");

        jMenuItem1.setText("Salir");
        menuSalir.add(jMenuItem1);

        mbMenu.add(menuSalir);

        setJMenuBar(mbMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addGap(142, 142, 142))
            .addGroup(layout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(62, 62, 62)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ctExistencia, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnLlamado1)
                                    .addComponent(btnLlamado2))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ctPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(570, 570, 570))))
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ctDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ctidProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ctidProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ctDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ctPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ctExistencia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnLlamado1)
                        .addGap(12, 12, 12)
                        .addComponent(btnLlamado2))
                    .addComponent(btnTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
       Connection c = Coneccion.conexion();
       if(c != null){
           try {
               PreparedStatement ps = c.prepareStatement("insert into producto values (?,?,?,?,?)");
              ps.setInt(1,Integer.parseInt(ctidProducto.getText()));
               ps.setString(2,ctDescripcion.getText());
               ps.setFloat(3,Float.parseFloat(ctPrecio.getText()));
               ps.setInt(4,Integer.parseInt(ctExistencia.getText()));
           
           if(cbTipo.getSelectedItem().toString().equals("Venta"))
               ps.setInt(5,1);
           else
               ps.setInt(5,2);
           
           ps.execute();
        
           JOptionPane.showMessageDialog(null,"el producto se agrego con exito");
           } catch (Exception ex) {
               System.err.println("error en guardar==" + ex);
           }
       }
       else 
            System.err.println("no hay conexion a la base");
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       Connection conexion = Coneccion.conexion();
       if(conexion != null)
           try {
           PreparedStatement ps = conexion.prepareStatement("delete from Producto where idproducto = ?");
            ps.setInt(1,Integer.parseInt(ctidProducto.getText()));
            ps.executeUpdate();
            Limpiar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed

        Connection conexion = Coneccion.conexion();
        System.out.println("update");
       if(conexion != null)
           try {
           PreparedStatement ps = conexion.prepareStatement("update producto set descripcion = ?,precio = ?,existencia=?,tipo=? where idProducto = ?");
                ps.setString(1,ctDescripcion.getText());
            ps.setFloat(2,Float.parseFloat(ctPrecio.getText()));
            ps.setInt(3,Integer.parseInt(ctExistencia.getText()));
            if(cbTipo.getSelectedItem().toString().equals("Venta"))
                ps.setInt(4, 1);
            else 
                ps.setInt(4,2);
            ps.setInt(5,Integer.parseInt(ctidProducto.getText()));
            ps.execute();
            
        } catch (Exception e) {
        }
        
    }//GEN-LAST:event_btnModificarActionPerformed

    
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
       Connection x = Coneccion.conexion();
       if(x != null){
           try{
               PreparedStatement ps = x.prepareStatement("select * from producto where idProducto = ?");
               ps.setInt(1, Integer.parseInt(ctidProducto.getText()));
               ResultSet rs = ps.executeQuery();
               if(rs.next()){
                   ctDescripcion.setText(rs.getString("descripcion"));
                   ctPrecio.setText(rs.getString(3));
                   ctExistencia.setText(rs.getString(4));
                   int tipo = rs.getInt("tipo");
                   if(tipo==1)
                       cbTipo.setSelectedItem("venta");
                   else
                       cbTipo.setSelectedItem("gasto");
               }
               else JOptionPane.showMessageDialog(null,"no existen datos");
           }
           catch(Exception ex){
           }
       }else
            System.err.println("no hay conexion");
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTablaActionPerformed
        Connection c = Coneccion.conexion();
        if(c != null){
            try{
                Statement st = c.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
                ResultSet rs = st.executeQuery("select * from Producto");
                if(rs.next()){
                    String titulos[] = new String[3];
                    String datos[][] = new String[3][3];
                    int columnas = rs.getMetaData().getColumnCount();
                    rs.last();//movemos el puntero al final de la tabla
                    int filas = rs.getRow();
                    titulos = new String[columnas];
                    datos = new String[filas][columnas];
                    //llenar el array de titulos
                    for(int i=0;i<columnas;i++){
                        titulos[i] = rs.getMetaData().getColumnName(i+1);
                    }
                    rs.first();
                    //Llenamos array de datos
                    for(int i=0; i< filas; i++){
                        for(int j=0; j < columnas; j++){
                            datos[i][j] = rs.getString(j+1);
                        }
                        rs.next();
                    }
                    //inicializar el JTable
                    tbProductos= new JTable(datos,titulos);
                    jScrollPane3.setViewportView(tbProductos);
                    
                }else
                    System.out.println("No hay datos");
            } catch(Exception e){
                System.out.println("No hay conexión");
            }
        }
        else{
            System.out.println("Sin conexion");
        }
    }//GEN-LAST:event_btnTablaActionPerformed

    private void btnLlamado1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLlamado1ActionPerformed
        Connection c = Coneccion.conexion();
        if(c != null){
            try{
                CallableStatement cs = c.prepareCall("{Call dbo.altaProducto(?,?,?,?,?)}");
                cs.setInt(1,Integer.parseInt(ctidProducto.getText()));
                cs.setString(2, ctDescripcion.getText());
                cs.setInt(3,Integer.parseInt(ctExistencia.getText()));
                cs.setFloat(4, Float.parseFloat(ctPrecio.getText()));
                if(cbTipo.getSelectedItem().toString().equals("Venta"))
                    cs.setInt(5,1);
                 else
                    cs.setInt(5,2);
                
                cs.execute();
            }catch(Exception e){
                System.out.println("Error en llamado a procedimiento: "+e);
            }
        } else{
            System.out.println("No hay conexión a la base");
        }
    }//GEN-LAST:event_btnLlamado1ActionPerformed

    private void btnLlamado2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLlamado2ActionPerformed
        Connection c = Coneccion.conexion();
        if(c != null){
            try{
                CallableStatement cs = c.prepareCall("{Call dbo.altaProducto2(?,?,?,?,?,?)}");
                cs.setInt(1,Integer.parseInt(ctidProducto.getText()));
                cs.setString(2, ctDescripcion.getText());
                cs.setInt(3,Integer.parseInt(ctExistencia.getText()));
                cs.setFloat(4, Float.parseFloat(ctPrecio.getText()));
                if(cbTipo.getSelectedItem().toString().equals("Venta"))
                    cs.setInt(5,1);
                 else
                    cs.setInt(5,2);
                cs.registerOutParameter(6, Types.VARCHAR);
                cs.execute();
                JOptionPane.showMessageDialog(null, cs.getString(6));
            }catch(Exception e){
                System.out.println("Error en llamado a procedimiento: "+e);
            }
        } else{
            System.out.println("No hay conexión a la base");
        }
    }//GEN-LAST:event_btnLlamado2ActionPerformed
    public void Limpiar(){
        ctidProducto.setText("");
        ctExistencia.setText("");
        ctPrecio.setText("");
        ctDescripcion.setText("");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(tableAltas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tableAltas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tableAltas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tableAltas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tableAltas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLlamado1;
    private javax.swing.JButton btnLlamado2;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnTabla;
    private javax.swing.JComboBox cbTipo;
    private javax.swing.JTextField ctDescripcion;
    private javax.swing.JTextField ctExistencia;
    private javax.swing.JTextField ctPrecio;
    private javax.swing.JTextField ctidProducto;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JMenuBar mbMenu;
    private javax.swing.JMenu menuSalir;
    private javax.swing.JTable tbProductos;
    // End of variables declaration//GEN-END:variables
}
