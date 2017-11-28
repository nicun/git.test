package demo.git;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import demo.git.entity.User;


@Service
public class UserService {
	
	public String instruction = "{user}/info  - w miejsce {user} nazwa użytkownika <br/>"
			+ "Pobiera dane z API githuba, wyświetlając: <br/>"
			+ "Identyfikator <br/>"
			+ " Login <br/>"
			+ "Nazwa <br/>"
			+ "Typ<br/>"
			+ "url do avatara<br/>"
			+ "data stworzenia <br/>";

		
	@Autowired
	RestTemplate restTemplate;
	
	public User getInfo (String user) throws Exception {
		return restTemplate.getForObject("https://api.github.com/users/"+user, User.class);
	}
}
