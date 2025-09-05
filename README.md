[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/9wwqi1Zm)

# Assignment 1: Recap

## Overview

This assignment is a gentle reintroduction to the core programming concepts you learned in CSC110 and CSC111. You will practice working with:

- Arrays
- Interfaces
- File reading
- Looping structures
- Conditionals
- Class creation
- Exception handling

## Provided Files

You are given several starter files:

- `IMDB.java`: An interface that lists all the required methods you must implement.
- `VideoObj.java`: The class where you will implement the `IMDB` interface.
- `subset.title.basics.tsv`: A tab-separated values (TSV) file containing a subset of IMDB's non-commercial dataset. This file provides a unique ID and basic information about each show.
- `subset.title.ratings.tsv`: A TSV file that contains the unique ID and maps each show to its ratings and vote counts.

For more details on IMDB's TSV format, see the [IMDB dataset documentation](https://developer.imdb.com/non-commercial-datasets/).

## Assignment Steps

To complete this assignment, you should:

1. **Implement the Java files:**
	- Complete `VideoObj.java` by implementing all required fields and methods from the `IMDB` interface.
	- Write constructors, getters, setters, and any other methods needed to store and access video data.
2. **Complete `main.java`:**
	- Use this file as your program's entry point.
	- Write code to read and parse both TSV files.
	- Aggregate the data into unified `VideoObj` objects and store them in your database structure.
	- Ensure your program removes incomplete or invalid objects (data correctness).
	- Handle all exceptions gracefully.
	- Call methods to analyze and print information about the videos (such as statistics, distributions, etc.).

## What a Complete Assignment Looks Like

A complete assignment will include:

- All required Java files implemented and compiling without errors.
- `VideoObj.java` fully implements the `IMDB` interface and can store all relevant data from both TSV files.
- `main.java` reads both TSV files, creates and stores `VideoObj` objects, and calls analysis/cleanup methods.
- The program removes or flags incomplete or invalid data entries.
- The program prints meaningful output to the console, such as statistics or summaries about the video data.
- All exceptions are handled appropriately, and the program does not crash on bad input.

Each required function in the starter code includes a comment with more specific instructions. Read these comments carefully as you implement your solution.

