package CHAPTER13_Generic.example07_inheritance;

public class ChildProductAndStorageExample {

	public static void main(String[] args) {
		ChildProduct<Tv, String, String> product = new ChildProduct<>();
		product.setKind(new Tv());
		product.setModel("SmartTv");
		product.setCompany("samsung");
		
		Storage<Tv> storage = new StorageImpl<Tv>();
		storage.add(new Tv(), 0);
		Tv tv = storage.get(0);
		
		
	}

}
