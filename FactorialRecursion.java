package factorial.recursion;

public class FactorialRecursion {

    public static int Summation(int x) {
        //5+4+3+2+1+0
        if (x <= 0) {
            return 0;

        } else {

            return x + Summation(x - 1);
        }

    }

    public static int Factorial(int x) {

        //factorial of a number: 5! = 5*4*3*2*1
        //if, else
        if (x <= 1) {
            return 1;
        } else {
            return x * Factorial(x - 1);

        }

    }

    public static void main(String[] args) {
        System.out.println("The factorial is: ");
        System.out.println(Factorial(5));
        System.out.println("The summation is: ");
        System.out.println(Summation(5));

    }

}
