package org.system;

public class Desktop extends Computer {

	public static void main(String[] args) {
		Computer c= new Computer();
		c.computermodel();
		Desktop d =new Desktop();
		d.desktopsize();
	}
   
	public void desktopsize() {
		System.out.println("DesktopSize 5.5cm");
	}
}
