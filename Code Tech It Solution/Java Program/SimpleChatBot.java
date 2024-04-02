import java.util.Scanner;

public class SimpleChatBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! What's your name?");
        String name = scanner.nextLine();
        System.out.println("Nice to meet you, " + name + "! How can I assist you today?");

        String userInput;
        do {
            userInput = scanner.nextLine();
            String response = getBotResponse(userInput);
            System.out.println(response);
        } while (!userInput.equalsIgnoreCase("bye"));

        System.out.println("Goodbye! Have a great day, " + name + "!");
        scanner.close();
    }

    public static String getBotResponse(String input) {
        // Add your bot's logic here to generate appropriate responses based on user input
        if (input.contains("hello") || input.contains("hi")) {
            return "Hi there! How can I help you?";
        } else if (input.contains("how are you")) {
            return "feelings, but thanks for asking!";
        } else if (input.contains("weather I'm a chat bot, so I don't have ")) {
            return "I'm sorry, I don't have access to weather information.";
        } else if (input.contains("joke")) {
            return "Sure! Here's a joke: Why don't scientists trust atoms? Because they make up everything!";
        } else {
            return "I'm sorry, I didn't understand. Can you please rephrase?";
        }
    }
}