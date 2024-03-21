import java.util.Arrays;
import java.util.List;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class settest {

	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(10,20,30,40,20,30,15,25);
		//HashSet<Integer> set=new HashSet<>(list);
		//LinkedHashSet<Integer> set=new LinkedHashSet<>(list);
		TreeSet<Integer> set=new TreeSet<>(list);
		System.out.println(set);
		System.out.println(set.contains(20)?"yes":"no");
		for(int i:set) {
			System.out.println(i);
		}

	}

}
