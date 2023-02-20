package homework.functions;

public class Task2 {
    public static void main(String[] args) {
        double operand1 = 24.4;
        double operand2 = 10.1;
        char operation = '+';
        System.out.println(result(operand1, operand2, operation));
    }

    private static double result(double operand1, double operand2, char operation){
        double result = switch (operation){
            case '+' -> operand1 + operand2;
            case '-' -> operand1 - operand2;
            case '*' -> operand1 * operand2;
            case '/' -> operand1 / operand2;
            default -> throw new IllegalStateException("Unexpected value: " + operation);
        };
        return result;
    }
}
