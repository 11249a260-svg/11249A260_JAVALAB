
import java.net.*;
import java.io.*;

public class MyServer {
    public static void main(String[] args) {

        try {
            // Create server socket on port 5000
            ServerSocket serverSocket = new ServerSocket(5000);
            System.out.println("Server is waiting for client...");

            // Wait for a client connection
            Socket socket = serverSocket.accept();
            System.out.println("Client connected.");

            // Receive message from client
            BufferedReader input = new BufferedReader(
                new InputStreamReader(socket.getInputStream()));

            // Send reply to client
            PrintWriter output = new PrintWriter(
                socket.getOutputStream(), true);

            String message = input.readLine();
            System.out.println("Client says: " + message);

            output.println("Hello Client! Message received.");

            // Close resources
            input.close();
            output.close();
            socket.close();
            serverSocket.close();

        } catch (IOException e) {
            System.out.println("Server error: " + e.getMessage());
        }
    }
}
