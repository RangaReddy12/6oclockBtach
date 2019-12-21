package dec16;
import java.util.ArrayList;
import java.util.Iterator;
public class Using_Iterator {
public static void main(String[] args) {
		ArrayList<String>str=new ArrayList<String>();
		str.add("sun");
		str.add("mon");
		str.add("tue");
		str.add("wed");
		str.add("thu");
		str.add("fri");
		str.add("sat");
		Iterator<String>x=str.iterator();
		while(x.hasNext())
		{
			System.out.println(x.next());
		}
	}
}

























