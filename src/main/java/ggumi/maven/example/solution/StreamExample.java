package ggumi.maven.example.solution;

import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        String str = "ACBED";

        String[] stringArr = str.split("");   // new String[] {"A","C","F","E","D"}  배열로 변환

        String streamSortASC =  Stream.of(stringArr).sorted().collect(Collectors.joining());    //오름차순
        String streamSortDESC =  Stream.of(stringArr).sorted(Comparator.reverseOrder()).collect(Collectors.joining()); // 내림차순
        //Lambda
        String streamSortASC_Lambda =  Stream.of(stringArr).sorted((o1,o2)->o1.compareTo(o2)).collect(Collectors.joining());  //오름차순
        String streamSortDESC_Lambda =  Stream.of(stringArr).sorted((o1,o2)->o2.compareTo(o1)).collect(Collectors.joining()); // 내림차순
        System.out.println(str);
        System.out.println(streamSortASC);
        System.out.println(streamSortDESC);
        System.out.println(streamSortASC_Lambda);
        System.out.println(streamSortDESC_Lambda);

    }
}
