resApp.controller('tableController', function ($scope, $http) {
    $scope.title = 'List of tables';
    $scope.tables = [];
    $scope.editPopover = {
        templateUrl: 'views/editpanel.html',
        title: 'Edit panel'
    };
    $scope.deletePopover = {
        templateUrl: 'views/deletepanel.html',
        title: 'Confirm deletion'
    };

    //w jaki sposób chciałbym obsłużyć wysłanie zapytania do serwera oraz wypełnienie listy danymi
    //w funkcji z parametrem "response" załadować do listy dane zawarte w obiekcie response.data
    //np $scope.tables = response.data
    $http.get("/tables").then(function (response) {
        $scope.tables = response.data.tables;
    });
});