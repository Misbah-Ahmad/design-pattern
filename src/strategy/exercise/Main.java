package strategy.exercise;
public class Main {
    public static void main(String[] args) {
        String message = "This is a message";

        ChatClient client = new ChatClient();

        // Encrypt using DES
        client.send(message, new AES());

        // Encrypt using AES
        client.send(message, new DES());

    }
}
