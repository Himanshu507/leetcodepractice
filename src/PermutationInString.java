import java.util.HashSet;
import java.util.Hashtable;

public class PermutationInString {
    public boolean checkInclusion(String s1, String s2) {
        Hashtable<String,Integer> perm = new Hashtable<>();
        int left = 0;
        int right = s1.length();
        for (int i=0;i<s1.length();i++){
            perm.put(s1.substring(i,i+1),perm.getOrDefault(s1.substring(i,i+1),0) + 1);
        }
        while(right<=s2.length()){
            String s = s2.substring(left,right);
            int count = 0;
            for(int i=0;i<s1.length();i++){
                if(perm.containsKey(s.substring(i,i+1))){
                    int t = perm.get(s.substring(i,i+1));
                    if(t>0){
                        count++;
                        t--;
                    }
                    perm.put(s.substring(i,i+1),t);

                }else{
                    break;
                }
            }
            if(count == s1.length()){
                return true;
            }
            left++;
            right++;
        }
        return false;
    }

    public static void main(String[] args) {
        PermutationInString s = new PermutationInString();
        //String st = "eidbaooo";
        //System.out.println(st.substring(0,2));
        System.out.println(s.checkInclusion("hello","ooolleoooleh"));
    }
}
