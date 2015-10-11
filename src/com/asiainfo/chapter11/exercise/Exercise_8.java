package com.asiainfo.chapter11.exercise;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * p227练习8
 * 
 * @author zhangzhiwang
 * @date 2015年10月11日 下午3:11:53
 */
public class Exercise_8 {
	public static void main(String[] args) {
		ArrayList<Gerbil> list = new ArrayList<Gerbil>();
		list.add(new Gerbil(1));
		list.add(new Gerbil(2));

		Iterator it = list.iterator();
		while (it.hasNext()) {
			Gerbil g = (Gerbil) it.next();
			g.hop();
		}
	}
}
