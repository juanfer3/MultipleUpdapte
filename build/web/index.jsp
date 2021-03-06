<!DOCTYPE html>
<html>
    <head>
        <!--Import Google Icon Font-->
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <!--Import materialize.css-->
        <!-- Compiled and minified CSS -->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.1/css/materialize.min.css">
        <script type="text/javascript" src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
        <!-- Compiled and minified JavaScript -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.1/js/materialize.min.js"></script>


        <link rel="stylesheet" href="stilos.css">
        <script src="func.js"></script>

        <!--Let browser know website is optimized for mobile-->
        <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    </head>

    <body>



        <div class="container">
            <h1>Hola App!</h1>
            <div class="row">
                <form class="col s12" id="formulario">
                    <div class="row data" id="data1">
                        <div class="input-field col s6">
                            <input  id="autor" type="text" class="validate">
                            <label for="first_name">Autor</label>
                        </div>
                        <div class="input-field col s6">
                            <input id="comentario" type="text" class="validate">
                            <label for="last_name">Comentario</label>
                        </div>
                    </div>
                    <div class="row data" id="data1">
                        <h3>Condicion</h3>
                        <div class="input-field col s12">
                            
                            <input  id="condicion" type="text" class="validate">
                            <label for="first_name">Autor</label>
                        </div>
                        
                    </div>

                </form>

            </div>




            <a class="btn-floating btn-large waves-effect waves-light red myBoton" id="myBoton"><i class="material-icons">add</i></a>
            
            <%@include file="Lista.jsp" %>
        </div>  
        <!--Import jQuery before materialize.js-->
        <script type="text/javascript" src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.1/js/materialize.min.js"></script>
    </body>
</html>