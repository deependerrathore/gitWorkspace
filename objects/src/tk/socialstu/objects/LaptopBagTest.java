package tk.socialstu.objects;
//Test class of JUnit
import static org.junit.Assert.*;

import org.junit.Test;

public class LaptopBagTest {

	@Test
	public void test() {
		Memory m1 = new Memory(8,"DIMM"), m2 = new Memory(8,"DIMM");
		
		assertFalse(m1 == m2);
		assertTrue(m1.equals(m2));
		
		
		Memory[] memory = {m1,m2};
//		memory[0].setType("DIMM");
//		memory[0].setSize(8);
//		memory[1].setType("DIMM");
//		memory[1].setSize(8);
		
//		lappy.setMemory(memory);
		
		Disk[] disks = {new Disk(512,"SATA"),new Disk(1024,"SATA")};
		
//		disks[0].setSize(1024);
//		disks[0].setType("HDD");
//		disks[1].setSize(1024);
//		disks[1].setType("HDD");
//		
//		lappy.setDisk(disks);
		Laptop lappy = new Laptop("Macbook Pro",15 ,memory,disks);
		
		lappy.turnOn();
		
		LaptopBag bag = new LaptopBag(15);
		bag.insertLaptop(lappy);
		
		System.out.println(bag);
		
		
	}

}
