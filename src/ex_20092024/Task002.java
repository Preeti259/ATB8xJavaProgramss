package ex_20092024;

public class Task002
{
    public static void main(String[] args) {
        int a = 30;
        int b = 25;
        int c = 35;
        int max = (a>b)?(a>c?a:c):(b>c?b:c);
        System.out.println("maximum is:"+ max);
    }
}
