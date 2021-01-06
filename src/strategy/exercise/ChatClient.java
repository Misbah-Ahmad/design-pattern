package strategy.exercise;

public class ChatClient {

    public void send(String message, Encryptor encryptionAlgorithm) {

        String encrypted = encryptionAlgorithm.encrypt(message);
        System.out.println("Sending the encrypted message... " + encrypted);
    }

}
