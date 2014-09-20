package tk.socialstu.objects;

public class Laptop {
	private final String model;
	private final int size;
	private final Memory[] memory;
	private final Disk[] disk;
	private boolean on;
	private String[] applications;
	
	public Laptop(String model, int size, Memory[] memory, Disk[] disk) {
		this.model = model;
		this.size = size;
		this.memory = memory;
		this.disk = disk;
	}
	
	public String getModel() {
		return model;
	}

	

	public Memory[] getMemory() {
		return memory;
	}

	
	public Disk[] getDisk() {
		return disk;
	}

	
	public int getSize() {
		return size;
	}


	public String[] getApplications() {
		return applications;
	}

	public void setApplications(String[] applications) {
		this.applications = applications;
	}

	public void turnOn(){
		on = true;
	}
	
	public void turnOff(){
		on = false;
	}
	public boolean isOn(){
		return on;
	}
}
