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
	public void sendCall() { System.out.println("��ȭ�ɱ�"); }
	public void receiveCall() { System.out.println("��ȭ�ޱ�"); }
	public void sendSMS() { System.out.println("SMS ������"); }
	public void receiveSMS() { System.out.println("SMS �ޱ�"); }
	public void play() { System.out.println("�����������"); }
	public void stop() { System.out.println("�������"); }
	public void kill() { System.out.println("�ȳ��ϼ��� �ڹ� �ڵ������ ���Ű� ȯ���մϴ�."); }
	public void lalala() { System.out.println("���������� ���� IT������ ������ ����"); }
	public void schedule() { System.out.println("��������"); }
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
