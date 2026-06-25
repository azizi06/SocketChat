import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
class Server{
    public static void main(String[] args) {
        int port = 5000;
        System.err.println("=== SoketChat server start");
    
        try (
            ServerSocket ss = new ServerSocket(5000);
            Socket clientSocket = ss.accept();

        ) {
            boolean listening = true;
            while (listening) {
                new ServerThread(ss.accept()).start();
            }
        } catch (Exception e) {
            // TODO: handle exception
        }

        System.out.println("=== SocketChat server exit");
    }
}