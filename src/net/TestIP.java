package net;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestIP {
	public static void main(String[] args) throws UnknownHostException {
		InetAddress inetAddress = InetAddress.getByName("www.baidu.com");
		// ��ȡ�� IP ��ַ����������
		System.out.println(inetAddress.getHostName());
		// ���� IP ��ַ�ַ��������ı�������ʽ����
		System.out.println(inetAddress.getHostAddress());
	}
}
