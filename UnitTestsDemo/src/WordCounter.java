import java.util.*;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WordCounter {
	public static String getHighestCountWord(String input) {
		//replace special characters
		  Pattern pt = Pattern.compile("[^a-zA-Z0-9\\s]");
		  Matcher match= pt.matcher(input);
			while(match.find())
			{
			    String s= match.group();
			    input=input.replaceAll("\\"+s, "");
			}

		//split the input into array
		   String[] words = input.split(" ");	
			
		//loop and count the occurances of each word
		   LinkedHashMap<String,Integer> wordMap = new LinkedHashMap<String,Integer>();
		   for(String word: words) {
			   boolean allReadyThere = wordMap.containsKey(word);
			   if(!allReadyThere) {
				   wordMap.put(word, 1);
			   }else {
				   int value = wordMap.get(word);
				   value++;
				   wordMap.replace(word, value);
			   }
		   }
		   
		//arrange the list in order of count then by order of dictionary
	    //By Value
		  int heighestCount = 0;
		  Entry<String,Integer> result = null;
		  
	      for(Entry<String,Integer> entry : wordMap.entrySet()) {
	    	  int currentCount = entry.getValue();
	    	  if(currentCount>heighestCount) {
	    		  result = entry;
	    		  heighestCount = entry.getValue();
	    	  }
	    	  else if(currentCount == heighestCount) {
	    		String heighestKey = result.getKey();
	    		String currentKey = entry.getKey();
	    		if(heighestKey.compareTo(currentKey)>0) {
	    			result = entry;
	    		}
	    		
	    	  }
	      }
		   
		return result.getKey()+","+result.getValue();
	}
	
	
	 
}
