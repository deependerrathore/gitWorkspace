package tk.socialstu.objects;
//This is the disk class
public class Disk {
	private int size;	//size of the disk
	private String type;//type of the disk like SSD ,HDD
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
