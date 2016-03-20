// app.js
// create our angular app and inject ngAnimate and ui-router
// =============================================================================
angular.module('boothApp', ['ngAnimate', 'ui.router'])

    // configuring our routes
    // =============================================================================
    .config(function($stateProvider, $urlRouterProvider) {

        $stateProvider

        // route to show our basic form (/form)
            .state('form', {
                url: '/form',
                templateUrl: 'WEB-INF/static/views/form.html',
                controller: 'formController'
            })

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
            // url will be nested (/form/profile)
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

            .state('app.play.pers.submit', {
                url: '/submit',
                templateUrl: 'resources/template/play/personality-submit.html'
            })

            .state('form.profile', {
                url: '/profile',
                templateUrl: 'resources/template/form-profile.html'
            })

            // url will be /form/interests
            .state('form.interests', {
                url: '/interests',
                templateUrl: 'resources/template/form-interests.html'
            })

            // url will be /form/payment
            .state('form.payment', {
                url: '/payment',
                templateUrl: 'resources/template/form-payment.html'
            });

        // catch all route
        // send users to the form page
        //$urlRouterProvider.otherwise('/form/profile');
        $urlRouterProvider.otherwise('/');
    });

    // our controller for the form
    // =============================================================================
    //.controller('formController', function($scope) {
    //
    //    // we will store all of our form data in this object
    //    $scope.formData = {};
    //
    //    // function to process the form
    //    $scope.processForm = function() {
    //        alert('awesome!');
    //    };
    //
    //});