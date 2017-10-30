import java.sql.*;
import javax.swing.JComboBox;
public class Coneccion {
    
    public static Connection conexion(){
        Connection c = null;
        try{
              Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            c = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;"
                    + "databasename=Pasteleria","sa","sasa");
            //System.out.printf("conexion exitosa");
            return c;//jdbc:derby://localhost:1527/sample
        }catch(Exception e){
            System.err.println("error en guardar" + e.getMessage());
            return null;
        }
    }
    
    public static JComboBox llenaCombo(String query,JComboBox selector){
        selector.removeAllItems();
        Connection c = conexion();
        if(c != null){
            try{
                PreparedStatement ps =c.prepareStatement(query);
                ResultSet rs=ps.executeQuery();
                if(rs.next()){
                    do{
                        //Llena el selector
                        selector.addItem(rs.getString(1));
                    }while(rs.next());
                    return selector;
                } else{
                    System.out.println("No hay datos");
                    return null;
                }
            } catch(Exception e){
                System.out.println("Error de combo"+e.getMessage());
                return null;
            }
        } else{
            System.out.println("No hay conexión");
        }
        return null;
  }
}
