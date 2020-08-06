
public class Point {
	private int x, y; // �����������ϴ�x, y ��ǥ
	Point() {
	this.x= this.y= 0;
	}
	Point(int x, int y) {
	this.x= x; this.y= y;
	}
	void showPoint() { // ������ǥ���
	System.out.println("(" + x + "," + y + ")");
	}
	
}

class ColorPoint extends Point {
	private String color; // ���ǻ�
	ColorPoint(int x, int y, String color) {
	super(x, y); // Point�ǻ�����Point(x, y) ȣ��
	this.color= color;
	}
	void showColorPoint() { // �÷�������ǥ���
	System.out.print(color);
	showPoint(); // Point Ŭ������showPoint() ȣ��
	}
}

