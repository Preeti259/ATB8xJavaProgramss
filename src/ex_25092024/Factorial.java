package ex_25092024;


import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the number");
        int i = sc.nextInt();
        int result = 5;
        for(int j =i; j<=5; j--){
            result =result* j;

        }
System.out.println("Factorial Of" + i +"is:"+result);


    }
}
