package objects;

import static org.junit.Assert.*;

import org.junit.Test;

public class LaptopBagTest {

	@Test
	public void test() {
		Laptop lappy = new Laptop();
		lappy.model ="Macbook Pro";
		lappy.size=15;
		Memory[] memory = {new Memory(),new Memory()};
		memory[0].size = 8;
		memory[0].type = "DIMM";
		memory[1].size = 8;
		memory[1].type ="DIMM";
		
		lappy.memory = memory;
		lappy.memory[0].size =10;
		System.out.println(memory[0].size);
		
		Disk[] disks = {new Disk(),new Disk()};
		
		disks[0].size =1024;
		disks[0].type="HDD";
		disks[1].size = 512;
		disks[1].type = "SSD";
		
		lappy.disk = disks;
		
		LaptopBag bag = new LaptopBag();
		bag.contents=lappy;
		System.out.println(bag);
	}

}
