package com.luv2code.samplePractice.SortAlgo;

public class FactorialAlgo {
    // 0! =1
    // 1! =1*0!  =1
    // 2! =2*1   =2*1!
    // 3! =3*2*1 =3*2!
    // 4! =4*3*2*1  =4*3!


    //iterative is more fast than recursion
    //because of stack over flow and call stack limit.

    public static void main(String ar[]) {
        System.out.println(iterativeFactorial(4));
        System.out.println(recursiveFactorial(4));
    }

    public static int recursiveFactorial(int num) {
        if (num == 0)
            return 1;
        //it wont return initially it will wait for recursiveFactorial(num - 1)
        //eg =3
        //recursiveFactorial(0)
        //recursiveFactorial(1)    //get pushed in call stack
        //recursiveFactorial(2)   //get pushed in call stack
        //recursiveFactorial(3)  //get pushed in call stack
        //have limit so it need any breaking condition
        return num * (recursiveFactorial(num - 1));
    }

    public static int iterativeFactorial(int num) {
        int factorial = 1;
        if (num == 0)
            return 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
