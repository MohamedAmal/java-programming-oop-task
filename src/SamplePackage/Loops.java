package SamplePackage;

public class Loops {
    public static void main(String[] args) {
        //for - while - do while
/*
        //start:1 ;  condition i<1000 ;   + -
        for (int i=100; i>=1 ; i-- )   //100 99 98 97      ......                            1  0
            System.out.println(i);

        int i=-1;
        //condition
        while ( i>=1 )  //false
        {
            System.out.println(i);
            i--;
        }
*/
        int i2=100;
        do {
            System.out.println(i2);
            i2--;
        }
        while ( i2>=1 );
    }
}
