package tk.socialstu.objects;

public class LaptopBag {
	private final int size;
	private Computer laptop; 
	
	public LaptopBag(int size) {
		this.size = size;
	}
	
	public void insertLaptop(Laptop laptop){
		//TODO: check reconditions :
		//	-laptop isn't too big(IAE)
		//	-bag doesn't already contain a laptop(ISE)
		if(laptop.getSize() > size){
			System.out.println("deep");
			throw new IllegalArgumentException("laptop too big to be put in laptop bag");
		}
		if(this.laptop != null){
			throw new IllegalStateException("bag already contain a laptop");
		}
		
		this.laptop = laptop;
	}

	public Computer getLaptop(){
		return laptop;
	}
	public int getSize() {
		return size;
	}


}
