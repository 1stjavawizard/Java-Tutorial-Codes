import java.util.Collections;
import java.util.SortedSet;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.TreeSet;
public class CollectionsClass{
	public static void main(String[] args){
		SortedSet<Integer> as = new TreeSet<Integer>();
		as.add(45);
		as.add(34);
		as.add(56);
		
		System.out.println(as);
	}
}