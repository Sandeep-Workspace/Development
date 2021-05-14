import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Practice_List_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List <String> list = new ArrayList<String>();
		list.add("Sandeep");
		list.add("Mayank");
		list.add("Pooja");
		list.add("Papa");
		list.add("Mummy");
		list.add("Nitu");
		list.add("Anil");
		list.add("Swatantra");
		list.add("Gaurank");
		
		@SuppressWarnings("rawtypes")
		Iterator itr =list.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//list.clear();
		list.removeIf(n -> (n.charAt(0) == 'S'));
		System.out.println("========================End of List============================");
		list.add("Meher");
		
		itr=list.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
