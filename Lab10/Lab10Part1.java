public class Lab10Part1 {
	public static void main(String[] args) {
		MyArrayList list = new MyArrayList();
		list.add("first");
		list.add("second");
		list.add("third");
		list.add("fourth");
		list.add("fifth");

		int rand = (int) (Math.random() * 5);
		Object obj = list.get(rand);
		if (obj instanceof String) {
			String s = (String) obj;
			String sU = s.toUpperCase();
			System.out.println(sU);
		}

	}
}