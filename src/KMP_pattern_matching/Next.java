package KMP_pattern_matching;
//this class will take a String and return the next array of it.

public class Next {
    public static int[] getNext(String s){
        char[] schar = s.toCharArray();
        int [] next = new int[s.length()];
        int i = 1;
        int j = 0;
        next[0] = 0;
        while(i<s.length()){
            if(j==0||schar[i]==schar[j]){
                ++i;
                ++j;
                next[i-1] = j-1;
            }
            else j = next[j-1];
        }
        return next;
    }
}
