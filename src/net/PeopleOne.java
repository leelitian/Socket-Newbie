package net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class PeopleOne {
	public static void main(String[] args) throws IOException {
		// 1.开放一个端口
		DatagramSocket socket = new DatagramSocket(5051);
		// 2.准备容器接收
		byte[] receiveBuf = new byte[100];
		// 3.等待包裹容器封包
		DatagramPacket packet = new DatagramPacket(receiveBuf, receiveBuf.length);
		System.out.println("等你包裹来。。。。");
		while (true) {
			// 4.接收包裹
			socket.receive(packet);
			// 5.解析包裹
			String receStr = new String(packet.getData(), 0, packet.getLength());
			System.out.println("我收到了：" + receStr);
			if (receStr.equals("exit")) {
				break;
			}
		}
		// 6.释放资源
		socket.close();
	}
}
