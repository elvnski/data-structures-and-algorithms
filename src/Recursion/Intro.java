package Recursion;

public class Intro {

    public static void main(String[] args) {

        walkIteratively(5);
        walkRecursively(5);
        System.out.println(factorial(7));
        System.out.println(power(8, 17));

    }

    private static long power(int base, int exponent) {

        if(exponent < 1) return 1; //Base case
        return (long) base * power(base, exponent - 1);
    }

    private static int factorial(int integer) {

        if(integer == 0 || integer == 1 ) return 1;
        else return integer * factorial(integer -1);
    }

    private static void walkRecursively(int steps) {

        if(steps < 1) return; //Base case

        System.out.println("You took a step");
        walkRecursively(steps - 1);
    }

    private static void walkIteratively(int steps) {

        for (int i = 1; i <= steps; i++){
            System.out.println("You just took step " + i);
        }
    }



}
