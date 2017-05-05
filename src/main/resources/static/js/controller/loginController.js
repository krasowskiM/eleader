resApp.controller('loginController', function ($scope, $state, $http) {
    $scope.notLoggedIn = true;
    $scope.login = function () {

        $scope.notLoggedIn = false;
        $state.go('tables');
    };
});