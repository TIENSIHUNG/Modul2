// Import the java.io package to work with files and streams
import java.io.*;

// Define a class named FileCopy
public class FileCopy {
    // Define the main method
    public static void main(String[] args) {
        // Declare variables for the source and target file names
        String sourceFile = "C:\\Users\\OS\\Desktop\\MODULE2\\S17_IOStream\\copyFile\\filetext.txt", targetFile = "C:\\Users\\OS\\Desktop\\MODULE2\\S17_IOStream\\copyFile\\another_text.txt";
        // Declare variables for the input and output streams
        FileInputStream input = null;
        FileOutputStream output = null;
        // Declare a variable for the number of characters copied
        int count = 0;
        // Create a BufferedReader object to read user input from the console
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            // Check if the source file exists
            if (!new File(sourceFile).exists()) {
                // If not, print an error message and exit
                System.out.println("The source file does not exist.");
                System.exit(0);
            }
            // Check if the target file exists
            if (new File(targetFile).exists()) {
                // If yes, ask the user if they want to overwrite it
                System.out.print("The target file already exists. Do you want to overwrite it? (y/n) ");
                // Read the user input and convert it to lowercase
                String answer = reader.readLine().toLowerCase();
                // If the answer is not y, print a message and exit
                if (!answer.equals("y")) {
                    System.out.println("The file copy operation was cancelled.");
                    System.exit(0);
                }
            }

            // Create a FileInputStream object to read bytes from the source file
            input = new FileInputStream(sourceFile);
            // Create a FileOutputStream object to write bytes to the target file
            output = new FileOutputStream(targetFile);

            // Read one byte at a time from the input stream
            int byteRead = input.read();
            // Loop until the end of the stream is reached
            while (byteRead != -1) {
                // Write the byte to the output stream
                output.write(byteRead);
                // Increment the counter by one
                count++;
                // Read the next byte from the input stream
                byteRead = input.read();
            }
            // Print the number of characters copied
            System.out.println(count + " characters were copied from " + sourceFile + " to " + targetFile + ".");
        } catch (IOException e) {
            // Handle any IOException that may occur
            e.printStackTrace();
        } finally {
            try {
                // Close the input and output streams if they are not null
                if (input != null) {
                    input.close();
                }
                if (output != null) {
                    output.close();
                }
            } catch (IOException e) {
                // Handle any IOException that may occur when closing the streams
                e.printStackTrace();
            }
        }
    }
}