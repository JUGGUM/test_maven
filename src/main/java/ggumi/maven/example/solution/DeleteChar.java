package ggumi.maven.example.solution;

public class DeleteChar {
    public static void main(String[] args) {
        String my_string = "abcdef";
        String letter = "f";
        String result = "";
        result = my_string.replace(letter, "");
        System.out.println(result);
    }
}
