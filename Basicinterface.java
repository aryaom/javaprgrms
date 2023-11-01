package OOPS;
interface Tvremote
{
	public void on();
	public void off();
}
interface Smarttvremote extends Tvremote
{
	public void bluetooth();
	public void usb();
}
class Tv implements Smarttvremote
{

	@Override
	public void on() {
		System.out.println("on");
		
	}

	@Override
	public void off() {
		System.out.println("off");
		
	}
	

	@Override
	public void bluetooth() {
		System.out.println("bluetooth");
		
	}

	@Override
	public void usb() {
		System.out.println("USB");
		
	}

	
}


public class Basicinterface {

	public static void main(String[] args) {
		Tv t=new Tv();
		t.on();
		t.off();
		t.bluetooth();
		t.usb();
	}

}
