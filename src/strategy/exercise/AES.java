package strategy.exercise;

public class AES implements Encryptor {

    @Override
    public String encrypt(String message) {
        return "AES " + message + " AES";
    }
    
}
