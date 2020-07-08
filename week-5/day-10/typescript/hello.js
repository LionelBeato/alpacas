function sayHello(person) {
    return "Hello, " + person;
}
var user = "Fabiana";
var x = 3;
function sayHi() {
    console.log("Hello World!");
}
console.log(sayHello(user));
var person = {
    title: "Mr.",
    name: "Jake",
    SSN: 888888,
    myFunction: function () {
        return "hello";
    }
};
// typescript also supports classes!
// link interfaces these define shape
// they also define functionality
var Employee = /** @class */ (function () {
    function Employee(name, age) {
        this.name = name;
        if (age) {
            this.age = age;
        }
        else {
            this.age = 39;
        }
    }
    Employee.prototype.details = function () {
        return this.name + " is " + this.age + " years old.";
    };
    return Employee;
}());
var newEmployee = new Employee("George", 23);
console.log(newEmployee.details());
// Generics
// generics are similar to generics in Java
// they also use the diamond syntax
// they help to enforce the use of any given type
function genFunction(param) {
    return param;
}
console.log(genFunction("Hello"));
console.log(genFunction(3));
// document.getElementById("para").innerHTML = sayHello(user); 
