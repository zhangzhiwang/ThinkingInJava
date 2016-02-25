package com.asiainfo.chapter13.exercise;

import java.util.Formatter;

/**
 * p292练习4
 * 
 * @author zhangzw8
 * @date 2016年2月25日 下午8:24:49
 */
public class Exercise_4 {
	private Formatter f = new Formatter(System.out);
	private double total;
	private static final int WIDTH = 15;

	public void printTitle() {
		f.format("%-" + WIDTH + "s %" + WIDTH + "s %" + WIDTH + "s\n", "Item", "Qty", "Price");
		f.format("%-" + WIDTH + "s %" + WIDTH + "s %" + WIDTH + "s\n", "---", "---", "---");
	}

	public void print(String name, int qty, double price) {
		f.format("%-" + WIDTH + "s %" + WIDTH + "d %" + (WIDTH + 0.2) + "f\n", name, qty, price);
		total += price;
	}

	public void printTotal() {
		f.format("%-" + WIDTH + "s %" + WIDTH + "s %" + (WIDTH + 0.2) + "f\n", "Tax", "", total * 0.06);
		f.format("%-" + WIDTH + "s %" + WIDTH + "s %" + WIDTH + "s\n", "", "", "---");
		f.format("%-" + WIDTH + "s %" + WIDTH + "s %" + (WIDTH + 0.2) + "f\n", "Total", "", total * 1.06);
	}

	public static void main(String[] args) {
		Exercise_4 e = new Exercise_4();
		e.printTitle();
		e.print("Jack", 4, 4.25);
		e.print("Pri", 3, 5.1);
		e.print("Three", 1, 14.29);
		e.printTotal();
	}
}
