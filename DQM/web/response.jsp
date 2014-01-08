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
        <title>Parser result</title>
    </head>
    <body>

        <div class="container ">
            <div class="row well">
                <div class="col-lg-6">
                    <span class="badge"></span>
                </div>
                <div class="col-lg-6" id="parent">
                    <form class="navbar-form navbar-right" role="search" action="response.jsp">
                        <div class="form-group">
                            <input type="text" class="form-control " placeholder="Search" name="Search" id="Search" value="<% out.println(request.getParameter("Search"));%>">
                        </div>
                        <button class="btn btn-default" type="submit"><i class="glyphicon glyphicon-search"></i></button>
                    </form>
                </div>
            </div>

        </div>


    </body>
</html>
