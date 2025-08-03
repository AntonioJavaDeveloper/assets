package br.com.javadeveloper;

import br.com.javadeveloper.persistence.migration.MigrationStrategy;
import br.com.javadeveloper.ui.MainMenu;

import java.sql.SQLException;

import static br.com.javadeveloper.persistence.config.ConnectionConfig.getConnection;

public class Main {
    public static void main(String[] args) throws SQLException {
        try(var connection = getConnection()){
            new MigrationStrategy(connection).executeMigration();
        }
        new MainMenu().execute();
    }
}