package in.dev.gmsk.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * While using the JDBC protocol add the dependency to pom.xml.
 * </p>
 * are
 * </p>
 * Please visit <a href="https://mvnrepository.com/">...</a> to download the jar. Adding classpath to jars
 */
public class JDBC_Connection {

    public static Connection getConnection_1(JDBCModel jdbcModel) throws SQLException {
        return DriverManager.getConnection(jdbcModel.getUrl(), jdbcModel.getUsername(), jdbcModel.getPassword());
    }

    public static Connection getConnection_2(DynJDBCModel jdbcModel) throws SQLException {

        String createdURL = buildURL(jdbcModel);
        System.out.printf("JDBC URL Builder Ref = %s%n", createdURL);

        return DriverManager.getConnection(createdURL, jdbcModel.getUsername(), jdbcModel.getPassword());
    }

    public static Connection getConnection_3(DynJDBCModel jdbcModel) throws SQLException {

        Properties properties = new Properties();
        properties.put("user", jdbcModel.getUsername());
        properties.put("password", jdbcModel.getPassword());

        return DriverManager.getConnection(buildURL(jdbcModel), properties);
    }

    public static Connection getConnection_4(JDBCModel jdbcModel) throws SQLException {

        String createdURL = buildSingleGetConnectionMethodURL(jdbcModel);
        System.out.printf("JDBC URL Builder Ref = %s%n", createdURL);

        return DriverManager.getConnection(createdURL);
    }

    private static String buildURL(DynJDBCModel jdbcModel) {
        return String.format("%s:%s://%s:%s/%s", jdbcModel.getProtocol(),
                jdbcModel.getDriverVender(),
                jdbcModel.getHost(),
                jdbcModel.getPort(),
                jdbcModel.getDbName()
        );
    }

    private static String buildSingleGetConnectionMethodURL(JDBCModel jdbcModel) {
        return String.format("%s?user=%s&password=%s", jdbcModel.getUrl(),
                jdbcModel.getUsername(),
                jdbcModel.getPassword()
        );
    }
}