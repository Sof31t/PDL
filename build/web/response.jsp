<%@page import="name.*" %>
<%@page import="phone.*" %>
<%@page import="custcorrecter.*" %>
<%@page import="emailCorrect.*" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="style.css">
        <link rel="stylesheet" href="assets/css/bootstrap.min.css">
        <link rel="stylesheet" href="assets/css/bootstrap-theme.min.css">
        <link rel="stylesheet" href="assets/css/style.css">
        <script src="assets/js/bootstrap.min.js"></script>
        <title>DQM result</title>
    </head>
    <body>
        <% NameCorrecter name = new NameCorrecter(new String(request.getParameter("name").getBytes("iso-8859-1"), "UTF-8")); %>
        <% PhoneCorrecter phone = new PhoneCorrecter(new String(request.getParameter("phone").getBytes("iso-8859-1"), "UTF-8")); %>
        <% addressCorrecter correcter = new addressCorrecter();%>
        <% emailCorrecter ecorrecter = new emailCorrecter();%>
        <div class="container ">
            <div class="row well">
            </div>
            <div class="row">
                <div class="panel panel-default">
                    <div class="panel-heading">Normalized name</div>
                    <div class="panel-body">
                        <p><% out.println(name.getString());%></p>
                    </div>
                    <div class="panel-heading">Normalized phone</div>
                    <div class="panel-body">
                        <p>National: <% out.println(phone.getNational());%>  / International: <% out.println(phone.getInternational());%> / Country: <% out.println(phone.getCountry());%></p>
                    </div>
                    <div class="panel-heading">Normalized Address</div>
                    <div class="panel-body">
                        <p>National: <% out.println(correcter.correctAddress(new String(request.getParameter("address").getBytes("iso-8859-1"), "UTF-8")));%>  </p>
                    </div>
                    <div class="panel-heading">Normalized Email</div>
                    <div class="panel-body">
                        <p>National: <% out.println(ecorrecter.CorrectEmail(new String(request.getParameter("email").getBytes("iso-8859-1"), "UTF-8")));%>  </p>
                    </div>
                </div>
            </div>
        </div>


    </body>
</html>
