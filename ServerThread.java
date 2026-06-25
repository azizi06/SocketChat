import java.net.ServerSocket;
import java.net.Socket;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class ServerThread implements Runnable{
    private Socket socket;
    public ServerThread(Socket s){
        super("SocketChat ServerThread")
        this.socket = s;
    }
    public void run(){
        try (
            String inputLine,outputLine;
            PrintWriter out = new PrintWriter(this.socket.getOutputStream(),true);
            BufferedReader in = new BufferedReader(new InputStreamReader( this.socket.getInputStream()));
        ) {
            while ((inputLine = in.readLine()) != null) {
                
            }
            
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}