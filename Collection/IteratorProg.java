package Collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArrayList obj1 = new ArrayList();
       
       obj1.add("sadhu");
       obj1.add("Radhu");
       obj1.add("Pooja");
       obj1.add("Jeeva");
       
       
       Iterator i1 = obj1.iterator();
       /*
       System.out.println(i1.hasNext());
       System.out.println(i1.next());
       System.out.println(i1.hasNext());
       System.out.println(i1.next());
       System.out.println(i1.hasNext());
       System.out.println(i1.next());
       System.out.println(i1.hasNext());
       System.out.println(i1.next());
       System.out.println(i1.hasNext());
       System.out.println(i1.next());
       */
       
       ListIterator i2 = obj1.listIterator();
       //i2.remove();
       System.out.println(i2);
       System.out.println(i2.hasPrevious());
       System.out.println(i2.previous());
       i2.remove();
       
       i1.remove();
       System.out.println(obj1);
	}

}
