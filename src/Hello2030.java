
import java.util.Scanner;
import java.util.Vector;

public class Hello2030 {
	public static void main(String[]args) {
		
		/*System.out.println("이름, 도시, 나이, 체중, 독신여부를빈칸으로분리하여입력하세요");
		Scanner scanner= new Scanner(System.in);
		String name = scanner.next();
		System.out.println("당신의이름은" + name + "입니다.");
		String city = scanner.next();
		System.out.println("당신이사는도시는" + city + "입니다.");
		int age = scanner.nextInt();
		System.out.println("당신의나이는" + age + "살입니다.");
		double weight = scanner.nextDouble(); // 실수토큰읽기
		System.out.println("당신의체중은" + weight + "kg입니다.");
		boolean single = scanner.nextBoolean();
		System.out.println("당신은독신여부는" + single + "입니다.");
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
		System.out.print("월(1~12)을입력하시오:"); 
		int month = scanner.nextInt(); // 정수로월입력
		switch(month) {
		case 3:
		case 4:
		case 5:
		System.out.println("봄입니다.");
		break;
		case 6: case 7: case 8:
		System.out.println("여름입니다.");
		break;
		case 9: case 10: case 11:
		System.out.println("가을입니다.");
		break;
		case 12: case 1: case 2:
		System.out.println("겨울입니다."); break;
		default:
		System.out.println("잘못된입력입니다.");
		}
		scanner.close();*/
	}	
}

