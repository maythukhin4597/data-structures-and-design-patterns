package chapter3;

public class Factorial_recursion {

    public static void main(String[] args) {
        int num = 5;
        int result = factorial(num);
        System.out.println(result);
    }

    private static int factorial(int num) {
        if (num == 1) {
            return 1;
        }
        return num * factorial(num - 1);
    }

}
