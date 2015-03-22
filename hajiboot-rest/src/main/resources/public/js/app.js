'use strict';

/* App Module */

var crudApp = angular.module('crudApp', [
    'ngRoute',
    'customerControllers'
]);

crudApp.config(['$routeProvider',
    function($routeProvider) {
        $routeProvider.when('/index.html', {
            templateUrl: 'list.html',
            controller: 'CustomerCtrl'
        }).when('/:id', {
            templateUrl: '/detail.html',
            controller: 'CustomerDetailCtrl'
        }).otherwise({
            redirectTo: '/index.html'
        });
    }]);
