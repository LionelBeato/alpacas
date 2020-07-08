
function sayHello(person:string):string {
    return "Hello, " + person; 
}

let user:string = "Fabiana"; 
let x:number = 3; 

function sayHi():void {
    console.log("Hello World!"); 
}

console.log(sayHello(user)); 

// typescript has support for interfaces
// in this language, interfaces enforce the "shape" of data
// they can include optional properties
interface PersonData {
    title: string;
    name: string; 
    // whenever you see a question mark,
    // that means the property is optional
    salary?: number; 
    readonly SSN: number; 
    myFunction():string; 
}

let person: PersonData = {
    title: "Mr.",
    name: "Jake",
    SSN: 888888, 
    myFunction() {
        return "hello"; 
    }
}

// typescript also supports classes!
// link interfaces these define shape
// they also define functionality

class Employee {
    name: string;
    age: number;

    constructor(name: string, age?: number){
        this.name = name; 
        if (age) {
            this.age = age;
        }
        else {
            this.age = 39; 
        }

    }

    details(): string{
        return `${this.name} is ${this.age} years old.`; 
    }
}

let newEmployee = new Employee("George", 23);

console.log(newEmployee.details()); 


// Generics
// generics are similar to generics in Java
// they also use the diamond syntax
// they help to enforce the use of any given type

function genFunction<T>(param:T): T{
    return param; 
}

// generics can be explicit or inferred! 
console.log(genFunction<string>("Hello"));
console.log(genFunction("Hello there!"));
console.log(genFunction<number>(3));

// document.getElementById("para").innerHTML = sayHello(user); 
