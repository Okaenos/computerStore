package computerStore;

public class GraphicCard {
	public String name;
	public int memory;
	public int bit;
	public boolean hdmi;
	public boolean vga;
	public String mark;
	public void printInfo() {
		System.out.println(this.name.toUpperCase());
		System.out.println(this.vga?"vga":"yok");
		System.out.println(this.name);
		System.out.println("Gbyte:" + this.memory);
		System.out.println("bit:"+this.bit);
		System.out.println(this.hdmi?"hdmi":"yok");
		System.out.println(" ");
	}
	public void printHdmi() {
		System.out.println(this.hdmi?"var":"yok");
	}
	
}
