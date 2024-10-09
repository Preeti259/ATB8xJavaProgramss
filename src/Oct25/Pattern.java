package Oct25;

public class Pattern {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.println("");
                {
                    for (int j = 1; j <= 5 - i + 1; j++) {
                        System.out.println("*");
                        System.out.println();

                    }
                }
            }
        }
    }
}


