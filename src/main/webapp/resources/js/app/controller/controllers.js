angular.module('boothApp')

    .controller('formController', function ($scope) {

        // we will store all of our form data in this object
        $scope.formData = {};

        // function to process the form
        $scope.processForm = function () {
            alert('awesome!');
        };

    })

    .controller('BoothController', function ($scope) {

        // we will store all of our form data in this object
        $scope.formData = {};

        // function to process the form
        $scope.processForm = function () {
            alert('awesome booth!');
        };

    })


    .controller('PersonalityController', ['$scope', '$stateParams', 'personalityService', function($scope, $stateParams, personalityService) {

        // we will store all of our form data in this object
        $scope.formData = {};
        $scope.personalityResponse = {};

        // function to process the form
        //$scope.processPersonalityForm = personalityService.getPersonalityTraits($scope.formData);
        $scope.processPersonalityForm = function () {
            alert("processPersonalityForm");
            return personalityService.getPersonalityTraits($scope.formData);
        }
        //    alert('awesome booth!');
        //    $http({
        //        method: 'POST',
        //        url: '/personality',
        //        data: $scope.formData
        //    })
        //        .success(function (data) {
        //            alert('success!' + data);
        //
        //            $scope.personalityResponse = data;
        //            alert($scope.personalityResponse)
        //        })
        //        .error(function (data) {
        //            alert('error!' + data);
        //            $scope.personalityResponse = data;
        //        });
        //
        //    //$state.go('home.user');
        //
        //};

        $scope.hideFormHeader = function () {
            document.getElementById("demo").innerHTML = "Paragraph changed.";
            document.getElementById("form-container").style.display = 'none'
            //$location.path(".pq1"); // path not hash

        };
        //}]);
        //
    }]);