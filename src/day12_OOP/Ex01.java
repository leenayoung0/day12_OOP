package day12_OOP;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex01 {
	public static void main(String[] args) {
		long time = System.currentTimeMillis(); // �ʴ����� ������. õ���� 1�� (�׷��� long���� ó���� �ؾ���)
		System.out.println( time ); // �츮�� �� �� �ִ� ����� �ƴ�
		
		// ������ ������ �ֱ�
		SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd aa hh:mm:ss");
			//SimpleDateFormat s = new SimpleDateFormat("yyyy��MM��dd�� aa hh��mm��ss��"); // �̷��� �ص� ��
		String str = s.format(time);
		System.out.println(str);
		
		Date d = new Date(); // �̱� ǥ���
		System.out.println("date : "+d);
		System.out.println("format(d) : "+s.format(d));
		
		//�̰� �ڹٱ��� å�� �ֱ淡 �غ��Ű�
		Calendar cal = Calendar.getInstance(); //��ü�� ���� �ִ� ���� �׳� �����ִ°�. ũ�� ���� ���� ������ �ʿ� ����.
		System.out.println("cal : "+cal);
		System.out.println( cal.get(Calendar.YEAR));
		System.out.println( cal.get(Calendar.MONTH)+1); // �̷��� 0��~11���� �����°� ����. +1����� ��
		System.out.println( cal.get(Calendar.DATE));
		
		
		
	}

}
