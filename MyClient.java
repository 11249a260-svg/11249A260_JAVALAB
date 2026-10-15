
import java.net.*;
import java.io.*;

public class MyClient {
    public static void main(String[] args) {

        try {
            // Connect to server on port 5000
            Socket socket = new Socket("localhost", 5000);
            System.out.println("Connected to server.");

            // Send message to server
            PrintWriter output = new PrintWriter(
                socket.getOutputStream(), true);

            // Receive reply from server
            BufferedReader input = new BufferedReader(
                new InputStreamReader(socket.getInputStream()));

            output.println("Hello Server!");

            String reply = input.readLine();
            System.out.println("Server says: " + reply);

            // Close resources
            output.close();
            input.close();
            socket.close();

        } catch (IOException e) {
            System.out.println("Client error: " + e.getMessage());
        }
    }
}
