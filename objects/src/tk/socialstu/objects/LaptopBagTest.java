package tk.socialstu.objects;

//Test class of JUnit
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class LaptopBagTest {

	@Test
	public void test() {

		
		List<Storage> storageList = new ArrayList<Storage>();
		storageList.add(new Memory(4096,"DIMM"));
		storageList.add(new Memory(4096,"DIMM"));
		storageList.add(new Disk(512,"PATA",5400));
		Laptop lappy = new Laptop("Macbook Pro", 15, storageList);
		
		lappy.installApplication("Eclipse");
		lappy.installApplication("Bit Torrent");
		assertEquals(520 , lappy.totalStorage());
		lappy.turnOn();

		LaptopBag bag = new LaptopBag(15);
		bag.insertLaptop(lappy);

		System.out.println(bag);

	}

}
