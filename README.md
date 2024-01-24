# Fantasy Hockey League Application

## Overview

This Java application is designed for a Fantasy Hockey League. Users can enter team names and player details, including player names, goals, and assists. The application then calculates and displays team budgets and ratings, as well as individual player statistics.

## Features

- **Team Entry**: Users can enter the names of hockey teams.
- **Player Entry**: Users can enter the names of players for each team along with their goals and assists.
- **Data Validation**: The application checks for minimum character lengths for names and non-negative values for goals and assists.
- **Team and Player Reports**: After data entry, the application generates a report displaying team budgets, ratings, and player statistics.

## How to Compile and Run

### Prerequisites

- Java Development Kit (JDK)
- A Java IDE (like IntelliJ IDEA, Eclipse, or NetBeans) or a simple text editor.

### Compilation and Execution

1. Copy the provided Java code into a file named `Main.java`. Ensure that the `Team` and `Player` classes are also defined either in separate files or within the same file.
2. Open your Java IDE or command line tool.
3. Navigate to the directory containing `Main.java` (and `Team.java` and `Player.java` if separate).
4. Compile the program:
   - In the IDE: Use the built-in compile and run tools.
   - In the command line: Run `javac Main.java` to compile.
5. Run the compiled program:
   - In the IDE: Run the program using the IDE's run tool.
   - In the command line: Run `java Main`.

## Usage

- Upon running the program, follow the prompts to enter team names and player details.
- Input validation is in place to ensure data integrity.
- Once all data is entered, the application will display detailed reports on teams and players.

## Contributing

This project is a fundamental implementation of a Fantasy Hockey League application. Enhancements such as GUI implementation, file input/output, or more complex statistical analysis are welcome:

1. Fork the repository.
2. Create a new branch for your feature (`git checkout -b feature/YourFeature`).
3. Commit your changes (`git commit -am 'Add some YourFeature'`).
4. Push to the branch (`git push origin feature/YourFeature`).
5. Open a pull request.

## License

This project is open-source and can be used for educational purposes or as a foundation for more complex Fantasy League applications.
