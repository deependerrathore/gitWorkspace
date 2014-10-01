package tk.socialstu.objects;

//Test class of JUnit
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class LaptopBagTest {

	@Test
	public void test() {

		
		List<Storage> storageList = new ArrayList<Storage>();
		storageList.add(new Memory(4096,"DIMM"));
		storageList.add(new Memory(4096,"DIMM"));
		storageList.add(new Disk(512,"SATA"));
		Laptop lappy = new Laptop("Macbook Pro", 15, storageList);
		Set<String> applications = new HashSet<String>();
		applications.add("Eclispse");
		applications.add("bit Torrent");
		lappy.setApplications(applications);
		assertEquals(520 , lappy.totalStorage());
		lappy.turnOn();

		LaptopBag bag = new LaptopBag(15);
		bag.insertLaptop(lappy);

		System.out.println(bag);

	}

}
