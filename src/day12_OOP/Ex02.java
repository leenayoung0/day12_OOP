package day12_OOP;

public class Ex02 {
	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(3000); // 들어가는 숫자만큼 대기 시켜줍니다~
			}catch (Exception e) {
				// TODO: handle exception
			}
		}
		System.out.println("다음 문장들 실행!!!");
	}

}
