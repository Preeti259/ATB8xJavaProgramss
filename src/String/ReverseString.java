package String;

public class ReverseString {
    public static void main(String[] args) {

        String s1 = "Tanishq";
        String temp = "";

        for(int i = s1.length()-1; i>=0; i--){
            temp = temp + s1.charAt(i);
        }
        System.out.println("Reversed string is "+temp);
    }

}
