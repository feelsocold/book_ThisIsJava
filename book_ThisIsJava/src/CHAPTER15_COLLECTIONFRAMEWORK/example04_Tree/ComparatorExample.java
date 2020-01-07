package CHAPTER15_COLLECTIONFRAMEWORK.example04_Tree;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparatorExample {

	public static void main(String[] args) {
		
		/*		// Fruit이 Comparable을 구현하지 않았기 때문에ComparatorException발생!
		TreeSet<Fruit> treeSet = new TreeSet<Fruit>();
		treeSet.add(new Fruit("포도", 500));
		treeSet.add(new Fruit("바나나", 5600));
		treeSet.add(new Fruit("파인애플", 7500));
		*/
		
		TreeSet<Fruit> treeSet = new TreeSet<Fruit>(new DescedingComparator());
		treeSet.add(new Fruit("포도", 500));
		treeSet.add(new Fruit("바나나", 5600));
		treeSet.add(new Fruit("파인애플", 7500));
		
		Iterator<Fruit> iterator = treeSet.iterator();
		while(iterator.hasNext()) {
			Fruit f = iterator.next();
			System.out.println(f.name + " : " + f.price);
		}
		
	}

}
