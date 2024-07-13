package in.dev.gmsk.jdbc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.SQLException;

import static in.dev.gmsk.jdbc.JDBC_Connection.*;
import static org.junit.jupiter.api.Assertions.*;

class JDBCConnectionTest {

    private JDBCModel jdbcModel;
    private DynJDBCModel dynJDBCModel;

    @BeforeEach
    void cookJDBCInstance_1() {
        jdbcModel = new JDBCModel("jdbc:mysql://localhost:3306/dev_gmsk_db", "root", "root");
    }

    @BeforeEach
    void cookJDBCInstance_2() {
        dynJDBCModel = new DynJDBCModel("jdbc", "mysql", "localhost", "3306", "dev_gmsk_db", "root", "root");
    }

    @Test
    void testTheConnection_1() {
        try {

            Connection connection = getConnection_1(jdbcModel);
            assertTrue(connection.isValid(10)); // timeout

            connection.close();
            assertTrue(connection.isClosed());

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    void testThrowSQLException_1() {
        assertThrows(SQLException.class, () -> getConnection_1(new JDBCModel(null, null, null)));
    }

    @Test
    void testTheConnection_2() {
        try {

            Connection connection = getConnection_2(dynJDBCModel);
            assertTrue(connection.isValid(10)); // timeout

            connection.close();
            assertTrue(connection.isClosed());

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    void testThrowSQLException_2() {
        assertThrows(SQLException.class, () -> getConnection_2(new DynJDBCModel(null, null, null, null, null, null, null)));
    }

    @Test
    void testTheConnection_3() {
        try {

            Connection connection = getConnection_3(dynJDBCModel);
            assertTrue(connection.isValid(10)); // timeout

            connection.close();
            assertTrue(connection.isClosed());

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    void testNullPointerException_3() { // using Properties.
        assertThrows(NullPointerException.class, () -> getConnection_3(new DynJDBCModel(null, null, null, null, null, null, null)));
    }

    @Test
    void testTheConnection_4() {
        try {

            Connection connection = getConnection_4(jdbcModel);
            assertTrue(connection.isValid(10)); // timeout

            connection.close();
            assertTrue(connection.isClosed());

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    void testThrowSQLException_4() {
        assertThrows(SQLException.class, () -> getConnection_4(new JDBCModel(null, null, null)));
    }
}