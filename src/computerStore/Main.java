package computerStore;

public class Main {

	public static void main(String[] args) {
		GraphicCard gk1 = new GraphicCard();
		gk1.name = "Asus Rtx 3090";
		gk1.memory = 32;
		gk1.bit= 256;
		gk1.hdmi=false;
		gk1.vga=true;
		GraphicCard gk2 = new GraphicCard();
		gk2.name = "Gforce 3390";
		gk2.memory = 8;
		gk2.bit=384;
		gk2.hdmi=true;
		gk2.vga=false;
		Processor proc=new Processor();
		proc.name="intel core i7";
		proc.workSpeed=3.46;
		proc.memory=24;
		proc.bit=36;
		proc.core=6;
		proc.damage=false;
		
		
		gk1.printInfo();
		gk2.printInfo();
		gk2.printHdmi();
	}

}
