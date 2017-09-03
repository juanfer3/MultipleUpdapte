/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import static com.sun.corba.se.impl.util.Utility.printStackTrace;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import Modelo.Libros;

/**
 *
 * @author USUARIO
 */
public class modeloLibros {
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
            printStackTrace();
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
              
                return Listar;
            }
            bd.cierraConexion();
        } catch (SQLException ex) {
            Logger.getLogger(modeloLibros.class.getName()).log(Level.SEVERE, null, ex);
        }

        return Listar;
    }
}