package programmers;

public class Myheart {
    public static void main(String[] args) {
        int i, j;
        int top = 10;
        int topWidth = (top / 2) - 2;
        int bottom = top * 2 + 1;


        for (i = topWidth; i < top; i += 2) {
            for (j = 0; j <= (top - i); j++) {
                System.out.print(" ");
            }
            for (j = 0; j <= i * 2; j++) {
                System.out.print("*");
            }

            for (j = 0; j <= (top - i) * 2; j++) {
                System.out.print(" ");
            }
            for (j = 0; j <= i * 2; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        for (i = bottom; i >= 0; i -= 2) {
            for (j = 0; j <= bottom - i; j++) {
                System.out.print(" ");
            }
            for (j = 0; j <= i * 2; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }


    }}
