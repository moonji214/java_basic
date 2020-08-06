
public class Point {
	private int x, y; // 한점을구성하는x, y 좌표
	Point() {
	this.x= this.y= 0;
	}
	Point(int x, int y) {
	this.x= x; this.y= y;
	}
	void showPoint() { // 점의좌표출력
	System.out.println("(" + x + "," + y + ")");
	}
	
}

class ColorPoint extends Point {
	private String color; // 점의색
	ColorPoint(int x, int y, String color) {
	super(x, y); // Point의생성자Point(x, y) 호출
	this.color= color;
	}
	void showColorPoint() { // 컬러점의좌표출력
	System.out.print(color);
	showPoint(); // Point 클래스의showPoint() 호출
	}
}

