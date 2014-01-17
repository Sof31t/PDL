
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
        </div>
        <div class="row">
            <form role="normalize" action="response.jsp">
                <div class="panel panel-default">
                    <div class="panel-heading">Name</div>
                    <div class="panel-body">
                        <input type="text" class="form-control input-sm" placeholder="Type name..." name="name" id="name">
                    </div>
                    <div class="panel-heading">Phone</div>
                    <div class="panel-body">
                        <input type="text" class="form-control input-sm" placeholder="Type phone..." name="phone" id="phone">
                    </div>
                </div>
                <button class="btn btn-default pull-right" type="submit"><i class="glyphicon glyphicon-search"></i></button>
            </form>
        </div>
    </div>



</body>
</html>
