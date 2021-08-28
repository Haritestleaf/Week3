package Week3.day2;

import java.util.HashSet;
import java.util.Set;

public class Intersection {
public static void main(String[] args) {
	int[]array=  {3,2,11,4,6,7};
	int[]array1= {1,2,8,4,9,7};
	Set<Integer> Str1 = new HashSet<Integer>();
	for (Integer valu : array) {
		Str1.add(valu);
	}
	for (Integer valu : array1)
		if(Str1.contains(valu)) {
			System.out.println(valu);
		}
	}
	
}

