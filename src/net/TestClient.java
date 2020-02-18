package net;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class TestClient {
	public static void main(String[] args) throws IOException {
		// 创建同一连接
		@SuppressWarnings("resource")
		Socket s = new Socket("127.0.0.1", 6666);
		DataOutputStream dos = new DataOutputStream(s.getOutputStream());
		dos.writeUTF("hello, love！");
	}
}
