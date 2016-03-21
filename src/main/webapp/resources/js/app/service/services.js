angular.module('boothApp')
    .service('personalityService', function($http) {
        this.getPersonalityTraits = function(data){
            alert('awesome booth!');
            $http({
                method: 'POST',
                url: '/personality',
                data: data
            })
                .success(function (data) {
                    alert('success!' + data);
                    $scope.personalityResponse = data;
                })
                .error(function (data) {
                    alert('error!' + data);
                    $scope.personalityResponse = data;
                });

            //$state.go('home.user');

        };
    });