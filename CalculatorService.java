package service;
import dao.SaveLog;

public class CalculatorService {
    public void performAndLog(double num1, double num2, String op){
        double result;

switch (op){
    case "+"-> result = num1+num2;
    case "-"-> result = num1-num2;
    case "*"-> result = num1*num2;
    case "/"->{
        if (num2==0) {
            System.out.println("cannot divide by zero");
         return;
        }
        result = num1/num2;
    }
    default->{
    System.out.println("invalid");
    return;
    }
}
System.out.println("Result:" +result);
String log =num1 + "" + op + "" +num2 + "=" +result;
SaveLog.save(log);
}
}