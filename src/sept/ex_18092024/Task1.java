package sept.ex_18092024;

public class Task1 {
    public static void main(String[] args) {
        //Widening
        byte b=35;
        int a=b;//valid implicit casting JVM automatically done

        byte c=42;
        int d=(int)c;//valid explicit casting and no data loss.

        //Narrowing
        short cast=300;
        // byte c1=cast; invalid syntax Invalid implicit casting
        byte c1=(byte)cast;//Explicit cast with dataloss
        System.out.println(c1);
    }
}