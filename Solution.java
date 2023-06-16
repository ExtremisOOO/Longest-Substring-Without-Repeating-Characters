import java.util.HashSet;

public class App {
    public int lengthOfLongestSubstring(String s){
       HashSet<Character> charactersFromString = new HashSet<>();
        int longestSubstring = 0;
        int lengthofSubstring = 1;
        for (int j = 0; j < s.length(); j++) 
        {
            for (int i = j; i < s.length(); i++) 
            {
                char character = s.charAt(i);
                
                if(charactersFromString.contains(character))
                    break;

                charactersFromString.add(character);
            }

            lengthofSubstring = charactersFromString.size();
            longestSubstring = Math.max(longestSubstring, lengthofSubstring);
            charactersFromString.clear();
        }

        return longestSubstring;
    }
}