# JavaFX Attendance Management System

This is a basic desktop application built with **JavaFX** and **MySQL** using **JDBC** to manage attendance records.

## 💻 Features

- Login form (with DB verification)
- Registration form with:
  - Name, Reg. No, Dept, Year, Gender, Skills, Address
- Displays submitted data dynamically
- Attendance % is generated randomly
- Uses JDBC with XAMPP (MySQL)
- JavaFX UI with sliders, toggle buttons, choice boxes

## 🔧 Technologies

- Java 17
- JavaFX
- JDBC
- MySQL (XAMPP)
- IntelliJ IDEA

## 🛠️ How to Run

1. Clone or download the repo
2. Import into IntelliJ
3. Add JavaFX SDK and MySQL JDBC JAR to your project
4. Set DB connection in your code:
   ```java
   DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdetails", "root", "");
