package by.htp.les02.main;

import java.util.Scanner;

public class Operator {

	public static void main(String[] args) {

		double a = 0;
		double b = 0;
		double c = 0;

		Scanner sc = new Scanner(System.in);

		//////////////////////////

		System.out.println("������� a: ");

		while (!sc.hasNextDouble()) {
			sc.nextDouble();
			System.out.println("������� a: ");
		}
		a = sc.nextDouble();

		System.out.println("������� b: ");

		while (!sc.hasNextDouble()) {
			sc.nextDouble();
			System.out.println("������� b: ");
		}
		b = sc.nextDouble();

		///////////////////////////

		System.out.println("������� c: ");

		while (!sc.hasNextDouble()) {
			sc.nextDouble();
			System.out.println("������� c: ");
		}
		c = sc.nextDouble();

		double temp;
		double z;

		temp = 2 * a;

		if (temp != 0) {
			z = b + Math.sqrt((Math.pow(b, 2)) + 4 * a * c) / temp - (Math.pow(a, 3)) * c + b;
		} else {
			System.out.println("����������� ����� ����");
			z = Double.NaN;
		}
		System.out.println("z=" + z);

	}

}