package org.system;

public class Desktop extends Computer {
	public void desktopSize() {
     System.out.println("Display size is 15.6 inch ");
	}
	
	public static void main(String[] args) {
		
	
	Desktop Deskobj = new Desktop();
	Deskobj.computerModel();
	Deskobj.desktopSize();
	}
}
