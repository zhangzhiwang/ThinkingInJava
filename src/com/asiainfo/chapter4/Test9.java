/**
 * 
 */
package com.asiainfo.chapter4;

/**
 * 标签(for loop)
 * 
 * @author zhangzhiwang 2015年7月13日
 */
public class Test9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i = 0;
		aaa: for (;;) {
			bbb: for (; i < 17; i++) {
				System.out.println("i = " + i);
				if (i == 2) {
					System.out.println("continue");
					continue;
				}

				if (i == 4) {
					System.out.println("break");
					i++;
					break;
				}

				if (i == 6) {
					System.out.println("continue aaa");
					i++;
					continue aaa;
				}

				if (i == 8) {
					System.out.println("break aaa");
					i++;
					break aaa;
				}

				for (int j = 0; j < 5; j++) {
					if (j == 3) {
						System.out.println("continue bbb");
						continue bbb;
					}
				}
			}
		}
	}

}
