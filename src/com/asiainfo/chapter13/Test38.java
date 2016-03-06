package com.asiainfo.chapter13;

import java.util.Scanner;
import java.util.regex.MatchResult;

/**
 * 用正则表达式扫描
 * 
 * @author Zhiwang Zhang
 * @date 2016年3月6日 下午7:34:55
 */
public class Test38 {
	public static void main(String[] args) {
		String input = "192.168.0.0@01/01/2016\n255.255.255.255@03/06/2016\nasdfasdfasdfasdfasdf";
		Scanner scanner = new Scanner(input);
		String regex = "(\\d+.\\d+.\\d+.\\d+)@(\\d{2}/\\d{2}/\\d{4})";
		while (scanner.hasNext(regex)) {
			String context = scanner.next(regex);//将指针移动到下一个位置
			MatchResult matchResult = scanner.match();
			String ip = matchResult.group(1);
			String date = matchResult.group(2);
			System.out.format("Threat on %s from %s\n", date, ip);
		}
	}
}
