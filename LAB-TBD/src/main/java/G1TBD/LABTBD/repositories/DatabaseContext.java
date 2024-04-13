package G1TBD.LABTBD.repositories;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.sql2o.Sql2o;

@Configuration
public class DatabaseContext {
    @Value("${spring.datasource.url}")
    private String dbUrl;

    @Value("${spring.datasource.name}")
    private String dbUser;

    @Value("${spring.datasource.password}")
    private String dbPassword;
    @Bean
    public Sql2o sql2o(){
        return new Sql2o(dbUrl,dbUser,dbPassword);

    }


}
