/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
angular.module('myApp', []).controller('CustomerCtrl', function($scope, $http) {
        $http.get('/api/customer').success(function(data) {
            $scope.customers = data;
        });
});
