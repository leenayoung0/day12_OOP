package com.care.test;

import java.util.Date;

//import com.care.zzz.TestClass; // ����Ʈ�� �߰�����.(�ٸ���Ű���̱� ������)
//import com.care.zzz.TestClass02;
import com.care.zzz.*;//com.care.zzz������ ���͵��� ������ ���ڴ�~ (����Ʈ�� �������� ���������� �����ϴϱ�)

public class TestMain {

	public static void main(String[] args) {
		// ���� ��Ű��. ����Ʈ�� �ʿ����
		Test t = new Test();
		t.test();
		
		// �ٸ� ��Ű��
		TestClass tc = new TestClass();
		tc.testClass();
			// TestClass�� �ִ� �ָ� public ���������� ������.
		
		TestClass02 tc02 = new TestClass02();
		tc02.testClass02();
		
		
	}

}
