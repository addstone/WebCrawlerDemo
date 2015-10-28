package com.zhangjunqiao.junittest;

import junit.framework.TestCase;
import com.zhangjunqiao.zchz.qqzonegetpics.LearnJunitTest;

/**
 * 
 * @author zjq
 * @aim 学习junit测试类
 *
 */

public class JunitTest extends TestCase {      //说是测试类得加TestCase
	public void testUser_Success() throws Exception {
		LearnJunitTest a = new LearnJunitTest();

		// 调用被测试方法
		String result = a.login("right");
		//判断测试是否通过
		 assertEquals("YES", result);
		 
		 String result2 = a.login2("right");
		 
		 assertEquals("YES", result2);
	}
}
