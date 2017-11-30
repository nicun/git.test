package demo.git.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.annotation.DirtiesContext.ClassMode;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.client.RestClientException;
import org.springframework.boot.test.context.SpringBootTest;

import demo.git.Application;

import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

@TestExecutionListeners({ DependencyInjectionTestExecutionListener.class })
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
@DirtiesContext(classMode = ClassMode.AFTER_EACH_TEST_METHOD)
@WebAppConfiguration
public class UserControllerTest {

	private static final String USER_LOGIN = "marcin";
	private static final String USER_NAME = "Marcin Stefaniak";

	@Autowired
	UserController userController;

	private MockMvc mockMvc;

	@Before
	public void contextLoads() {
		this.mockMvc = standaloneSetup(userController).build();
	}

	@Test
	public void shouldGetUserInfo() throws Exception {
		this.mockMvc.perform(get("/" + USER_LOGIN + "/info"))
			.andExpect(status().isOk())
			.andExpect(jsonPath("$.login", is(USER_LOGIN)))
			.andExpect(jsonPath("$.name", is(USER_NAME)));
	}

}
