package com.cursomito.lenguajepreferencia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.cognitoidp.AWSCognitoIdentityProviderClient;



@SpringBootApplication
@EnableTransactionManagement
@EnableJpaRepositories
@EnableWebMvc
public class LenguajepreferenciaApplication {

	public static void main(String[] args) {
		SpringApplication.run(LenguajepreferenciaApplication.class, args);
	}
	
	@Bean
	public AWSCognitoIdentityProviderClient CognitoClient() {        
        AWSCognitoIdentityProviderClient cognitoClient = new AWSCognitoIdentityProviderClient(new DefaultAWSCredentialsProviderChain());
        cognitoClient.setRegion(Region.getRegion(Regions.US_EAST_2));
                
        return cognitoClient;
	}

}
