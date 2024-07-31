import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Calculator calculator = new SimpleCalculator();
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=input.nextInt();
        calculator.setNum1(num);
        while (true){
            System.out.println("Enter the operation OR (enter 'exit' to finish)");
            String operation=input.next();
            System.out.println("Enter a number");
            int num2=input.nextInt();
            calculator.setNum2(num2);


            if (operation.equals("exit")){
                break;
            }
            switch (operation){
                case "+":
                    System.out.println(calculator.addition());
                    calculator.setNum1(calculator.addition());
                    break;
                case "-":
                    System.out.println(calculator.subtraction());
                    calculator.setNum1(calculator.subtraction());
                    break;
                case "*":
                    System.out.println(calculator.multiplication());
                    calculator.setNum1(calculator.multiplication());
                    break;
                case "/":
                    System.out.println(calculator.division());
                    calculator.setNum1(calculator.division());
                    break;
            }

        }

    }
}