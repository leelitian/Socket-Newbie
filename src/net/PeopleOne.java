package net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class PeopleOne {
	public static void main(String[] args) throws IOException {
		// 1.����һ���˿�
		DatagramSocket socket = new DatagramSocket(5051);
		// 2.׼����������
		byte[] receiveBuf = new byte[100];
		// 3.�ȴ������������
		DatagramPacket packet = new DatagramPacket(receiveBuf, receiveBuf.length);
		System.out.println("�����������������");
		while (true) {
			// 4.���հ���
			socket.receive(packet);
			// 5.��������
			String receStr = new String(packet.getData(), 0, packet.getLength());
			System.out.println("���յ��ˣ�" + receStr);
			if (receStr.equals("exit")) {
				break;
			}
		}
		// 6.�ͷ���Դ
		socket.close();
	}
}
