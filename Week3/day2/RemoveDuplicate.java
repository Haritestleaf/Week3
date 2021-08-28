package Week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicate {
	public static void main(String[] args) {
		String str = "We learn java basics as part of java sessions in java week1";
		String[] Array= str.split(" ");
		
		List<String> Str = new ArrayList<String>(Arrays.asList(Array));		
		int strsize = Str.size();
		System.out.println(strsize);
		System.out.println(Str);
		Set<String> Str1 = new LinkedHashSet<String>(Str);	
		System.out.println(Str1);
		for (String Remove: Str1) {
			System.out.println(Remove);
			
			
			
			
		}
	}

}
