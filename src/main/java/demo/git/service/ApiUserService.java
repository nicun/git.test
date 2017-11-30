package demo.git.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import demo.git.entity.User;

@Service
public class ApiUserService implements UserService {

	@Value("${demo.git.restServiceUrl}")
	private String restServiceUrl;

	@Value("${demo.git.restServiceUrl.instruction}")
	private String instruction;

	@Autowired
	RestTemplate restTemplate;

	public User getInfo(String user) throws RestClientException {
		return restTemplate.getForObject(restServiceUrl + user, User.class);
	}

	public String getInstruction() {
		return instruction;
	}
}
