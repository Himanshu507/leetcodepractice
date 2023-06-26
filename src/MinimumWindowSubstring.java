// 76. Minimum Window Substring

import java.util.*;

public class MinimumWindowSubstring {

    public String minWindow(String s, String t) {
        int slen = s.length();
        int tlen = t.length();
        HashMap<Character,Integer> tmap = new HashMap<>();
        int left = 0;
        int right = tlen;
        String min = "";
        if(tlen>slen){
            return "";
        }
        if(tlen>0){
            for(int i = 0;i<tlen;i++){
                tmap.put(t.charAt(i), tmap.getOrDefault(t.charAt(i),0)+1);
            }
        }
        while(right<=slen){
            String a = s.substring(left,right);
            System.out.println(a);
            int count = 0;
            HashMap<Character,Integer> temp = new HashMap<>(tmap);
            for(int i=0; i < a.length(); i++){
                if(temp.containsKey(a.charAt(i))){
                    int n = temp.get(a.charAt(i));
                    if(n>0){
                        count++;
                        temp.put(a.charAt(i),n-1);
                    }
                }
            }
            System.out.println("Count - "+count);
            if(count == tlen){
                if(min==""){
                    min = a;
                }else if(a.length()<min.length()){
                    min = a;
                }
                left++;
                right++;
            }else if(count>0){
                right++;
            }else{
                left = right-1;
                right = left + tlen;
            }
        }

        return min;
    }

    public static void main(String[] args) {
        MinimumWindowSubstring m = new MinimumWindowSubstring();
        m.minWindow("ADOBECODEBANC","ABC");
    }
}