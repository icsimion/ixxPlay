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


    //.controller('PersonalityController', ['$scope', '$stateParams', 'personalityFactory', function($scope, $stateParams, personalityFactory) {
    //    var hideFormHeaderFunction = personalityFactory.hideFormHeader();
    //    $scope.hideFormHeaderFunction = hideFormHeaderFunction;
    //}])
    //
    .controller('PersonalityController', function ($scope, $location, $http) {

        // we will store all of our form data in this object
        $scope.formData = {};
        $scope.personalityResponse = {};

        // function to process the form
        $scope.processPersonalityForm = function () {
            alert('awesome booth!');
            $http({
                method: 'POST',
                url: '/personality',
                data: $scope.formData
            })
                .success(function (data) {
                    alert('success!' + data);

                    $scope.personalityResponse = data;
                    alert($scope.personalityResponse)
                })
                .error(function (data) {
                    alert('error!' + data);
                    $scope.personalityResponse = data;
                });

            //$state.go('home.user');

        };

        $scope.hideFormHeader = function () {
            document.getElementById("demo").innerHTML = "Paragraph changed.";
            document.getElementById("form-container").style.display = 'none'
            //$location.path(".pq1"); // path not hash

        };
        //}]);
        //
    });