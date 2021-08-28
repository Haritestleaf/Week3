package Week3.day2;

import java.util.HashSet;
import java.util.Set;

public class PrintDulicates {

	public static void main(String[] args) {
		int[]array = {14,12,13,11,15,14,18,16,17,19,18,17,20};
			
			Set<Integer> Str1 = new HashSet<Integer>();
			for (Integer valu : array) {
				
				if(Str1.add(valu)==false)
					
					System.out.println(valu);
				
					
				
				}
			}
	}


