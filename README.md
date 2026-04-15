# Sudoku Project

## Student Name
Mushfiq Hasa

---

## Project Title
Sudoku Project

---

## Project Description
This project generates a completed 9x9 Sudoku board using Java.  
It uses recursion and backtracking to fill the board while following Sudoku rules.  
Each number placement is checked to ensure it does not break row, column, or 3x3 box rules.

The program also randomizes number selection so that each run produces a different valid Sudoku solution.

---

## How to Run the Program
1. Open terminal or command prompt
2. Compile the program:
3. Run the program: 
## How the Sudoku Board is Generated
- The program starts with an empty 9x9 grid
- It tries numbers 1–9 in each empty cell
- Before placing a number, it checks:
- Row validity
- Column validity
- 3x3 subgrid validity
- If a number works, it moves forward recursively
- If it gets stuck, it backtracks and tries a different number
- A shuffled list of numbers ensures randomness in each run

---

## Files Included in the Project
- Sudoku.java → Main program containing logic for generating and printing the board
- README.md → Project description and instructions
- (Design Document file: add your file name here, e.g. Sudoku_Design_Document.pdf)

---
