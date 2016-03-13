package com.asiainfo.chapter14.exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;


/**
 * p333练习14
 * 
 * @author Zhiwang Zhang
 * @date 2016年3月13日 上午11:23:44
 */
public class Exercise_14 {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		for (int i = 1; i <= 10; i++) {
			System.out.println(Plant2.createRandom());
		}
	}
}

class Plant2 {
	static List<Class<? extends Plant>> list = new ArrayList<Class<? extends Plant>>();
	static Random r = new Random(47);
	
	static {
		list.add(Cabbage.class);
		list.add(Potato.class);
		list.add(Tomato.class);
		list.add(Orange.class);
		list.add(Apple.class);
	}
	
	public static Plant createRandom() throws InstantiationException, IllegalAccessException {
		return list.get(r.nextInt(list.size())).newInstance();
	}
}