package ggumi.maven.example.solution;

public class StringExample {
    public static void main(String[] args) {
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        // lamda 사용하여 간편하게
        for (String day : days){
            System.out.println(day);
        }

        int[] month = {1,2,3,4,5,6,7,8,9,10,11,12};
        for(int mon : month){
            System.out.println(mon);
        }
    }
}
