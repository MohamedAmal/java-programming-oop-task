package SamplePackage;

import java.util.ArrayList;
import java.util.List;

public class Functions {
    public static void main(String[] args) {
       //calling
        Sum(5,5);
        Sum(4,5,5);
        Diff2Numbers(5,4);
        Diff2Numbers(5,6);
        Diff2Numbers(5,5);
        Diff2Numbers(5,15);
        Diff2Numbers(5,25);
        Diff2Numbers(5,35);
    }

    //defination  >>> return      no return >>void
    public static void Sum (int number1 , int number2)  //parameter(input)
    {
        System.out.println(number1+number2);
    }

    public static void Sum (int number1 , int number2,int number3)  //parameter(input)
    {
        System.out.println(number1+number2+number3);
    }

    public static void Diff2Numbers (int number1 , int number2)  //parameter(input)
    {
        System.out.println(number1-number2);
    }
}
