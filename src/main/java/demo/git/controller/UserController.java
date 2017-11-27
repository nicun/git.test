package demo.git.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import demo.git.UserService;
import demo.git.entity.User;


@RestController
public class UserController {

	@Autowired 
	private UserService userService;
	
	@RequestMapping(value = "/{user}/info", method = RequestMethod.GET)
	public User findUser(@PathVariable String user) throws Exception {
		return userService.getInfo(user);
	}

}
