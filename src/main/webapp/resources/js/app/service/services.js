angular.module('boothApp')
    .service('personalityService', function($http) {
        var personalityService = {
            async: function(data) {
                // $http returns a promise, which has a then function, which also returns a promise
                var promise = $http.post('personality', data).then(function (response) {
                    return response.data;
                });
                // Return the promise to the controller
                return promise;
            }
        };
        return personalityService;
    })

    .service('game1Service', function($http) {
        var game1Service = {
            async: function(data) {
                // $http returns a promise, which has a then function, which also returns a promise
                var promise = $http.post('game1', data).then(function (response) {
                    return response.data;
                });
                // Return the promise to the controller
                return promise;
            }
        };
        return game1Service;
    })

    .service('game2Service', function($http) {
        var game2Service = {
            async: function(data) {
                // $http returns a promise, which has a then function, which also returns a promise
                var promise = $http.post('game2', data).then(function (response) {
                    return response.data;
                });
                // Return the promise to the controller
                return promise;
            }
        };
        return game2Service;
    });