import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p74 {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            while (true) {
                // Display the shell prompt
                System.out.print("SimpleShell> ");

                // Read the user input
                String userInput = reader.readLine();

                // Check for exit command
                if (userInput.equalsIgnoreCase("exit")) {
                    System.out.println("Exiting SimpleShell.");
                    break;
                }

                // Execute the command
                executeCommand(userInput);
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void executeCommand(String command) {
        try {
            Process process = Runtime.getRuntime().exec(command);

            // Read and display the output of the command
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);

            }

            // Wait for the command to finish
            int exitCode = process.waitFor();
            System.out.println("Exit Code: " + exitCode);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
