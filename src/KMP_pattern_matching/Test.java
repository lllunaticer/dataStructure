package KMP_pattern_matching;

public class Test {
    public static void main(String[] args){
        String sString = "abcdex";
        String fString = "avdabcdexdggs";
        int postion = Index_KMP.index_KMP(fString, sString, 0);
        System.out.println(postion);
    }
}
