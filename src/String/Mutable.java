package String;

import java.net.StandardSocketOptions;

public class Mutable
{
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("RAMA");
        System.out.println(sb);
        sb.append("SITA");
        System.out.println(sb);
    }
}
