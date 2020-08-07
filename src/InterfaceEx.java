interface PhoneInterface{
	int BUTTONS = 20;
	void sendCall();
	void receiveCall();
}
interface MobilePhoneInterface
	extends PhoneInterface{
	void sendSMS();
	void receiveSMS();
}
interface MP3Interface {
	public void play();
	public void stop();
	public void kill();
}
interface ApmobileInterface {
	public void lalala();
}

class PDA {
	public int calculate(int x, int y) {
	return x + y;
	}
}

class SmartPhone extends PDA implements
	MobilePhoneInterface, MP3Interface , ApmobileInterface  {
	public void sendCall() { System.out.println("전화걸기"); }
	public void receiveCall() { System.out.println("전화받기"); }
	public void sendSMS() { System.out.println("SMS 보내기"); }
	public void receiveSMS() { System.out.println("SMS 받기"); }
	public void play() { System.out.println("음악재생ㅋㅋ"); }
	public void stop() { System.out.println("재생중지"); }
	public void kill() { System.out.println("안녕하세요 자바 코딩세계로 오신걸 환영합니다."); }
	public void lalala() { System.out.println("에이프로젠 제약 IT개발팀 문지현 주임"); }
	public void schedule() { System.out.println("일정관리"); }
}

public class InterfaceEx{
	public static void main(String [] args) {
		SmartPhone p = new SmartPhone();
		p.sendCall();
		p.play();
		p.kill();
		p.lalala();
		System.out.println(p.calculate(2343,5454523));
		p.schedule();
	}
}
