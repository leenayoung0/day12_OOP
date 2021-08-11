package day12_OOP;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex01 {
	public static void main(String[] args) {
		long time = System.currentTimeMillis(); // 초단위를 가져옴. 천분의 1초 (그래서 long으로 처리를 해야함)
		System.out.println( time ); // 우리가 알 수 있는 방식이 아님
		
		// 형식을 변형해 주기
		SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd aa hh:mm:ss");
			//SimpleDateFormat s = new SimpleDateFormat("yyyy년MM월dd일 aa hh시mm분ss초"); // 이렇게 해도 됨
		String str = s.format(time);
		System.out.println(str);
		
		Date d = new Date(); // 미국 표기법
		System.out.println("date : "+d);
		System.out.println("format(d) : "+s.format(d));
		
		//이건 자바기초 책에 있길래 해보신거
		Calendar cal = Calendar.getInstance(); //객체가 갖고 있는 값을 그냥 보여주는거. 크게 쓸일 없고 생각할 필요 없음.
		System.out.println("cal : "+cal);
		System.out.println( cal.get(Calendar.YEAR));
		System.out.println( cal.get(Calendar.MONTH)+1); // 이렇게 0월~11월로 나오는게 있음. +1해줘야 함
		System.out.println( cal.get(Calendar.DATE));
		
		
		
	}

}
