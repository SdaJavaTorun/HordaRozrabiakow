package com.sdajava.Horda;

import com.sdajava.Horda.controller.LoginController;
import com.sdajava.Horda.model.User;
import com.sdajava.Horda.repository.UserRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HordaApplicationTests {


	LoginController loginController = new LoginController();
	UserRepository userRepository;


	@Test

	public void findUserByUsernameMarek(){
		User user1 = new User();  //Określić jego dane
		userRepository.save(user1);
		userRepository.findByUsername("Marek");




	}

}
