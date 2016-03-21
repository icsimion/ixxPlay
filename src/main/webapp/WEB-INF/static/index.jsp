<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Ixxus Booth</title>

</head>

<body ng-app="boothApp">

    <%--<nav class="navbar navbar-inverse navbar-fixed-top">--%>
        <%--<div class="container">--%>
            <%--<div class="navbar-header">--%>
                <%--<a class="navbar-brand" href="#">Project Name</a>--%>
            <%--</div>--%>
        <%--</div>--%>
    <%--</nav>--%>

    <%--<div class="jumbotron">--%>
        <%--<div class="container">--%>
            <%--<h1>${title}</h1>--%>
            <%--<p>--%>
                <%--<c:if test="${not empty msg}">--%>
                    <%--Hello ${msg}--%>
                <%--</c:if>--%>

                <%--<c:if test="${empty msg}">--%>
                    <%--Welcome Welcome!--%>
                <%--</c:if>--%>
            <%--</p>--%>
            <%--<p>--%>
                <%--<a class="btn btn-primary btn-lg"--%>
                   <%--href="#" role="button">Learn more</a>--%>
            <%--</p>--%>
        <%--</div>--%>
    <%--</div>--%>

    <div ui-view="header"></div>
    <div class="content-frame" ui-view="content"></div>
    <div ui-view="footer"></div>

    <!-- views will be injected here -->
    <%--<div ui-view></div>--%>

    <!-- apply our angular app -->
    <!-- CSS -->
    <spring:url value="/resources/css/app/style.css" var="styleCss"/>
    <spring:url value="/resources/css/core/bootstrap.css" var="bootstrapCss"/>
    <spring:url value="/resources/css/core/bootstrap-social.css" var="bootstrapSocialCss"/>
    <spring:url value="/resources/css/core/font-awesome.css" var="fontAwesomeCss"/>
    <link href="${styleCss}" rel="stylesheet"/>
    <link href="${bootstrapCss}" rel="stylesheet"/>
    <link href="${bootstrapSocialCss}" rel="stylesheet"/>
    <link href="${fontAwesomeCss}" rel="stylesheet"/>

    <!-- JS -->
    <!-- load angular, nganimate, and ui-router -->
    <spring:url value="/resources/js/core/angular.js" var="angJs" />
    <spring:url value="/resources/js/core/angular-ui-router.js" var="angUiRouterJs" />
    <spring:url value="/resources/js/core/angular-animate.js" var="angAnimateJs" />

    <script src="${angJs}"></script>
    <script src="${angUiRouterJs}"></script>
    <script src="${angAnimateJs}"></script>

    <spring:url value="/resources/js/app/app.js" var="appJs" />
    <spring:url value="/resources/js/app/controller/controllers.js" var="controllersJs" />
    <spring:url value="/resources/js/app/service/services.js" var="servicesJs" />

    <script src="${appJs}"></script>
    <script src="${controllersJs}"></script>
    <script src="${servicesJs}"></script>


</body>

</html>

