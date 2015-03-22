'use strict';

/* Controllers */

var customerControllers = angular.module('customerControllers', []);

customerControllers.controller('CustomerCtrl', function($scope, $http) {
    $http.get('/api/customer').success(function(data) {
        $scope.customers = data;
    });
});
customerControllers.controller('CustomerDetailCtrl', function($scope, $http, $routeParams) {
    var sendId = $routeParams.id;
    $http.get('api/customer/' + sendId).success(function(data) {
        $scope.customer = data;
    });
});