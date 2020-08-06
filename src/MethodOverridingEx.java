class Shape { // 도형의슈퍼클래스
	public void draw() {
	System.out.println("Shape");
	}
}
class Line extends Shape {
	public void draw() { // 메소드오버라이딩
	System.out.println("Line");
	}
}
class Rect extends Shape {
	public void draw() { // 메소드오버라이딩
	System.out.println("Rect");
	}
}
class mj extends Shape {
	public void draw() { // 메소드오버라이딩
	System.out.println("circle");
	}
}

public class MethodOverridingEx{
	static void paint(Shape p) { // Shape을상속받은객체들이
	// 매개변수로넘어올수있음
	p.draw(); // p가가리키는객체에오버라이딩된draw() 호출.
	// 동적바인딩
	}
	public static void main(String[] args) {
		Line line= new Line();
		paint(line); // Line의draw() 실행. "Line" 출력
		paint(new Shape()); // Shape의draw() 실행. "Shape" 출력
		paint(new Line()); // 오버라이딩된메소드Line의draw() 실행
		paint(new Rect()); // 오버라이딩된메소드Rect의draw() 실행
		paint(new mj()); // 오버라이딩된메소드Circle의draw() 실행
	}
}