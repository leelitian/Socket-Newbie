package net;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class PeopleTwo {
	public static void main(String[] args) throws IOException {
		// 1.指定一个端口进行发送
		DatagramSocket socket = new DatagramSocket();
		// 2.指定一个IP
		InetAddress addr = InetAddress.getByName("127.0.0.1");
		int port = 5051;
		// 3.准备一个小容器
		byte[] sendBuf;
		while (true) {
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			System.out.println("你要发什么东西：");
			String s = scanner.nextLine();
			// 4.加入要放的数据
			sendBuf = s.getBytes();
			// 5.数据打包
			DatagramPacket packet = new DatagramPacket(sendBuf, sendBuf.length, addr, port);
			// 6.发送包
			socket.send(packet);
			if (s.equals("exit")) {
				break;
			}
		}
		// 7.释放资源
		socket.close();
	}
}
