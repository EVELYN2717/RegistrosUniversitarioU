package com.co.cardif.gestionU;

import org.jdbi.v3.core.Jdbi;
import org.jdbi.v3.core.statement.SqlLogger;
import org.jdbi.v3.core.statement.StatementContext;
import org.jdbi.v3.sqlobject.SqlObjectPlugin;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@Configuration
public class PersistenceConfig {

    private static Logger logger = LoggerFactory.getLogger(PersistenceConfig.class);

    @Bean(name = "cdtDatasource")
    @ConfigurationProperties("spring.datasource")
    @Primary
    public DataSource primaryDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean({ "bdbJdbiBean" })
    public Jdbi jdbiBean(@Qualifier("cdtDatasource") DataSource dataSource) {
        return createResource(dataSource);

    }

    private Jdbi createResource(DataSource dataSource){
        SqlLogger log = new SqlLogger() {
            @Override
            public void logBeforeExecution(StatementContext context) {
                logger.info("SQL:{}, Attributes{}", context.getRenderedSql(),context.getAttributes());
            }
        };

        Jdbi jdbi = Jdbi.create(dataSource);
        jdbi.installPlugin(new SqlObjectPlugin());
        jdbi.setSqlLogger(log);
        return jdbi;
    }
}
