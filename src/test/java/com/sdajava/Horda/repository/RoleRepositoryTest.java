package com.sdajava.Horda.repository;

import com.sdajava.Horda.model.Role;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RoleRepositoryTest {

    RoleRepository roleRepository;

    @Before
    public void setup() {
        roleRepository = mock(RoleRepository.class);
    }

    @Test
    public void shouldReturnRoleByGivenUsername() {
        // when
        when(roleRepository.findRoleByUsername("Adam"))
                .thenReturn(new Role("kandydat"));

        // given
        Role role = roleRepository.findRoleByUsername("Adam");

        // then
        assertEquals(role.getName(), "kandydat");
    }
}