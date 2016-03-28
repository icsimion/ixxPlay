<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Ixxus Booth</title>

</head>

<body ng-app="boothApp">

    <div class="booth-header">
        <div ui-view="header"></div>
    </div>

    <div class="booth-content">
        <div class="content-frame" ui-view="content"></div>
    </div>

    <div id="ixxusCarousel" class="booth-carousel carousel slide" data-ride="carousel">
	    
	    <div class="carousel-inner" role="listbox">
		    <div class="item active">
		    	<h3 align="center">Slide 1 about IXXUS</h3>
		    </div>
		
		    <div class="item">
		    	<h3 align="center">Slide 2 about IXXUS</h3>
		    </div>
		    
		    <div class="item">
		    	<h3 align="center">Slide 3 about IXXUS</h3>
		    </div>
		
		    <div class="item">
		    	<h3 align="center">Slide 4 about IXXUS</h3>
		    </div>
	    </div>

    </div>


    <div class="booth-footer">
        <div ui-view="footer"></div>
    </div>

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
    <spring:url value="/resources/js/core/bootstrap.min.js" var="bootstrapMinJs" />
	<spring:url value="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js" var="jqueryURL" />
    
    <script src="${jqueryURL}"></script>
    <script src="${angJs}"></script>
    <script src="${angUiRouterJs}"></script>
    <script src="${angAnimateJs}"></script>
    <script src="${bootstrapMinJs}"></script>

    <spring:url value="/resources/js/app/app.js" var="appJs" />
    <spring:url value="/resources/js/app/controller/controllers.js" var="controllersJs" />
    <spring:url value="/resources/js/app/service/services.js" var="servicesJs" />

    <script src="${appJs}"></script>
    <script src="${controllersJs}"></script>
    <script src="${servicesJs}"></script>
</body>

</html>

