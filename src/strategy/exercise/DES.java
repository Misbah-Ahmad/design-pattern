package strategy.exercise;

public class DES implements Encryptor {

    @Override
    public String encrypt(String message) {
        return "DES " + message + " DES";
    }
    
}
