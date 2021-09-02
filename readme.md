# Calculator App

## Overview
This is a simple calculator that computes the elementary arithmetics. This calculatorw supports 
(), ^, *, /, +, and subtraction. It uses Pemdas operations to compute the answer of the equation 
see examples below.

## Technical Overview
The application utilices the several  Design Patters and OOP Logic with Java's generic tools. The 
State Design patter is used  to control the screen and input option. Polymorphism and inheritance 
properties are used to control the appropriate calculation for each opeartion. 

## Examples
Examples Addition and Subtraction

	 To add values, enter: 
		 12+12
		 this will return "result: 24"
	 To subtract values, enter: 
		 12-10
		 this will return "result: 2
	 To add and subtract multiple values, enter: 
		 12+12-10
		 this will return "result: 14
	 To subtract values, enter: \n"
		 12-10\n"
		 this will return "result: 2"


Examples Multiplication and Division

	 To multiply values, enter: 
		 12*12
		 this will return "result: 144"
	 To divide values, enter: 
		 12/3
		 this will return "result: 4
	 To multiply and divide multiple values, enter: 
		 12*12/6
		 this will return "result: 24
	 To subtract values, enter: \n"
		 12-10\n"
		 this will return "result: 2"


Examples exponents

	 To factor exponents enter, enter: 
		 2^(10)
		 this will return "result: 1024"
	 This will also work without paranthesis: 
		 2^10
		 this will return "result: 1024


Examples with Paranthesis

	 To control order of operation, add operations inside of paranthesis, enter: 
		 2*(2+2)
		 this will return "result: 8"
	 Equations with paranthesis and no operands will operate similar to multiplication: 
		 2(10)
		 this will return "result: 20


Examples with all operations

	 Combine all operations: 
		(12+12)*(12/12)
		 this will return "result: 24
	 More complicated equation: 
		 (2+2)/2^2(2-2)-2*(2(2+2)2)
		 this will return "result: -32"
