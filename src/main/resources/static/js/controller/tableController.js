resApp.controller('tableController', function ($scope, $http) {
    $scope.title = 'List of tables';
    $scope.tableList = [[1, 'newTable'], [2, 'newTable'], [3, 'newTable'], [4, 'newTable'], [5, 'newTable']];

    //w jaki sposób chciałbym obsłużyć wysłanie zapytania do serwera oraz wypełnienie listy danymi
    //w funkcji z parametrem "response" załadować do listy dane zawarte w obiekcie response.data
    //np $scope.tables = response.data
    $scope.getTables = function () {
        $http.get("/tables", function (response) {

        });
    }
});