
<%@page isErrorPage="true" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%--
    Pagina de error/ si el url no exite, se muestra esta pagina
--%>
<%! 
    
    int contador = 0; 
    
    String cadena1 = "Holi";
  
    int suma(int num1, int num2){

        return (num1 + num2);
    }
%>


<%
    
    String cadena = "Hola mundo";
    contador++;
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>
