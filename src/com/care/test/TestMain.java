package com.care.test;

import java.util.Date;

//import com.care.zzz.TestClass; // 임폴트가 추가가됨.(다른패키지이기 때문에)
//import com.care.zzz.TestClass02;
import com.care.zzz.*;//com.care.zzz하위에 모든것들을 가져다 쓰겠다~ (임폴트가 많아지면 복잡해지고 불편하니까)

public class TestMain {

	public static void main(String[] args) {
		// 같은 패키지. 임폴트가 필요없음
		Test t = new Test();
		t.test();
		
		// 다른 패키지
		TestClass tc = new TestClass();
		tc.testClass();
			// TestClass에 있는 애를 public 지워버리면 에러뜸.
		
		TestClass02 tc02 = new TestClass02();
		tc02.testClass02();
		
		
	}

}
