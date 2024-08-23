public class MovingHelloWorld {

    public static void main(String[] args) throws InterruptedException {
        String message = "Hello World!";
        int width = 50;  // width of the console (or the line length to move across)

        // Loop to create the animation
        for (int i = 0; i < width; i++) {
            // Clear the console (optional, not functional in all environments)
            // System.out.print("\033[H\033[2J");
            // System.out.flush();

            // Print spaces to create the moving effect
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // Print the message
            System.out.println(message);

            // Pause to control the speed of the animation
            Thread.sleep(100);

            // Move the cursor back to the start (optional, not functional in all environments)
            System.out.print("\r");
        }
    }
}
