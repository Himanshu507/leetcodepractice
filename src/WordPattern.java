import java.util.HashMap;

public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        String[] swords = s.split(" ");
        HashMap<Character, String> match = new HashMap<>();
        if(swords.length != pattern.length()){
            return false;
        }
        for(int i=0;i<pattern.length();i++){
            if(match.containsKey(pattern.charAt(i))){
                String present = match.get(pattern.charAt(i));
                if (!present.equals(swords[i].trim())){
                    return false;
                }
            }else{
                if(match.containsValue(swords[i].trim())){
                    return false;
                }else{
                    match.put(pattern.charAt(i),swords[i].trim());
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        WordPattern wordPattern = new WordPattern();
        wordPattern.wordPattern("abba","dog cat cat dog");
    }
}
