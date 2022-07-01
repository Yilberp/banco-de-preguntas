

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Presentando prueba</title>
    </head>
    <body>
        
        <%
        String preguntas=(String)request.getSession().getAttribute("preguntas");
        
        %>
        <h1>Por favor seleccione la respuesta correcta:</h1>
        
        <form name="calificar" action="./jsp/calificar.jsp">
          
            <%=preguntas %>
            
            <input type="submit" value="Calificar" name="crear" /> 
            
        </form>
    </body>
</html>
