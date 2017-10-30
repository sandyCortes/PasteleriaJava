import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import java.sql.*;
import java.util.ArrayList;
import java.util.Calendar;

public class PracticaOct extends javax.swing.JFrame {
    private String titulos[] = {"Producto","Cantidad","Precio","Subtotal"};
    private String datos[][] = new String[4][4];
    private int cantidadProductos = 0;
    private float total=0;
    private String fecha;
    private Connection c = Coneccion.conexion();
    private String nombreP; 
    private int cantidad;
    private ArrayList<String> nombre= new ArrayList<>();
    private ArrayList<Integer> cant= new ArrayList<>();
    private ArrayList<Float> subT= new ArrayList<>();
    
    public PracticaOct() {
        initComponents();
        nombreP= "";
        cantidad = 0;
        cbxProducto = Coneccion.llenaCombo("select descripcion from producto where tipo = 1", cbxProducto);
       // cbxCantidad = Coneccion.llenaCombo("select existencia from producto where tipo = 1", cbxCantidad);
       Calendar c = Calendar.getInstance();
       fecha = Integer.toString(c.get(Calendar.DATE));
       fecha += "/"+Integer.toString(c.get(Calendar.MONTH));
       fecha += "/"+Integer.toString(c.get(Calendar.YEAR));
        System.out.println(fecha);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbxProducto = new javax.swing.JComboBox<>();
        cbxCantidad = new javax.swing.JComboBox<>();
        btnAgregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaContedido = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jlbTotal = new javax.swing.JLabel();
        btnComprar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Producto: ");

        jLabel2.setText("Cantidad: ");

        cbxProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxProductoActionPerformed(evt);
            }
        });

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        tablaContedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Producto", "Cantidad", "Precio", "Subtotal"
            }
        ));
        jScrollPane1.setViewportView(tablaContedido);

        jLabel3.setText("Total: ");

        jlbTotal.setText("0");

        btnComprar.setText("Comprar");
        btnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(btnComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 198, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jlbTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbxProducto, 0, 231, Short.MAX_VALUE)
                            .addComponent(cbxCantidad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(54, 54, 54)
                        .addComponent(btnAgregar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(45, 45, 45))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(cbxProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnAgregar)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbxCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbTotal)
                    .addComponent(jLabel3)
                    .addComponent(btnComprar))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        datos[cantidadProductos][0] = cbxProducto.getSelectedItem().toString();
        datos[cantidadProductos][1] = cbxCantidad.getSelectedItem().toString();
        String query = "select precio from producto where descripcion = ?";
        int d=0;
        float precio =0, subtotal =0;
        
        try {
            Connection c = Coneccion.conexion();
            PreparedStatement ps = c.prepareStatement(query);
            ps.setString(1, cbxProducto.getSelectedItem().toString());
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                precio = rs.getFloat(1);
                
            } else
                precio =0;
            
            subtotal = Integer.parseInt(cbxCantidad.getSelectedItem().toString())
                    *precio ;
            datos[cantidadProductos][2] = ""+precio;
            datos[cantidadProductos][3] = ""+subtotal;
            cantidadProductos++;
            
                total += subtotal;
                jlbTotal.setText(total+"");
                tablaContedido = new JTable(datos,titulos);
                jScrollPane1.setViewportView(tablaContedido);
                
                nombre.add(cbxProducto.getSelectedItem().toString());
                d = Integer.parseInt(cbxCantidad.getSelectedItem().toString());
                cant.add(d);
                subT.add(total);
                
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al llenar tabla: "+e.getMessage());
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void cbxProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxProductoActionPerformed
        String producto = "";
        int cantidad=0;
        if(cbxProducto.getSelectedIndex() > 0){
            producto = cbxProducto.getSelectedItem().toString();
            try {
                Connection c = Coneccion.conexion();
                PreparedStatement ps = c.prepareStatement("select existencia "
                        + "from producto where descripcion = ?");
                ps.setString(1, producto);
                ResultSet rs= ps.executeQuery();
                if(rs.next()){
                    cbxCantidad.removeAllItems();
                    cantidad = rs.getInt(1);
                    for(int i=1; i< cantidad; i++)
                        cbxCantidad.addItem(i+"");
                }else 
                    cbxCantidad.addItem(0+"");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
            }
        }
    }//GEN-LAST:event_cbxProductoActionPerformed

    private void btnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarActionPerformed
        
        //Espera();
        //Pro2();
    }//GEN-LAST:event_btnComprarActionPerformed

    public void ClaseEstela(){
        try {
            CallableStatement cs = null;
            for(int i=0;i < tablaContedido.getRowCount(); i++){
                try {
                    cs = c.prepareCall("{Call dbo.AltaVenta(?,?,?,?,?)}");
                    cs.setDouble(1,total);
                    //cs.setString(2,tablaContedido.getRowCount(0,1));
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getLocalizedMessage());
                }
            }
        } catch (Exception e) {
        }
    }
    
    public void Pro2(){
        if(c != null){
            try {
                CallableStatement cs = c.prepareCall
                                ("{Call dbo.AgregaDetalle(?,?,?)}");
                for(int i=0;i<nombre.size();i++){
                    cs.setString(1, nombre.get(i));
                    cs.setInt(2,cant.get(i) );
                    cs.setFloat(3,subT.get(i));
                    cs.execute();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error: "
                        +e.getMessage());
            }
            nombre.clear();
            cant.clear();
            subT.clear();
        }
    }
    
    public void Espera(){
        if(c != null){
            try {
               CallableStatement cs = c.prepareCall
                            ("{Call dbo.AgregaVentas(?,?)}");
               cs.setString(1, fecha);
               cs.setFloat(2, total);
               cs.execute();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
            }
        }else
            JOptionPane.showMessageDialog(null, "Error de conexion");
    }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PracticaOct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnComprar;
    private javax.swing.JComboBox<String> cbxCantidad;
    private javax.swing.JComboBox<String> cbxProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlbTotal;
    private javax.swing.JTable tablaContedido;
    // End of variables declaration//GEN-END:variables
}
