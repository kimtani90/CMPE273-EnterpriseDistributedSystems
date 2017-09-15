/**
 * Write a program to inherit student class from person.
 */
"use strict";
class Person{
	
	constructor(name, age){
		
		this.name=name;
		this.age=age;
		
	}
}

class Student extends Person{
	
	constructor(enrolId, name, age){
		
		super(name, age);
		this.enrolId=enrolId;
		
	}
}

var student= new Student(11, 'Sam', 26);

console.log("Student Details:\n");
console.log("Enrollment Id:"+student.enrolId);
console.log("Name:"+student.name);
console.log("Age:"+student.age);