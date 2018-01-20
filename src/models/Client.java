package models;

/**
 * Created by user on 29.10.2016.
 */
public class Client {

    int clientId;
    String clientLogin;
    String clientEmail;
    String clientPass;

    @Override
    public String toString() {
        return "Client{" +
                "clientId=" + clientId +
                ", clientLogin='" + clientLogin + '\'' +
                ", clientEmail='" + clientEmail + '\'' +
                ", clientPass='" + clientPass + '\'' +
                '}';
    }

    public Client() {
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public String getClientLogin() {
        return clientLogin;
    }

    public void setClientLogin(String clientLogin) {
        this.clientLogin = clientLogin;
    }

    public String getClientEmail() {
        return clientEmail;
    }

    public void setClientEmail(String clientEmail) {
        this.clientEmail = clientEmail;
    }

    public String getClientPass() {
        return clientPass;
    }

    public void setClientPass(String clientPass) {
        this.clientPass = clientPass;
    }
}
