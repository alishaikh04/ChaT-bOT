import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Chatbot bot = new Chatbot();

        System.out.println("Chatbot is ready. Type 'exit' to quit.");
        String input;

        do {
            System.out.print("Mesage Bot: ");
            input = scanner.nextLine();

            bot.setUserInput(input);  // Use setter
            System.out.println("Bot: " + bot.generateResponse());

        } while (!input.equalsIgnoreCase("exit"));

        scanner.close();
    }
}
