package day12_OOP;

import java.io.IOException;
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("������ ���� ��ɾ� �Է�");
		String s = input.next();
		ProcessBuilder pro = new ProcessBuilder(s);
		
		//pro.start(); // ������. ���콺 �÷����� try catch �ߴ°� �����ָ��
		try {
			pro.start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
