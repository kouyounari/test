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
        }).when('/new', {
            templateUrl: '/new.html',
            controller: 'CustomerNewCtrl'
        }).when('/:id', {
            templateUrl: '/detail.html',
            controller: 'CustomerDetailCtrl'
        }).otherwise({
            redirectTo: '/index.html'
        });
    }]);
