public class ListApp {

	public static void main(String[] args) {
		
		ArrayList<String> stringList = new ArrayList<String>();
		stringList.addItem("apple");
		stringList.addItem("banana");
		stringList.addItem("orange");
		System.out.println("String List: " + stringList.toString());
		
		ArrayList<Square> squareList = new ArrayList<Square>();
		squareList.addItem(new Square(5.0));
		squareList.addItem(new Square(3.0));
		squareList.addItem(new Square(2.0));
		System.out.println("Square List: " + squareList.toString());
		
		ArrayList<PointThreeD> pointList = new ArrayList<PointThreeD>();
		pointList.addItem(new PointThreeD(1.0, 2.0, 3.0));
		pointList.addItem(new PointThreeD(4.0, 5.0, 6.0));
		pointList.addItem(new PointThreeD(7.0, 8.0, 9.0));
		System.out.println("Point List: " + pointList.toString());

	}

}
