import java.io.BufferedReader;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws UnknownHostException, IOException {

         Socket socket = new Socket();

        try (Socket socket = socket.accept();) {
            System.out.println("connection established");     
        
            InputStream is = socket.getInputStream()
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader (isr);

            String line = br.readLine();
            System.out.println(line);

            Scanner scanner = new Scanner(System.in);
            String userInput;
            while (!"close".equals(userInput = scanner.nextLine())) {
                
                bw.write(userInput+"\n");
                bw.flush();
            }

        } catch (EOFException e) {
            socket.close();
        }
    }

}
