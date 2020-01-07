package CHAPTER15_COLLECTIONFRAMEWORK.example04_Tree;

import java.util.Iterator;
import java.util.TreeSet;

// 사용자 정의 객체를 나이순으로 정렬하기 

public class ComparableExample {

	public static void main(String[] args) {
		
		TreeSet<Person> treeSet = new TreeSet<Person>();
		
		treeSet.add(new Person("홍길동", 45));
		treeSet.add(new Person("김겨울", 25));
		treeSet.add(new Person("김가을", 15));
		
		Iterator<Person> iterator = treeSet.iterator();
		while(iterator.hasNext()) {
			Person person = iterator.next();
			System.out.println(person.name + " : " + person.age);
		}
		
	}

}
