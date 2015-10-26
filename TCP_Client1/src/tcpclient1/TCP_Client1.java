package tcpclient1;

import java.io.*;
import java.net.*;
class TCPClient1 {
    public static void main(String argv[]) throws Exception {
        String sentence;
        String modifiedSentence;
        System.out.println("Type in your name and surname in lower cae:");
        BufferedReader inFromUser = new BufferedReader(new
        InputStreamReader(System.in));  
        sentence = inFromUser.readLine();
        Socket clientSocket = new Socket("127.0.0.1", 6789);
        DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());
        BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        outToServer.writeBytes(sentence + '\n');
        modifiedSentence = inFromServer.readLine();
        System.out.println("FROM SERVER: " + modifiedSentence);
        clientSocket.close();
    }
}