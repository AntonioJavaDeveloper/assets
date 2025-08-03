package br.com.javadeveloper.persistence.config;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static lombok.AccessLevel.PRIVATE;

@NoArgsConstructor(access = PRIVATE)
public final class ConnectionConfig {

    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost/board";
        String username = "username";
        String password = "username-password";
        Connection connection = DriverManager.getConnection(url, username, password);
        connection.setAutoCommit(false);

        return connection;
    }
}
