package template;

public class ManualCar extends Car{

	@Override
	public void drive() {
		System.out.println("����� �����մϴ�.");
		System.out.println("�縲�� �ڵ��� �����մϴ�.");
	}

	@Override
	public void stop() {
		System.out.println("����� �극��ũ�� �����մϴ�.");
	}

	@Override
	public void wiper() {
		System.out.println("����� �������� �����۸� �����մϴ�.");
	}


}
