package net;

import java.net.MalformedURLException;
import java.net.URL;

public class TestURL {
	public static void main(String[] args) throws MalformedURLException {

		URL url2 = new URL("https://www.bilibili.com/");

		// 获取此的授权部分 URL 。
		System.out.println(url2.getAuthority());

		// 获取此 URL的文件名。
		System.out.println(url2.getFile());

		// 获取端口
		System.out.println(url2.getPort());

		// 获取主机
		System.out.println(url2.getHost());

		// 获得默认端口
		System.out.println(url2.getDefaultPort());

		// 获得路径
		System.out.println(url2.getPath());

		// 获取该 URL的userInfo部分。
		System.out.println(url2.getUserInfo());
	}
}
