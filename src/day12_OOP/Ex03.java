package day12_OOP;

import java.io.IOException;
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("윈도우 실행 명령어 입력");
		String s = input.next();
		ProcessBuilder pro = new ProcessBuilder(s);
		
		//pro.start(); // 에러뜸. 마우스 올렸을때 try catch 뜨는거 눌러주면됨
		try {
			pro.start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
