package dao;

import connector.DbConnector;
import models.Client;
import java.sql.*;
import java.util.ArrayList;

/**
 * Created by user on 29.10.2016.
 */
public abstract class ClientDao {

    public static void registerClient(Client client) {

        String sql = "INSERT INTO `lalala`.`client` (`clientlogin`, `clientemail`, `clientpass`) VALUES ('" +
                client.getClientLogin() + "', '" +
                client.getClientEmail() + "', '" +
                client.getClientPass() + "');";
        Connection connection = DbConnector.getDbConnection();
        Statement statement;
        try {
            statement = connection.createStatement();
            statement.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Client> getClients() {
        ArrayList<Client> clients = new ArrayList<Client>();
        String sql = "SELECT * FROM lalala.client;";
        Connection connection = DbConnector.getDbConnection();
        Statement statement;
        ResultSet resultSet;
        Client client;
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                client = new Client();
                client.setClientId(resultSet.getInt("idclient"));
                client.setClientLogin(resultSet.getString("clientlogin"));
                client.setClientPass(resultSet.getString("clientpass"));
                client.setClientEmail(resultSet.getString("clientemail"));
                clients.add(client);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return clients;
    }

    public static Client getClient(int idClient) {
        String sql = "SELECT * FROM lalala.client WHERE idclient = " +
                idClient + ";";
        Connection connection = DbConnector.getDbConnection();
        Statement statement;
        ResultSet resultSet;
        Client client = new Client();
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                client.setClientId(resultSet.getInt("idclient"));
                client.setClientLogin(resultSet.getString("clientlogin"));
                client.setClientPass(resultSet.getString("clientpass"));
                client.setClientEmail(resultSet.getString("clientemail"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return client;
    }

    public static void updateClient(Client client) {
        String sql = " UPDATE lalala.client set  clientlogin = ?, clientpass = ?, clientemail = ? WHERE idclient =" +
                client.getClientId() + "";
        Connection connection = DbConnector.getDbConnection();
        PreparedStatement statement;
        try {
            statement = connection.prepareStatement(sql);
            statement.setString(1, client.getClientLogin());
            statement.setString(2, client.getClientPass());
            statement.setString(3, client.getClientEmail());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void dellClient(Client client) {
        String sql = "DELETE FROM lalala.client WHERE idclient = ?;";
        Connection connection = DbConnector.getDbConnection();
        PreparedStatement statement;
        try {
            statement = connection.prepareStatement(sql);
            statement.setInt(1, client.getClientId());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}