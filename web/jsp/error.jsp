

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Error !!!!</title>
    </head>
    <body>
        <%
            String error=(String)request.getSession().getAttribute("error");
        %>
        <h1>Ha ocurrido un error !!!</h1>
        <h2> <%=error%> </h2>
        
    </body>
</html>
