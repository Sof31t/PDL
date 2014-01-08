
<%-- 
    Document   : index
    Created on : 23 nov. 2013, 19:38:44
    Author     : sofiene
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="style.css">
        <link rel="stylesheet" href="assets/css/bootstrap.min.css">
        <link rel="stylesheet" href="assets/css/bootstrap-theme.min.css">
        <script src="assets/js/bootstrap.min.js"></script>
        <title>DQM</title>
    </head>
<body>
    <div class="container ">
        <div class="row well" id="parent">
            <!--<img class="left" src="assets/images/google.png">-->
            <form class="navbar-form navbar-right" role="search" action="response.jsp">
                <div class="form-group">
                    <input type="text" class="form-control " placeholder="Search" name="Search" id="Search">
                </div>
                <button class="btn btn-default" type="submit"><i class="glyphicon glyphicon-search"></i></button>
            </form>
        </div>
    </div>

</body>
</html>
