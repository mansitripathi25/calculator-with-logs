package src;

            import java.util.Scanner;
            import service.CalculatorService;

            public class main{
                public static void main(String[] args){
                    Scanner scanner = new Scanner(System.in);
                    CalculatorService calculatorService = new CalculatorService();

                    System.out.println("Welcome to the realistic calculator");

                    while(true){
                        System.out.print("enter 1st num:");
                        double num1 = scanner.nextDouble();

                        System.out.print("enter operation (+,-,*,/):");
                        String op = scanner.next();

                        System.out.print("enter 2nd num:");
                        double num2 = scanner.nextDouble();

                        calculatorService.performAndLog(num1,num2,op);

                        System.out.print("do you want to continue?:");
                        String choice = scanner.next();

                        if(!choice.equalsIgnoreCase("yes")){
                            System.out.println("thanks for using");
                            break;
                        }
                    }
                    scanner.close();
                }
            }