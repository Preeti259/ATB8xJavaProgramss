package ex_20092024;

public class Task003 {
    public static void main(String[] args) {
        int a = 25;
        if(a%5== 0 && a%7==0 )
        {
            System.out.println("FizzBuzz");
        } else if(a%5==0 && a%7 != 0)
        {
            System.out.println("Fuzz");
        } else if (a%5 != 0 && a%7 == 0)
        {
            System.out.println("Buzz");
        } else {
            System.out.println("Number is not divided by 5 & 7");
        }
    }



}
