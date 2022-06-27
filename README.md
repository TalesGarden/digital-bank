# Digital Bank

## Creating a Digital Bank with Java and Object Orientation
Extended JAVA project from Bootcamp TQI Fullstack Developer.

## Problem domain
"A bank offers its customers two types of accounts (current and savings), which have the deposit features , a withdrawal and transferring (between accounts of the institution itself)."

## Concepts used

- Abstraction
- Encapsulation
- Inheritance
- Polymorphism
- Design pattern (Singleton) 

## Changes made
- Every Account has an immutable universal unique identifier (UUID).
- Checks whether the transfer is made to any valid client.
- Checks balance amounts when cashing out and transferring.
- Draw method becomes Boolean.
- Restricts the limit of the number of bank creation to only one, thus creating a Singleton class of Bank.
- The bank class has the functionality of displaying all customers.
- Uses lombok to decrease the verbosity of the code.
