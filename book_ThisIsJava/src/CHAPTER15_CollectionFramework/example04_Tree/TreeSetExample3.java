package CHAPTER15_CollectionFramework.example04_Tree;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample3 {

	public static void main(String[] args) {
		
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("apple");
		treeSet.add("dive");
		treeSet.add("forever");
		treeSet.add("banana");
		treeSet.add("wave");
		treeSet.add("guess");
		
		System.out.println("c~f 사잉의 단어 검색");
		NavigableSet<String> rangeSet = treeSet.subSet("c", true, "f", true);	// c <= 검색단어 <= f
		for (String word : rangeSet) {
			System.out.println(word);
		}
		
		
	}

}
