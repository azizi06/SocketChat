import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

class Client{
    public static void main(String[] args) {
        String host="127.0.0.1";
        int port=5000; 

        try (
        Socket echoSocket = new Socket(hostName, portNumber);        // 1st statement
    PrintWriter out =                                            // 2nd statement
        new PrintWriter(echoSocket.getOutputStream(), true);
    BufferedReader in =                                          // 3rd statement 
        new BufferedReader(
            new InputStreamReader(echoSocket.getInputStream()));
    BufferedReader stdIn =                                       // 4th statement 
        new BufferedReader(
            new InputStreamReader(System.in));
        ) {
            
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}