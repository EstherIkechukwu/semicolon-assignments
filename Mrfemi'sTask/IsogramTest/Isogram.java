public class Isogram{

public static boolean getAlphabetString(String text) {

	if (text.length() < 26) return false;

	boolean present = true;
	boolean allPresent = true;

	for(char counter = 'a'; counter <= 'z'; counter++){
		for(int index = 0; index < text.length(); index++){
			if(text.charAt(index) == counter){ 
				present = true; 
				break;
			}
		}
		if(!present){
                	allPresent = false;
                	break;
            	}
        }
        return allPresent;
	}
	


}