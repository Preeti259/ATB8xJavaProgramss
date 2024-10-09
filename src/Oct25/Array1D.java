package Oct25;

import java.util.Scanner;

public class Array1D {
    public static void main(String[] args) {

        int[] a = new int[5];

        Scanner scan = new Scanner(System.in);

for (int i = 0; i < a.length; i++) {

    System.out.println("Enter the marks of student " + i);
    a[i] = scan.nextInt();
}

System.out.println("The marks of students are:");
for (int i = 0; i < a.length; i++) {
    System.out.println(a[i]);
}

    }}

