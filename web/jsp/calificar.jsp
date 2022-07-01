

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Calificando</title>
</head>

<body>
    <jsp:useBean id="cal" class="Negocio.Calificacion" />
    <jsp:setProperty name="cal" property="*" />

    <h1>Sus resultados fueron:</h1>

    <p>

        <%=cal.toString() %>
    </p>
    <p>
        Descripción de sus notas:
        <%= cal.getCalificacion() %>
    </p>

    <p>

        Cadena para mostrar datos en google:
        <%=cal.getDatosGoogle()%>
    </p>

    <div id="piechart" style="width: 900px; height: 500px;"></div>


    <script type="text/javascript">
        google.charts.load('current', { 'packages': ['corechart'] });
        google.charts.setOnLoadCallback(drawChart);

        function drawChart() {

            var data = google.visualization.arrayToDataTable([
         <%= cal.getDatosGoogle() %>
        ]);

            var options = {
                title: 'Mis resultados de calificación'
            };

            var chart = new google.visualization.PieChart(document.getElementById('piechart'));

            chart.draw(data, options);
        }
    </script>



</body>

</html>