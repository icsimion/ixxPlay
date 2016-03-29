angular.module('boothApp')

    .controller('BoothController', function ($scope) {
    })

    .controller('PersonalityController', ['$scope', '$http', '$stateParams', '$state', 'personalityService', function ($scope, $http, $stateParams, $state, personalityService) {

        // init form components visibility
        $scope.isShowPersonalityStart = true;
        $scope.isShowPersonalityForm = false;
        $scope.isShowPersonalitySubmit = true;
        $scope.isShowPersonalityResult = false;

        // we will store all of our form data in this object
        $scope.formData = {};
        $scope.personalityResponse = {};

        // function to process the form
        $scope.processPersonalityForm = function () {
            personalityService.async($scope.formData).then(function (d) {
                $scope.personalityResponse = d;
            });

        }

        $scope.startPersonalityForm = function () {
            $scope.isShowPersonalityStart = false;
            $scope.isShowPersonalityForm = true;
        };

        $scope.submitPersonalityForm = function () {
            $scope.isShowPersonalitySubmit = false;
            $scope.isShowPersonalityResult = true;
        };
    }])

    .controller('Game1Controller', ['$scope', '$http', '$stateParams', '$state', 'game1Service', function ($scope, $http, $stateParams, $state, game1Service) {

        // init form components visibility
        $scope.isShowGame1Start = true;
        $scope.isShowGame1Form = false;
        $scope.isShowGame1Submit = true;
        $scope.isShowGame1Result = false;

        // we will store all of our form data in this object
        $scope.formData = {};
        $scope.game1Response = {};

        // function to process the form
        $scope.processGame1Form = function () {
            game1Service.async($scope.formData).then(function (d) {
                $scope.game1Response = d;
            });

        }

        $scope.startGame1Form = function () {
            $scope.isShowGame1Start = false;
            $scope.isShowGame1Form = true;
        };

        $scope.submitGame1Form = function () {
            $scope.isShowGame1Submit = false;
            $scope.isShowGame1Result = true;
        };
    }])

    .controller('Game2Controller', ['$scope', '$http', '$stateParams', '$state', 'game2Service', function ($scope, $http, $stateParams, $state, game2Service) {

        // init form components visibility
        $scope.isShowGame2Start = true;
        $scope.isShowGame2Form = false;
        $scope.isShowGame2Submit = true;
        $scope.isShowGame2Result = false;

        // we will store all of our form data in this object
        $scope.formData = {};
        $scope.game2Response = {};

        // function to process the form
        $scope.processGame2Form = function () {
            game2Service.async($scope.formData).then(function (d) {
                $scope.game2Response = d;
            });

        }

        $scope.startGame2Form = function () {
            $scope.isShowGame2Start = false;
            $scope.isShowGame2Form = true;
        };

        $scope.submitGame2Form = function () {
            $scope.isShowGame2Submit = false;
            $scope.isShowGame2Result = true;
        };
    }]);