package com.asiainfo.chapter14;

import java.util.HashMap;
import java.util.Map;

import net.mindview.util.MapData;

/**
 * 使用Class的isInstance()方法较使用instanceof做判断的好处——提高程序的可扩展性
 * 
 * @author Zhiwang Zhang
 * @date 2016年3月12日 下午1:46:39
 */
public class Test22 {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		//以下是p329代码测试，需要结合Test18和Test20
		PetCount2.PetCounter counter = new PetCount2.PetCounter();
		for (Pet pet : Pets.CREATOR.createArray(20)) {
			System.out.print(pet.getClass().getSimpleName() + "\t");
			counter.count(pet);
		}
		System.out.println();
		System.out.println(counter);
	}
}

class PetCount2 {
	static class PetCounter extends HashMap<Class<? extends Pet>, Integer>{
		public PetCounter() {
			super(MapData.map(LiteralPetCreator.allTypes, 0));
		}
		
		public void count(Pet pet) {
			for (Map.Entry<Class<? extends Pet>, Integer> entry : entrySet()) {
				if (entry.getKey().isInstance(pet)) {
					entry.setValue(entry.getValue() + 1);
				}
			}
		}
	}
}