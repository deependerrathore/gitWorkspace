package tk.socialstu.objects;
//This is the disk class
public class Disk extends Storage {

	private final int speed;
	public Disk(int size, String type,int speed) {
		super(size, type);
		this.speed = speed;
	}
	
	public int getSpeed(){
		return speed;
	}

	public int getSize() {
		return size;
	}
	
}
