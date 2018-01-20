(function () {
    var app = angular.module("demo", ["ngRoute"]);
    app.config(function ($routeProvider, $locationProvider) {
        $locationProvider.hashPrefix("");
        $routeProvider.when("/new", {
            templateUrl: "views/add-contact.html",
            controller: function ($http) {
                this.contacts = {};
                this.show = false;
                var pb = this;
                this.addContact = function (contact) {
                    $http.post("http://172.16.72.216:3000/contacts", contact).then(function (res) {
                        console.log("updated");
                        pb.show = true;
                    }, function (res) {});
                }
            },
            controllerAs: "store"
        }).when("/home", {
            templateUrl: "views/view-contacts.html",
            controller: function ($http) {
                this.contacts = [];
                var pb = this;
                $http.get("http://172.16.72.216:3000/contacts").then(function (res) {
                    pb.contacts = res.data
                }, function (res) {});
            },
            controllerAs: "store"
        }).when("/edit/:id", {
            templateUrl: "views/edit-contact.html",
            controller: function ($http, $routeParams) {
                var pb = this;
                this.show = false;
                this.contact = {};
                this.updateContact = function (contact) {
                    $http.put("http://172.16.72.216:3000/contacts/" + contactId, contact).then(function (res) {
                        console.log("updated");
                        pb.show = true;
                    }, function (res) {});
                }
                var contactId = $routeParams["id"];
                $http.get("http://172.16.72.216:3000/contacts/" + contactId).then(function (res) {
                    pb.contact = res.data
                }, function (res) {});
            },
            controllerAs: "store"
        }).when("/delete/:id", {
            templateUrl: "views/delete-contact.html",
            controller: function ($http, $routeParams) {
                var pb = this;
                this.show = false;
                var contactId = $routeParams["id"];
                this.id = contactId;
                $http.delete("http://172.16.72.216:3000/contacts/" + contactId).then(function (res) {
                    pb.show = true;
                }, function (res) {});
            },
            controllerAs: "store"
        }).otherwise({
            redirectTo: "/home"
        });
    });
})();