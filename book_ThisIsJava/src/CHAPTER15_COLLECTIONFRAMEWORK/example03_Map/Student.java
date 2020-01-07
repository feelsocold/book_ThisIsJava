package CHAPTER15_COLLECTIONFRAMEWORK.example03_Map;

public class Student {

	String name;
	int number;
	
	public Student(int number, String name) {
	
		this.name = name;
		this.number = number;
			
	}
	
	public boolean equals(Object obj) {
		
		if(obj instanceof Student) {
			Student student = (Student)obj;
			return (name == student.name) && (name.equals(student.name)) ;
		}else {
			return false;
		}

	}
	
	public int hashCode() {
		return number + name.hashCode();
	}
}
