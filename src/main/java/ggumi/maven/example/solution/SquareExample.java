package ggumi.maven.example.solution;

import java.text.NumberFormat;

public class SquareExample {
    public static void main(String[] args) {
        int n = 144; // 141
        int answer = 0;
        if(n % Math.sqrt(n) == 0){
            answer = 1;
        }else{
            answer = 2;
        }
        System.out.println(answer);
    }
}
