package Week3.day2;

import Week3.day1.Mobile;

public class Desktop extends Mobile implements HardWare,Software {

	public void softwareResources() {
		System.out.println("softwareResources");
	}

	public void hardwareResources() {
		System.out.println("hardwareResources");
	}

	public void desktopModel() {
		System.out.println("desktopModel");
	}
	public static void main(String[] args) {
		Desktop D = new Desktop();
		D.desktopModel();
		D.hardwareResources();
		D.softwareResources();
		D.CommonMth();
		D.makeCall();
	}

	public void CommonMth() {
       System.out.println("CommonMth");		
	}
}
