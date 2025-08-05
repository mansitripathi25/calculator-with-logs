# calculator-with-logs
A simple calculator with log saving functionality
performs basic arithmetic operations and saves logs of calculations in a file
## features
-add, subtract, multiply, divide
-html frontend for input
-logs all operations into 'data.txt'
-clean folder structure ('src/','dao/','service/','util/',)
-uses file logging ('fileLogger.java')
easy to extend with database logging if needed
## project structure
calculator wth logs/
 |--index.html
 |--mysql-connector.jar
 |--data.txt(auto generated file)
 |
 |--src/
    |--main.java
    |--dao/
    |  |--SaveLog.java
    |--service/
    | |--CalculatorService.java
    |--util/
     |--fileLogger.java
  ## how to run
  open project in any java IDE(vs code,eclipse etc.,)
  use 'index.html' in browser for frontend input
  check 'data.txt' for logs of each operation
  ## license
  this project is licensed under the[MIT License](LICENSE).
 
