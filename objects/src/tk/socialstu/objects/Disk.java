package tk.socialstu.objects;
//This is the disk class
public class Disk {

	private final int size;	//size of the disk
	private final String type;//type of the disk like SSD ,HDD
	
	public Disk(int size, String type) {
		this.size = size;
		this.type = type;
	}
	
	public int getSize() {
		return size;
	}
	
	public String getType() {
		return type;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + size;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Disk other = (Disk) obj;
		if (size != other.size)
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}
	
}
