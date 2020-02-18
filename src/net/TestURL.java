package net;

import java.net.MalformedURLException;
import java.net.URL;

public class TestURL {
	public static void main(String[] args) throws MalformedURLException {

		URL url2 = new URL("https://www.bilibili.com/");

		// ��ȡ�˵���Ȩ���� URL ��
		System.out.println(url2.getAuthority());

		// ��ȡ�� URL���ļ�����
		System.out.println(url2.getFile());

		// ��ȡ�˿�
		System.out.println(url2.getPort());

		// ��ȡ����
		System.out.println(url2.getHost());

		// ���Ĭ�϶˿�
		System.out.println(url2.getDefaultPort());

		// ���·��
		System.out.println(url2.getPath());

		// ��ȡ�� URL��userInfo���֡�
		System.out.println(url2.getUserInfo());
	}
}
