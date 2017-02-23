package com.architecture;

import java.net.UnknownHostException;

import org.jongo.Jongo;
import org.jongo.MongoCollection;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.mongodb.DB;
import com.mongodb.MongoClient;
import com.mongodb.MongoException;

@SpringBootApplication
public class Application {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }
    
    @Bean
    public Jongo jongo() {
    	DB db;
    	try {
    		db = new MongoClient("127.0.0.1", 27017).getDB("Sina");
    	} catch (UnknownHostException e) {
    		throw new MongoException("Connection error : ", e);
    	}
    	return new Jongo(db);
    }
    
    @Bean
    public MongoCollection infos() {
    	return jongo().getCollection("Information");
    }
}
