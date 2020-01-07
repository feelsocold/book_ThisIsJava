package CHAPTER15_CollectionFramework.example03_Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample2 {

	public static void main(String[] args) {
		
		Map<Student, Integer> map = new HashMap<Student, Integer>();
		
		map.put(new Student(1, "김동현"), 95);
		map.put(new Student(1, "김동현"), 95);
		
		System.out.println("총 Entry수 : " + map.size());
		
		
	}

}
