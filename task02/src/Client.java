import java.io.BufferedReader;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
    public static void main(String[] args) throws UnknownHostException, IOException {

        switch (args.length) {
            case (args[]):

            case (args[1]):

            case (args[2]):
            
        
        }

            while (true) {
                Socket socket = server.accept();
                System.out.println("connection established");
                Socket socket = new Socket();      
            }
        

        try (InputStream is = socket.getInputStream()) {
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader (isr);

            Buffer dis = new DataInputStream(bis);
            String line = dis.readUTF();

            String reply = br.readLine();
            System.out.println(reply);

            Scanner scanner = new Scanner(System.in);
            String userInput;
            while (!"close".equals(userInput = scanner.nextLine())) {
                
                bw.write(userInput+"\n");
                bw.flush();

        } catch (EOFException e) {
            socket.close();
        }
    }

}
