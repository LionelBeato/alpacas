export class Friend {

    name:string;
    age:number;

    constructor(name:string, age:number){
        this.name = name;
        this.age = age; 
    }

    details(){
        return `my name is ${this.name} and I am ${this.age} years old!`
    }

}