import java.util.HashMap;

public class RansomeNote383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> s2 = new HashMap<>();
        for(int i=0;i<magazine.length();i++){
            if(s2.containsKey(magazine.charAt(i))){
                s2.put(magazine.charAt(i), s2.get(magazine.charAt(i))+1);
            }else{
                s2.put(magazine.charAt(i), 1);
            }
        }

        for(int i=0;i<ransomNote.length();i++){
            if(s2.containsKey(ransomNote.charAt(i))){
                int count = s2.get(ransomNote.charAt(i));
                count--;
                s2.put(ransomNote.charAt(i), count);
                if(count == -1){
                    return false;
                }
            }else{
                return false;
            }
        }

        return true;

    }

    public static void main(String[] args) {
        RansomeNote383 r = new RansomeNote383();
        System.out.println(r.canConstruct("aa","ab"));
    }


}
