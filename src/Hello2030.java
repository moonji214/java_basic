
import java.util.Scanner;
import java.util.Vector;

public class Hello2030 {
	public static void main(String[]args) {
		
		/*System.out.println("�̸�, ����, ����, ü��, ���ſ��θ���ĭ���κи��Ͽ��Է��ϼ���");
		Scanner scanner= new Scanner(System.in);
		String name = scanner.next();
		System.out.println("������̸���" + name + "�Դϴ�.");
		String city = scanner.next();
		System.out.println("����̻�µ��ô�" + city + "�Դϴ�.");
		int age = scanner.nextInt();
		System.out.println("����ǳ��̴�" + age + "���Դϴ�.");
		double weight = scanner.nextDouble(); // �Ǽ���ū�б�
		System.out.println("�����ü����" + weight + "kg�Դϴ�.");
		boolean single = scanner.nextBoolean();
		System.out.println("��������ſ��δ�" + single + "�Դϴ�.");
		scanner.close();*/
		
		Circle aaa = new Circle();
		//aaa.stradius  =2;
		//aaa.GettoString();
		Circle.stradius =10;
		System.out.println(Circle.GettoString());
		System.out.println(aaa.getClass() +"" + aaa.toString());

				
		/*Integer bbb = new Integer(10);
		System.out.println (Integer.bitCount(100));*/
		Vector<Circle> aaaa = new Vector<Circle>();
		
		
		/* scanner= new Scanner(System.in);
		System.out.print("��(1~12)���Է��Ͻÿ�:"); 
		int month = scanner.nextInt(); // �����ο��Է�
		switch(month) {
		case 3:
		case 4:
		case 5:
		System.out.println("���Դϴ�.");
		break;
		case 6: case 7: case 8:
		System.out.println("�����Դϴ�.");
		break;
		case 9: case 10: case 11:
		System.out.println("�����Դϴ�.");
		break;
		case 12: case 1: case 2:
		System.out.println("�ܿ��Դϴ�."); break;
		default:
		System.out.println("�߸����Է��Դϴ�.");
		}
		scanner.close();*/
	}	
}

