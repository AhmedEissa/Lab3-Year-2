package test_socket;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;
public class Test_Socket {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        System.out.println("Enter an ip address or a hostname:");
        String s = c.next();
        try { 
            InetAddress x = InetAddress.getByName(s);
            InetAddress iAddress = InetAddress.getLocalHost();
            String hostName = iAddress.getHostName();
            String canonicalHostName =
            iAddress.getCanonicalHostName();
            InetAddress SW[] = InetAddress.getAllByName(s);
            System.out.println("Using getLocalHost()" +
            InetAddress.getLocalHost());
            System.out.println("Using getLocalHost().getHostname "+ InetAddress.getLocalHost().getHostName());
            System.out.println();
            System.out.println("InetAddress.getByName(): " +x);
            System.out.println("\nIn a loop:");
            for (int i=0; i<SW.length; i++)
            System.out.println("InetAddress.getAllByName():" + SW[i]);
        }catch (UnknownHostException e) {
        System.out.println("No such host!..");
        } 
    }
}