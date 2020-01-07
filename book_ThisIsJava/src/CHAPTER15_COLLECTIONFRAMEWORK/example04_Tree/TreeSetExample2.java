package CHAPTER15_COLLECTIONFRAMEWORK.example04_Tree;

import java.util.NavigableSet;
import java.util.TreeSet;

// 객체 정렬하기

public class TreeSetExample2 {

	public static void main(String[] args) {
		
		TreeSet<Integer> scores = new TreeSet<Integer>();
		scores.add(new Integer(97));
		scores.add(new Integer(55));
		scores.add(new Integer(23));
		scores.add(new Integer(12));
		scores.add(new Integer(86));
		
		NavigableSet<Integer> descendingSet = scores.descendingSet();
		for (Integer score : descendingSet) {
			System.out.println(score + " ");
		}
		
		System.out.println();
		
		NavigableSet<Integer> ascendingSet = descendingSet.descendingSet();
		
		for (Integer score : ascendingSet) {
			System.out.println(score + "");
		}
		
		
	}

}
