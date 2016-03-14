<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<body ng-app="formApp">

    <nav class="navbar navbar-inverse navbar-fixed-top">
        <div class="container">
            <div class="navbar-header">
                <a class="navbar-brand" href="#">Project Name</a>
            </div>
        </div>
    </nav>

    <div class="jumbotron">
        <div class="container">
            <h1>${title}</h1>
            <p>
                <c:if test="${not empty msg}">
                    Hello ${msg}
                </c:if>

                <c:if test="${empty msg}">
                    Welcome Welcome!
                </c:if>
            </p>
            <p>
                <a class="btn btn-primary btn-lg"
                   href="#" role="button">Learn more</a>
            </p>
        </div>
    </div>


    <div class="container">

        <!-- views will be injected here -->
        <div ui-view></div>

    </div>

</body>

<!-- apply our angular app -->
<head>
    <title>Gradle + Spring MVC</title>

    <!-- CSS -->
    <spring:url value="/resources/css/app/style.css" var="styleCss"/>
    <spring:url value="/resources/css/core/bootstrap.css" var="bootstrapCss"/>
    <link href="${styleCss}" rel="stylesheet"/>
    <link href="${bootstrapCss}" rel="stylesheet"/>

    <%--<link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootswatch/3.1.1/darkly/bootstrap.min.css">--%>

    <!-- JS -->
    <!-- load angular, nganimate, and ui-router -->
    <spring:url value="/resources/js/core/angular.js" var="angJs" />
    <spring:url value="/resources/js/core/angular-ui-router.js" var="angUiRouterJs" />
    <spring:url value="/resources/js/core/angular-animate.js" var="angAnimateJs" />

    <spring:url value="/resources/js/app/app.js" var="appJs" />

    <script src="${angJs}"></script>
    <script src="${angUiRouterJs}"></script>
    <script src="${angAnimateJs}"></script>

    <script src="${appJs}"></script>

</head>
</html>

