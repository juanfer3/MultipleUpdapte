/**
 *
 * @author Juan
 */
package Modelo;



import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class BDLibros {
    public boolean updateMultiple(String autor,String comentario, String condicion){
    
        try {
            String sql;
            int r=0;
            sql="UPDATE libros SET autor='"+autor+"',comentario='"+comentario+"' WHERE autor='"+condicion+"';";
            ConexionBD conbd=new ConexionBD();
            Connection con=conbd.conectar();
            
            Statement st= con.createStatement();
             r= st.executeUpdate(sql);
            
            if(r!=0){
                  
                conbd.cierraConexion();
               return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(modeloLibros.class.getName()).log(Level.SEVERE, null, ex);
         
        }
        System.out.println("Fallo en el update");
        return false;
           
    }
    
    
public ArrayList<Libros> Listar() {
        ArrayList<Libros> Listar = new ArrayList();
        Listar.clear();
        ResultSet rs = null;
        String sql = "select * from libros";
        ConexionBD bd = new ConexionBD();
        Connection con = bd.conectar();

        try {
            Statement st = con.createStatement();
            rs = st.executeQuery(sql);

            while (rs.next()) {
               Libros book=new Libros();
               book.setTitulo(rs.getString("titulo"));
               book.setAutor(rs.getString("autor"));
               book.setComentario(rs.getString("comentario"));
              
               Listar.add(book);
                
            }
            bd.cierraConexion();
        } catch (SQLException ex) {
            Logger.getLogger(modeloLibros.class.getName()).log(Level.SEVERE, null, ex);
        }

        return Listar;
    }
}
