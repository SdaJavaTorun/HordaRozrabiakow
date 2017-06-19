package com.sdajava.Horda;

import com.sdajava.Horda.controller.LoginController;
import com.sdajava.Horda.model.Role;
import com.sdajava.Horda.model.User;
import com.sdajava.Horda.repository.UserRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.jws.soap.SOAPBinding;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HordaApplicationTests {

	@Autowired
	 UserRepository userRepository;

	@Before
	public void setUp(){ userRepository.deleteAll();}

	@Test
	public void shouldFindUserByUsernameTest(){
		//given
		User user1 = userRepository.save(new User ("Test", "Test", null ));
		User user2 = userRepository.save(new User ("Test2", "Test2", null));
		//when
		userRepository.findByUsername("Test");
		//then
		assertEquals(userRepository.findByUsername("Test"), user1);

	}

//	@Test
//	public void shouldFindUserByUserIdEqualsTwo (){
//		//given
//		User user1 = userRepository.save(new User ("Test", "Test", null ));
//		User user2 = userRepository.save(new User ("Test2", "Test2", null));
//		//when
//
//		//then


	}










