var resApp = angular.module('resApp', ['ui.router', 'ngAnimate', 'ui.bootstrap']);

resApp.config(function ($stateProvider, $urlRouterProvider) {
    $urlRouterProvider.otherwise('/login');

    $stateProvider
        .state('login', {
            url: '/login',
            templateUrl: 'views/login.html',
            controller: 'loginController'
        })
        .state('tables', {
            url: '/tables',
            templateUrl: 'views/tables.html'
        })
        .state('tables.reservations', {
            url: '/reservations',
            templateUrl: 'views/reservations.html',
            controller: 'resController'
        });
});