package br.com.javadeveloper.persistence.migration;

import br.com.javadeveloper.persistence.config.ConnectionConfig;
import liquibase.Liquibase;
import liquibase.database.jvm.JdbcConnection;
import liquibase.exception.DatabaseException;
import liquibase.exception.LiquibaseException;
import liquibase.resource.ClassLoaderResourceAccessor;
import lombok.AllArgsConstructor;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.sql.Connection;
import java.sql.SQLException;

@AllArgsConstructor
public class MigrationStrategy {

    private final Connection connection;

    public void executeMigration() {
        PrintStream originalOut = System.out;
        PrintStream originalErr = System.err;

        try (var fos = new FileOutputStream(new File("migration.log"))) {
            System.setOut(new PrintStream(fos));
            System.setErr(new PrintStream(fos));
            try (
                    Connection connection = ConnectionConfig.getConnection();
                    JdbcConnection jdbcConnection = new JdbcConnection(connection);
            ) {
                String liquibaseChangeLog = "db/changelog/db.changelog-master.yml";
                Liquibase liquibase = new Liquibase(liquibaseChangeLog,new ClassLoaderResourceAccessor(),jdbcConnection);
                liquibase.update();
            } catch (SQLException | LiquibaseException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.setOut(originalOut);
            System.setErr(originalErr);
        }
    }

}
