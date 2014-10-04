package tk.socialstu.objects;

public class Memory extends Storage{
	
	public Memory(int size, String type) {
		super(size, type);
	}
	
	public int getSize() {
		return this.size/1024;
	}

}
