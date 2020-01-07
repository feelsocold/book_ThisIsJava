package CHAPTER15_CollectionFramework.example04_Tree;

import java.util.TreeSet;


// 특정 객체 찾기 
public class TreeSetExample1 {

	public static void main(String[] args) {
		
		TreeSet<Integer> scores = new TreeSet<Integer>();
		scores.add(new Integer(97));
		scores.add(new Integer(55));
		scores.add(new Integer(23));
		scores.add(new Integer(12));
		scores.add(new Integer(86));
		
		Integer score = null;
		
		score = scores.first();
		System.out.println("가장 낮은 점수 : " + score);
		
		score = scores.last();
		System.out.println("가장 높은 점수 : " + score + "\n");
		
		score = scores.lower(new Integer(95));
		System.out.println("95점 아래 점수 : " + score);
		
		score = scores.higher(95);
		System.out.println("95점 위의 점수 : " + score + "\n");
		
		score = scores.floor(95);
		System.out.println("95점 이거나 바로 아래 점수 : " + score);
		
		score = scores.ceiling(85);
		System.out.println("85점 이거나 바로 위 점수 : " + score);
		
		System.out.println();
		
		while(!scores.isEmpty()){
			score = scores.pollFirst();
			System.out.println(score + " (남은 객체 수 : " + scores.size() + ")");
		}
				
		
		
				
	}

}
