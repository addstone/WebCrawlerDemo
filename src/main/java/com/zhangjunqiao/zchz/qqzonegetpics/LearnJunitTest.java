package com.zhangjunqiao.zchz.qqzonegetpics;
/**
 * 
 * @author zjq
 * @aim 学习junit测试类
 *
 */
public class LearnJunitTest {

	public String login(String str) throws Exception {
		if (str.equals("right"))
			return "YES";
		else {
			throw new Exception("error");
		}
	}

	public String login2(String str) throws Exception {
		if (str.equals("right"))
			return "YES";
		else
			return "NO";
	}
}
