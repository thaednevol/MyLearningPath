package co.knry.essentials;

public class PrintNumbers {

    private int length = 5;
    public void calculate(int width){
        class Calculator {
            public void multiply() {
                System.out.println(length * width);
            }
        }

        var calculator = new Calculator();
        calculator.multiply();
    }

    public static void main (String ... args){
        var printer = new PrintNumbers();
        printer.calculate(10);
    }

}
