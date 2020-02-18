package net;

import java.net.InetAddress;
import java.net.InetSocketAddress;

public class TestPort {
	public static void main(String[] args) {
		InetSocketAddress inetSocketAddress = new InetSocketAddress("127.0.0.1", 8082);
		System.out.println(inetSocketAddress.getHostName());
		// 获得InetSocketAddress的端口
		System.out.println(inetSocketAddress.getPort());
		System.out.println(inetSocketAddress.getHostString());
		// 返回一个InetAddress对象（IP对象）
		InetAddress address = inetSocketAddress.getAddress();
		System.out.println(address.getHostAddress());
	}
}
