"use strict";
exports.__esModule = true;
exports.Friend = void 0;
var Friend = /** @class */ (function () {
    function Friend(name, age) {
        this.name = name;
        this.age = age;
    }
    Friend.prototype.details = function () {
        return "my name is " + this.name + " and I am " + this.age + " years old!";
    };
    return Friend;
}());
exports.Friend = Friend;
