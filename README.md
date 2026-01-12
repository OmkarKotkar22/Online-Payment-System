# 💳 Online Payment System (Java – OOP Project)

![Language](https://img.shields.io/badge/Language-Java-orange?logo=openjdk)
![Concept](https://img.shields.io/badge/Concept-OOP-blue)
![Features](https://img.shields.io/badge/Features-Interface%20%7C%20Abstraction-green)
![Status](https://img.shields.io/badge/Status-Completed-brightgreen)
![Application](https://img.shields.io/badge/Application-Console%20Based-yellow)
![IDE](https://img.shields.io/badge/IDE-Eclipse-purple?logo=eclipseide)

---

## 📌 Project Overview

The **Online Payment System** is a **Java console-based application** designed to demonstrate **Object-Oriented Programming (OOP)** concepts such as **Interface, Abstraction, Inheritance, and Polymorphism**.

This project simulates different **online payment methods** like **Credit Card**, **Debit Card**, and **UPI**, allowing payments to be processed in a unified and flexible way.

The system is structured in such a manner that **new payment methods can be added easily** without modifying existing logic, following **real-world software design principles**.

---

## 🎯 Key Objectives

- Understand and apply **OOP principles in Java**
- Implement **interface-based design**
- Demonstrate **abstraction for payment processing**
- Build a **scalable and maintainable** payment system
- Simulate **real-world online payment workflows**

---

## 🧠 OOP Concepts Used

### ✔ Interface
- `Payment` acts as a **common contract** for all payment methods.
- Ensures **standardized behavior** across different payment types.

### ✔ Abstraction
- Payment details are hidden behind abstract methods.
- User interacts only with **what the system does**, not **how it does it**.

### ✔ Inheritance
- `CreditCard`, `DebitCard`, and `UPI` classes **inherit** behavior defined by the `Payment` interface.

### ✔ Polymorphism
- A single `Payment` reference can process **multiple payment types** dynamically.

---

## 📂 Project Structure

```text
Online-Payment-System
│
├── bin/
|     └──Payment
│         ├── CreditCard.class
│         ├── DebitCard.class
│         ├── UPI.class
│         ├── Payment.class
│         └── OnlinePayment.class
│
├── src/
|     └──Payment
│         ├── CreditCard.java
│         ├── DebitCard.java
│         ├── UPI.java
│         ├── Payment.java
│         └── OnlinePayment.java
│
├── .classpath
├── .project
└── README.md
```
## 🧩 Class Description  
🔹 Payment (Interface)  
Defines the common method for payment processing.  
Acts as a blueprint for all payment types.

🔹 CreditCard
Implements Payment  
Handles credit card–based payments.

🔹 DebitCard  
Implements Payment  
Processes payments directly from bank accounts.

🔹 UPI  
Implements Payment  
Simulates UPI-based digital transactions.

🔹 OnlinePayment  
Main driver class.  
Uses polymorphism to process different payment methods dynamically.

---

## ▶ How to Run the Project

Open Eclipse IDE
Import the project as Existing Java Project
Navigate to:
`
src/Payment/OnlinePayment.java
`
Right-click → Run As → Java Application
Follow console instructions to process payments

---

## 🌍 Real-Life Application
This project closely resembles real-world payment gateways like:
Google Pay
PhonePe
Paytm
Credit/Debit card payment systems used in e-commerce
Each payment option follows a common protocol, just like in real banking and fintech systems.

## 🚀 Future Enhancements

Add Net Banking payment option
Integrate exception handling
Add user authentication
Connect with a database
Build a GUI or Web interface

## 👨‍💻 Author
Omkar Kotkar
Java Developer 

## 📜 License
This project is created for learning and academic purposes.
