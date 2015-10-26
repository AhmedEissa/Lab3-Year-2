package tcpclient;

import java.io.*;
import java.net.*;
class TCPClient {
    public static void main(String argv[]) throws Exception {
    String sentence;
    String modifiedSentence;
    BufferedReader inFromUser;
    Socket clientSocket;
    DataOutputStream outToServer;
    BufferedReader inFromServer;
    while(true) {
        inFromUser = new BufferedReader(new
        InputStreamReader(System.in));
        clientSocket = new Socket("127.0.0.1", 6789);
        outToServer = new DataOutputStream(clientSocket.getOutputStream());
        inFromServer = new BufferedReader(new
        InputStreamReader(clientSocket.getInputStream()));
        System.out.println("Type in your name and surname in lower case:");
        sentence = inFromUser.readLine();   
        outToServer.writeBytes(sentence + '\n');
        modifiedSentence = inFromServer.readLine();
        System.out.println("FROM SERVER: " + modifiedSentence);
        clientSocket.close();
        }
    }
}
