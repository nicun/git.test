package demo.git;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import demo.git.entity.User;

public class UserService {
	@Autowired
	 RestTemplate restTemplate;
	
	public User getInfo (String user) throws Exception {
		return restTemplate.getForObject("https://api.github.com/users/"+user, User.class);
	}
}