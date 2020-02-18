package net;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestIP {
	public static void main(String[] args) throws UnknownHostException {
		InetAddress inetAddress = InetAddress.getByName("www.baidu.com");
		// 获取此 IP 地址的主机名。
		System.out.println(inetAddress.getHostName());
		// 返回 IP 地址字符串（以文本表现形式）。
		System.out.println(inetAddress.getHostAddress());
	}
}
