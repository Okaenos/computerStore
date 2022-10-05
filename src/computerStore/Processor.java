package computerStore;

public class Processor {
	public String name;
	public int core;
	public double workSpeed;
	public int bit;
	public int memory;
	public boolean damage;
	public void printInfo() {
		System.out.println("İsim :"+this.name);
		System.out.println("Maksimum Bellek Alanı:"+this.memory);
		System.out.println("Çalışma hızı:"+this.workSpeed);
		System.out.println("Bit Sayısı:"+this.bit);
		System.out.println("Çekirdek Sayısı:"+this.core);
		System.out.println(this.damage?"Hasarlı":"Hasarsız");
		
		System.out.println(" ");
	}
}
