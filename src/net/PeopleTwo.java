package net;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class PeopleTwo {
	public static void main(String[] args) throws IOException {
		// 1.ָ��һ���˿ڽ��з���
		DatagramSocket socket = new DatagramSocket();
		// 2.ָ��һ��IP
		InetAddress addr = InetAddress.getByName("127.0.0.1");
		int port = 5051;
		// 3.׼��һ��С����
		byte[] sendBuf;
		while (true) {
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			System.out.println("��Ҫ��ʲô������");
			String s = scanner.nextLine();
			// 4.����Ҫ�ŵ�����
			sendBuf = s.getBytes();
			// 5.���ݴ��
			DatagramPacket packet = new DatagramPacket(sendBuf, sendBuf.length, addr, port);
			// 6.���Ͱ�
			socket.send(packet);
			if (s.equals("exit")) {
				break;
			}
		}
		// 7.�ͷ���Դ
		socket.close();
	}
}
