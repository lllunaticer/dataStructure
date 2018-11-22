package KMP_pattern_matching;

public class Index_KMP {
    public static int index_KMP(String sFather, String sSon, int pos){
        int i=pos;
        int j=0;
        char[] cFather = sFather.toCharArray();
        char[] cSon = sSon.toCharArray();
        int[] next = Next.getNext(sSon);
        for(int p:next) System.out.println(p);
        System.out.println();
        while(i<cFather.length&&j<cSon.length){
            if(j==0&&cFather[i]!=cSon[j]){
                ++i;
            }
            if(cFather[i]==cSon[j]){
                ++i;
                ++j;
            }
            else {
                j = next[j];
            }
        }
        if(j==cSon.length)
            return i-cSon.length;
        else
            return 0;
    }
}
