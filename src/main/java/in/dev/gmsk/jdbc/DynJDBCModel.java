package in.dev.gmsk.jdbc;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class DynJDBCModel {

    private String protocol;
    private String driverVender;
    private String host;
    private String port;
    private String dbName;
    private String username;
    private String password;
}
