import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;

public class Server {
    
    public static final Integer DEFAULT_PORT = 3000;
    public static void main (String[] args) throws Exception {

        int port = DEFAULT_PORT; 
        String serverProg = "";
        switch (args.length) {
            case 1:
            serverProg = args[0];
            break;

            case 2: 
            serverProg = args[1];
            port = Integer.parseInt(args[1]);
            break;

            case 3: 
            serverProg = args[2];
            port = Integer.parseInt(args[2]);

            default: 
                System.err.println("Error!");
                System.exit(1);
        }

        ServerSocket server = new ServerSocket(port);

        try (OutputStream os = ServerSocket.getOutputStream()) {
            OutputStreamWriter osw = new OutputStreamWriter (os);
            BufferedWriter bw = new BufferedWriter(osw);
            
            bw.flush();
        }
    

    }
}
