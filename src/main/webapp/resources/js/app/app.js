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

            .state('app.info.jobs', {
                url:'jobs',
                views: {
                    'content@': {
                        templateUrl: 'resources/template/info/jobs.html'
                    }
                }
            })

            .state('app.info.jobs.job1', {
                url: '/job1',
                templateUrl: 'resources/template/info/jobs-1.html'
            })

            .state('app.info.jobs.job2', {
                url: '/job2',
                templateUrl: 'resources/template/info/jobs-2.html'
            })

            .state('app.info.jobs.job3', {
                url: '/job3',
                templateUrl: 'resources/template/info/jobs-3.html'
            })

            .state('app.info.jobs.job4', {
                url: '/job42',
                templateUrl: 'resources/template/info/jobs-4.html'
            })

            .state('app.info.jobs.job5', {
                url: '/job5',
                templateUrl: 'resources/template/info/jobs-5.html'
            })

            .state('app.info.jobs.job6', {
                url: '/job6',
                templateUrl: 'resources/template/info/jobs-6.html'
            })

            .state('app.info.jobs.job7', {
                url: '/job7',
                templateUrl: 'resources/template/info/jobs-7.html'
            })

            .state('app.info.about', {
                url:'about',
                views: {
                    'content@': {
                        templateUrl: 'resources/template/info/about.html'
                    }
                }
            })

            .state('app.info.about.about1', {
                url: '/about1',
                templateUrl: 'resources/template/info/about-1.html'
            })

            .state('app.info.about.about2', {
                url: '/about2',
                templateUrl: 'resources/template/info/about-2.html'
            })

            .state('app.info.about.about3', {
                url: '/about3',
                templateUrl: 'resources/template/info/about-3.html'
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

            //game 1
            .state('app.play.game1', {
                url:'game1',
                views: {
                    'content@': {
                        templateUrl: 'resources/template/play/game1-form.html',
                        controller  : 'Game1Controller'
                    }
                }
            })

            .state('app.play.game1.gq1', {
                url: '/g1q1',
                templateUrl: 'resources/template/play/game1-q.html'
            })

            .state('app.play.game1.submit', {
                url: '/submit',
                templateUrl: 'resources/template/play/game1-submit.html'
            })

            //game 2
            .state('app.play.game2', {
                url:'game2',
                views: {
                    'content@': {
                        templateUrl: 'resources/template/play/game2-form.html',
                        controller  : 'Game2Controller'
                    }
                }
            })

            .state('app.play.game2.gq2', {
                url: '/g2q1',
                templateUrl: 'resources/template/play/game2-q.html'
            })

            .state('app.play.game2.submit', {
                url: '/submit',
                templateUrl: 'resources/template/play/game2-submit.html'
            })

        // catch all route
        // send users to the form page
        $urlRouterProvider.otherwise('/');
    });
