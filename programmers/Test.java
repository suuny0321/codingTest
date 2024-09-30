package programmers;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int i,j;
        Scanner sc = new Scanner(System.in);
        System.out.print("단 입력:");
        int dan = sc.nextInt();

        for(j=0;j<=dan;j++) {
            for(i=1;i<=9;i++) {
                System.out.println(j+"X"+i+"="+(j*i));
            }
            System.out.println("");

        }
    }}
