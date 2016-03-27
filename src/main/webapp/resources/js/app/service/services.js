angular.module('boothApp')
    .service('personalityService', function($http) {
        this.traits = null;
        //this.getPersonalityTraits = function(data){
        //    //alert('awesome booth!');
        //    $http({
        //        method: 'POST',
        //        url: '/personality',
        //        data: data
        //    })
        //        .success(function (data) {
        //            this.traits =  data;
        //            alert('success!' + this.traits);
        //        })
        //        .error(function (data) {
        //            this.traits =  data;
        //            alert('error!' + this.traits);
        //        });
        //};

        //var personalityTraits = {
        //    method: 'POST',
        //    url: '/personality',
        //    data: data
        //};

        //this.getHttpReq = function(data) {
        //    return {
        //        method: 'POST',
        //        url: '/personality',
        //        data: data
        //    };
        //}

        var personalityService = {
            async: function(data) {
                // $http returns a promise, which has a then function, which also returns a promise
                var promise = $http.post('/personality', data).then(function (response) {
                    // The then function here is an opportunity to modify the response
                    console.log(response);
                    // The return value gets picked up by the then in the controller.
                    return response.data;
                });
                // Return the promise to the controller
                return promise;
            }
        };
        return personalityService;



        //this.getPersonality = function(){
        //    return $resource(baseURL+"personality/", null, {'add':{method:'POST' }});
        //};

    });