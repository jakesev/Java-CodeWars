
public class camelcasing{
	
	static String breakCamel(String input){
		String result = "";
		for(int i = 0 ; i<input.length(); i++){
			if((int) input.charAt(i) > 64 && (int) input.charAt(i) <91 && i>0){
				result+= " ";	
			} 
		
			result+=input.charAt(i);
			
		}

		return result;
	}

}

