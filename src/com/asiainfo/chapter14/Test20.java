package com.asiainfo.chapter14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * p327 14.3.1测试（需要结合Test18）
 * 
 * @author Zhiwang Zhang
 * @date 2016年3月12日 下午1:04:15
 */
public class Test20 {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		PetCount.countPets(Pets.CREATOR);
	}
}

class LiteralPetCreator extends PetCreator {
	public static List<Class<? extends Pet>> allTypes = new ArrayList<Class<? extends Pet>>(Arrays.<Class<? extends Pet>>asList(Pet.class, Rodent.class, Dog.class, Cat.class, Mouse.class, Rat.class, Hamster.class, Pug.class, Mutt.class, Cymric.class, EgyptianMau.class, Manx.class, Gerbil.class));//for Excercise_11
	public static List<Class<? extends Pet>> types = allTypes.subList(allTypes.indexOf(Mouse.class), allTypes.size());
	
	@Override
	public List<Class<? extends Pet>> types () {
		return types;
	}
}

class Pets {
	public static final PetCreator CREATOR = new LiteralPetCreator();
}