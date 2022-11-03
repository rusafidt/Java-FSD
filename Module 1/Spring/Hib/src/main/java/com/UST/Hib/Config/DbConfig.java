package com.UST.Hib.Config;

import java.util.Properties;

import javax.activation.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

@PropertySource(value = {"classpath:application.properties"})
@Configuration


public class DbConfig {

	@Value("${jdbc.driverClassName}")
	private String driverClass;
	
	@Value("${jdbc.url}")
	private String url;
	
	@Value("${jdbc.username}")
	private String username;
	
	@Value("${jdbc.password}")
	private String password;
	
	@Value("${jdbc.dialect}")
	private String dialect;
	
	
	@Bean
	public javax.sql.DataSource getDataSource() {
		
	DriverManagerDataSource dataSource = new DriverManagerDataSource(url,username,password);
	dataSource.setDriverClassName(driverClass);
	return dataSource;

	}
	
	@Bean
	public LocalSessionFactoryBean sessionFactory() {
		LocalSessionFactoryBean factory =  new LocalSessionFactoryBean();
		factory.setDataSource(getDataSource());
		factory.setHibernateProperties(hibernateProperties());
		factory.setPackagesToScan(new String[] {"com.UST.Hib.Model"});
		return factory;
		
	}

	private Properties hibernateProperties() {
		// TODO Auto-generated method stub
		Properties properties = new Properties();
		properties.put("hibernate.dialect" , "dialect");
		properties.put("hibernate.hbm2ddl.auto" , "update");
		properties.put("hibernate.show.sql" , "true");
		properties.put("hibernate.formate_sql" , "true");
		return properties;
	}
	
	

	@Bean
	@Autowired
	public HibernateTransactionManager transactionManager(SessionFactory factory) {
		
		HibernateTransactionManager transactionManager = new HibernateTransactionManager();
		transactionManager.setSessionFactory(factory);
		return transactionManager;
		
	}
}
