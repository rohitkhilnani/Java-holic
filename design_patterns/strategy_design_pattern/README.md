# Strategy Design Pattern

Class Numbers - Encapsulates an integer array

PrintType - Interface that is contained within class Numbers to allow dynamic selection of a strategy to print the array

PrintNormal - Class that implements PrintType and defines a print strategy (print in ascending order of indices)

PrintReverse - Class that implements PrintType and defines a print strategy (print in descending order of indices)

TestNumbers - Tests class Numbers by dynamically switching between print strategies and printing the array.