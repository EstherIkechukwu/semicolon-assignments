public class Isogram{

public boolean getAlphabetString(String text) {

	if (word.length() < 26) return false;

	boolean present = true;
	boolean allPresent = true;

	for(char counter = 'a'; counter <= 'z'; counter++){
		for(int index = 0; index < text.length(); index++){
			if(text.charAt(index) == counter){ 
				present = true; 
				break;
			}
		}
		if (!present) {
                	allPresent = false;
                	break;
            	}
        }
        return allPresent;
	}
	


}