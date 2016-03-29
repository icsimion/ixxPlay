angular.module('boothApp', ['ngAnimate', 'ui.router'])

    // configuring our routes
    // =============================================================================
    .config(function($stateProvider, $urlRouterProvider) {

        $stateProvider
         // route for the home page
            .state('app', {
                url:'/',
                views: {
                    'header': {
                        templateUrl : 'resources/template/header.html'
                    },
                    'content': {
                        templateUrl : 'resources/template/booth.html',
                        controller  : 'BoothController'
                    },
                    'carousel': {
                        templateUrl : 'resources/template/carousel.html',
                    },
                    'footer': {
                        templateUrl : 'resources/template/footer.html'
                    }
                }
            })

            .state('app.info', {
                url:'info',
                views: {
                    'content@': {
                        templateUrl: 'resources/template/info.html'
                    }
                }
            })

            .state('app.play', {
                url:'play',
                views: {
                    'content@': {
                        templateUrl: 'resources/template/play.html'
                    }
                }
            })

            .state('app.play.pers', {
                url:'pers',
                views: {
                    'content@': {
                        templateUrl: 'resources/template/play/personality-form.html',
                        controller  : 'PersonalityController'
                    }
                }
            })

            // nested states
            // each of these sections will have their own view
            // url will be nested (app.play.pers)
            .state('app.play.pers.pq1', {
                url: '/pq1',
                templateUrl: 'resources/template/play/personality-q1.html'
            })

            .state('app.play.pers.pq2', {
                url: '/pq2',
                templateUrl: 'resources/template/play/personality-q2.html'
            })

            .state('app.play.pers.pq3', {
                url: '/pq3',
                templateUrl: 'resources/template/play/personality-q3.html'
            })

            .state('app.play.pers.pq4', {
                url: '/pq4',
                templateUrl: 'resources/template/play/personality-q4.html'
            })

            .state('app.play.pers.pq5', {
                url: '/pq5',
                templateUrl: 'resources/template/play/personality-q5.html'
            })

            .state('app.play.pers.pq6', {
                url: '/pq6',
                templateUrl: 'resources/template/play/personality-q6.html'
            })

            .state('app.play.pers.pq7', {
                url: '/pq7',
                templateUrl: 'resources/template/play/personality-q7.html'
            })

            .state('app.play.pers.pq8', {
                url: '/pq8',
                templateUrl: 'resources/template/play/personality-q8.html'
            })

            .state('app.play.pers.pq9', {
                url: '/pq9',
                templateUrl: 'resources/template/play/personality-q9.html'
            })

            .state('app.play.pers.pq10', {
                url: '/pq10',
                templateUrl: 'resources/template/play/personality-q10.html'
            })

            .state('app.play.pers.pq11', {
                url: '/pq11',
                templateUrl: 'resources/template/play/personality-q11.html'
            })

            .state('app.play.pers.pq12', {
                url: '/pq12',
                templateUrl: 'resources/template/play/personality-q12.html'
            })

            .state('app.play.pers.submit', {
                url: '/submit',
                templateUrl: 'resources/template/play/personality-submit.html'
            })

        // catch all route
        // send users to the form page
        $urlRouterProvider.otherwise('/');
    });
