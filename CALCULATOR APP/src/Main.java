public class Main {
    public static void main(String[] args)
    {
        Calculator calculator = new SimpleCalculator();
        calculator.setNum1(5);
        calculator.setNum2(10);
        System.out.println(calculator.addition());
        System.out.println(calculator.subtraction());
        System.out.println(calculator.multiplication());
        System.out.println(calculator.division());
    }
}
