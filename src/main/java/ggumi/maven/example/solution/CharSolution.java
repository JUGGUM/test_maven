package ggumi.maven.example.solution;

public class CharSolution {
    // 문자열 안의 문자열
    public static void main(String[] args) {
        String str1 = "ab6CDE443fgh22iJKlmn1o";
        String str2 = "6CD";
        int answer = 0;
        System.out.println(str1.contains(str2));
        if(str1.contains(str2)){
            answer = 1;
        }else{
            answer = 2;
        }
    }
}
/*
        contains :문자열에 검색하고자 하는 문자가 있는지 확인 : 포함 - true / 미포함 - false
        indexOf:문자열에서 검색하는 문자의 위치를 반환: 포함 -문자 위치/ 미포함 -( -1 )
        matches:정규식을 이용하여 문자열을 검색한다,특정 문자열을 검색할때 사용하기 보다는 한글, 숫자 등과 같이 해당 형태의 텍스트가 존재하는지 확인할때 사용하면 좋다: 포함 - true / 미포함 - false*/
