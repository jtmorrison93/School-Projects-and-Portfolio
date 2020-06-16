//import { urlencoded } from "express";

var app = angular.module('studentsApp', ['ngRoute']);

app.config(function($routeProvider) {
        $routeProvider
            .when('/', {
                templateUrl : 'partials/all_students.html',
                controller : 'allCtrl'
            })
            .when('/all_students', {
                templateUrl : 'partials/all_students.html',
                controller : 'allCtrl' 
            })
            .when('/add_student', {
                templateUrl : 'partials/add_student.html',
                controller : 'addCtrl' 
            })
            .when('/edit_student', {
                templateUrl : 'partials/edit_student.html',
                controller : 'editCtrl' 
            })
            .otherwise ({
                redirectTo: 'partials/all_students.html'
        });
});

app.controller('allCtrl', function($scope, $http) {
    $http.get("/showAll")
        .then(function (response) {
            $scope.students = response.data;
        });
});

app.controller('addCtrl', function($scope, $http) {

    $scope.addStudent = function() {      // add a student
        var info = {
            sid : $scope.sid,       // set up data object
            first_name : $scope.firstname,
            last_name : $scope.lastname,
            major : $scope.major
        }

        url = "/addStudent"

        $http.post(url, info)         // post the object data
            .then(function (response) {
                 $scope.status = response.data;   //print status of request

           // clear textboxes
           $scope.sid = "";
           $scope.firstname = "";
           $scope.lastname = "";
        });
    };
});

app.controller('editCtrl', function($scope, $http) {

$scope.getOne = function() {
    var getOneSid = $scope.sid;
    $http.get("/getOne?sid=" + getOneSid).then(function (response) {
        $scope.student = response.data
        
    });
};
$scope.updateRecord = function() {
    var student = $scope.student;
    
    var info = {
        sid : student.sid,
        major: student.major,
        midterm : student.midterm,
        final : student.final
    } 
    
    $http.post("/updateStudent", info).then(function (response) {
        $scope.student = response.data;

        $scope.student = {};
        $scope.sid = '';
    });
}
});
