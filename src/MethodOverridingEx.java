class Shape { // �����ǽ���Ŭ����
	public void draw() {
	System.out.println("Shape");
	}
}
class Line extends Shape {
	public void draw() { // �޼ҵ�������̵�
	System.out.println("Line");
	}
}
class Rect extends Shape {
	public void draw() { // �޼ҵ�������̵�
	System.out.println("Rect");
	}
}
class mj extends Shape {
	public void draw() { // �޼ҵ�������̵�
	System.out.println("circle");
	}
}

public class MethodOverridingEx{
	static void paint(Shape p) { // Shape����ӹ�����ü����
	// �Ű������γѾ�ü�����
	p.draw(); // p������Ű�°�ü���������̵���draw() ȣ��.
	// �������ε�
	}
	public static void main(String[] args) {
		Line line= new Line();
		paint(line); // Line��draw() ����. "Line" ���
		paint(new Shape()); // Shape��draw() ����. "Shape" ���
		paint(new Line()); // �������̵��ȸ޼ҵ�Line��draw() ����
		paint(new Rect()); // �������̵��ȸ޼ҵ�Rect��draw() ����
		paint(new mj()); // �������̵��ȸ޼ҵ�Circle��draw() ����
	}
}