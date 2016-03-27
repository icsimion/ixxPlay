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
    }]);