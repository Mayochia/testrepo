/**
 * 
 */
package test;

import java.util.Scanner;

/**
 * 
 */
public class reg {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int money = 120;
		int cost = 100;
		int lack = cost-money;
		int change = money - cost;
		int i = 0;
		int prev;
		Scanner input = new Scanner(System.in);
		System.out.println("Hello");
		
		while(i < 2) {
			if (money < cost) {
				prev = money;
				System.out.println("You lack : " +lack);
				System.out.println("Add money : ");
				money = input.nextInt();
				money = prev + money;
				
			}
			i++;
		}
//			return;
		System.out.println("Your change: " + change);
	}
}




