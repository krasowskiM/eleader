resApp.controller('tableController', function ($scope, $http) {
    $scope.title = 'List of tables';
    $scope.tableList = [[1, 'newTable'], [2, 'newTable'], [3, 'newTable'], [4, 'newTable'], [5, 'newTable']];

    $scope.getTables = function () {
        $http.get("/tables", function (data) {

        });
    }
});