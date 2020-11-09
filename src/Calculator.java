import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Maths Maths = new Maths();

        double answer = 0;
        double inputA, inputB;
        char operator;
        boolean done = false;

        while (done == false) {
            System.out.print("Please enter your sum: ");

            inputA = input.nextDouble();
            operator = input.next().charAt(0);
            inputB = input.nextDouble();

            public static int calc(int num1, int num2, char operation){
                int result;
                switch (operation){
                    case '+':
                        result = num1+num2;
                        break;
                    case '-':
                        result = num1-num2;
                        break;
                    case '*':
                        result = num1*num2;
                        break;
                    case '/':
                        result = num1/num2;
                        break;
                    default:
                        System.out.println("Операция не распознана. Повторите ввод.");
                        result = calc(num1, num2, getOperation());//рекурсия
                }
                return result;
            }

            System.out.println(answer);
        }

        input.close();

    }

}