package net;

import java.net.InetAddress;
import java.net.InetSocketAddress;

public class TestPort {
	public static void main(String[] args) {
		InetSocketAddress inetSocketAddress = new InetSocketAddress("127.0.0.1", 8082);
		System.out.println(inetSocketAddress.getHostName());
		// ���InetSocketAddress�Ķ˿�
		System.out.println(inetSocketAddress.getPort());
		System.out.println(inetSocketAddress.getHostString());
		// ����һ��InetAddress����IP����
		InetAddress address = inetSocketAddress.getAddress();
		System.out.println(address.getHostAddress());
	}
}
