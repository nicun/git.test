package demo.git.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;

import demo.git.entity.User;
import demo.git.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping("/")
	public String instruction() {
		return userService.getInstruction();

	}

	@RequestMapping(value = "/{user}/info", method = RequestMethod.GET)
	public User findUser(@PathVariable String user) throws RestClientException {
		return userService.getInfo(user);
	}

}
