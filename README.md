# Employee Role Management - Design Patterns Implementation  

This project showcases four different design pattern implementations to manage employee roles and their tasks in Java. Each approach demonstrates a unique way to handle responsibilities while improving code maintainability, flexibility, and scalability.  

## Implemented Approaches  

### 1. No Pattern (Basic Implementation)  
- Uses a simple `switch-case` structure to assign tasks based on employee roles.  
- Least flexible and violates the **Open-Closed Principle (OCP)**.  

### 2. State Pattern  
- Encapsulates role-specific behaviors in separate state classes.  
- Allows dynamic role transitions without modifying the `Employee` class.  

### 3. Strategy Pattern  
- Defines different role behaviors as interchangeable strategies.  
- Enhances flexibility by enabling runtime selection of employee responsibilities.  

### 4. Decorator Pattern  
- Dynamically extends employee roles with additional functionalities.  
- Useful for adding layered responsibilities without modifying core logic.  

## Usage  
Each implementation is structured as a standalone module, illustrating how different design patterns improve system architecture. This project provides a practical comparison of these patterns in handling employee role management.  

