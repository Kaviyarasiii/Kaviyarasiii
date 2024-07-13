package in.dev.gmsk.jdbc;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class JDBCModel {

    private String url;
    private String username;
    private String password;
}
