package network;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class Udpclient {
	public static void main(String[] args) {
	try {
		InetAddress ia=InetAddress.getLocalHost();
		DatagramSocket ds=new DatagramSocket(1029,ia);
		System.out.println("Enter a string: ");
		Scanner i = new Scanner(System.in);
		String str = i.nextLine();
		byte[] b=str.getBytes();
		DatagramPacket dp=new DatagramPacket(b,b.length,ia,76);
		ds.send(dp);
		byte[] buff=new byte[50];
		DatagramPacket in=new DatagramPacket(buff,buff.length);
		ds.receive(in);
		System.out.println((new String(buff)));
		
		
	}
	catch(Exception e) {
		
	}
	}
}
