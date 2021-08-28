package Week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort {
	public static void main(String[] args) {
		String[] arr = {"Google","Microsoft","TestLeaf","Maverick"};
		
		List<String> Str = new ArrayList<String>(Arrays.asList(arr));
	 int sizeOfStr = Str.size();
	
	 Collections.sort(Str);
	 Collections.reverse(Str);
		
	}

}	
