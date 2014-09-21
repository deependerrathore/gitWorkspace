package tk.socialstu.objects;

//Test class of JUnit
import static org.junit.Assert.*;

import org.junit.Test;

public class LaptopBagTest {

	@Test
	public void test() {

		Storage[] storage = { new Memory(8, "DIMM"), new Memory(8, "DIMM"),
				new Disk(512, "SATA"), new Disk(1024, "SATA") };
		Laptop lappy = new Laptop("Macbook Pro", 15, storage);

		lappy.turnOn();

		LaptopBag bag = new LaptopBag(15);
		bag.insertLaptop(lappy);

		System.out.println(bag);

	}

}
