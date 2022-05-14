import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

import javax.sql.DataSource;

@Configuration
@EnableAuthorizationServer
public class OAuth2ServerConfiguration extends AuthorizationServerConfigurerAdapter {

    private DataSource dataSource;

    private AuthenticationManager authenticationManager;

}
