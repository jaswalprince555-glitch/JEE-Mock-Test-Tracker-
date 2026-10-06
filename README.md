# JEE-Mock-Test-Tracker-
JEE Mock Test Tracker 
~~~
# Terminal JEE Mock Test Tracker

A command-line Java application built to track and analyze mock test performance[cite: 2]. 

## 🚀 About the Project
This project is a terminal-based tracker that takes user inputs for individual subject scores (Physics, Chemistry, and Mathematics), calculates the exact total percentage, and generates a formatted performance report along with the user's target college[cite: 2]. 

## 🧠 Technical Concepts Applied
* **User Input & Data Types:** Utilizing `java.util.Scanner` to capture and manage `String` and `int` data types[cite: 2].
* **Buffer Management:** Successfully handling the common `Scanner.nextLine()` buffer trap when switching between numeric and string inputs to prevent skipped questions[cite: 2].
* **Mathematical Logic:** Using float division to calculate precise percentages without integer truncation[cite: 2].

## 🛠️ My Learning Approach
This project is part of my journey to master Java through an AI-driven, fundamental-first approach. Rather than just skimming tutorials, I build individual console applications for core concepts to deeply understand Java's syntax, logic, and memory management from the ground up.

## 💻 How to Run
1. Ensure you have the Java Development Kit (JDK) installed.
2. Clone this repository.
3. Compile the program using the terminal: `javac MarksTracker.java`
4. Run the application: `java MarksTracker`
~~~
THE CODE RUN IN THE TERMINAL LOOKS LIKE
~~~
Mock Test name:
**JEE Main Mock 1**
Physics socre :
**75**
Chemistry socre :
**82**
Maths socre :
**88**
Target college :
**IIT Delhi**

======MockTest======JEE Main Mock 1
Physics socre : 75
Chemistry socre : 82
maths score: 88
Targeting college:IIT Delhi
 totalmarks :245/300
 percentage :81.666664%
~~~
