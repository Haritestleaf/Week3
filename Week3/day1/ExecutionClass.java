package Week3.day1;

public class ExecutionClass {

	public static void main(String[] args) {
		
		Mobile Mobj = new Mobile();
		Mobj.makeCall();
		Mobj.sendMsg();
		Mobj.saveContact();
		
		System.out.println("***********************************");
		AndroidPhone Apobj = new AndroidPhone();
		Apobj.makeCall();
		Apobj.takeVideo();
		
		System.out.println("***********************************");
		
		SmartPhone Sobj = new SmartPhone();
		Sobj.makeCall();
		Sobj.takeVideo();
		Sobj.connectWhatsapp();
		
	}
}
