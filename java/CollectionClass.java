import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.LinkedHashSet;
public class CollectionClass{
	public static void main(String[] args){
		Collection col = new ArrayList();
		Collection col2 = new LinkedHashSet();
		col.add("First");
		col.add("Second");
		col.add("Third");
		//col2 collection
		col2.add("Fourth");
		col2.add("Fifth");
		col2.add("sixth");
		col.retainAll(col);
		Iterator it = col.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
	System.out.println("col size is: "+col.size());
	System.out.println("col2 size is: "+col2.size());
			
			}
			System.out.println("");
			System.out.println("");
		Object[] st = col2.toArray();
		for(Object a:st){
	System.out.println(a);		
		}
		
	}
}
