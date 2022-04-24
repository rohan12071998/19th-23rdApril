package April22nd;
import java.util.LinkedList;

public class CreatingLinkedList { 
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList();

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);

		System.out.println(list);
		System.out.println(list.get(4));

	}
}


	