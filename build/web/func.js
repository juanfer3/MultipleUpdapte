$(document).ready(function () {
   


    $('#myBoton').click(function () {
        var autor=$('#autor').val();
        var comentario=$('#comentario').val();
        var condicion=$('#condicion').val();
        var data={
            autor:autor,
            comentario:comentario,
            condicion:condicion
          };
         
        $.ajax({
            url:'updateMultiple',
            type: "POST",
            data: data,
            success: function (data){
        $('#autor').val("");
        $('#comentario').val("");
        $('#condicion').val("");
                $("#Lista").load('Lista.jsp',  function () {

        });
                
            }
        });
        
    });


    

});

