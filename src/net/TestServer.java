package net;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TestServer {

	public static void main(String[] args) throws IOException {
		// ������������һ�������˿�
		@SuppressWarnings("resource")
		ServerSocket serverSocket = new ServerSocket(6666);
		System.out.println("�����˷�����");
		while (true) {
			// �ȴ��ͻ�������
			Socket accept = serverSocket.accept();
			System.out.println("��һ�������ӹ�����");
			// ��ÿͻ�������Ķ���
			InputStream inputStream = accept.getInputStream();
			// ��װ��DataInputStream��
			DataInputStream dataInputStream = new DataInputStream(inputStream);
			// ͨ��������ȡ��Ϣ
			String s = dataInputStream.readUTF();
			System.out.println(s);
		}
	}
}
