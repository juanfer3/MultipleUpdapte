<%-- 
    Document   : Lista
    Created on : 2/09/2017, 10:53:11 PM
    Author     : Juan
--%>


<%@page import="Modelo.Libros"%>
<%@page import="Modelo.BDLibros"%>
<%@page import="java.util.ArrayList"%>

<%
    ArrayList<Libros> Listar=new ArrayList();
    BDLibros libros= new BDLibros();
    Listar.clear();
    
    
%>
<script src="func.js"></script>
<div id="Lista">
                <table class="highlight">
                    <thead>
                        <tr>
                            <th>Nombre</th>
                            <th>Autor</th>
                            <th>Comentario</th>
                        </tr>
                    </thead>

                    <tbody>
                        <%Listar=libros.Listar();
                        for(Libros books: Listar){
                        %>
                        <tr>
                            <td><%=books.getTitulo()%></td>
                            <td><%=books.getAutor()%></td>
                            <td><%=books.getComentario()%></td>
                        </tr>
                        <%}%>
                    </tbody>
                </table>
                
                

            </div>
