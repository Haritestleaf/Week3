package Week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7};
		List<Integer> Str = Arrays.asList(3,2,11,4,6,7);	
		Collections.sort(Str);
		
		System.out.println(Str.get(4));
	}

	

}
