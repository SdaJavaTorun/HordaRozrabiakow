package com.sdajava.Horda;

import com.sdajava.Horda.model.User;
import com.sdajava.Horda.repository.UserRepository;
import com.sun.xml.internal.bind.v2.TODO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HordaApplication implements CommandLineRunner {




	public static void main(String[] args) {
		SpringApplication.run(HordaApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {
		//TODO - ocenić przydatnośc, przy logowaniu
	//	User user = new User("xx", "xx", User.Role.CHIEF);


	}
}