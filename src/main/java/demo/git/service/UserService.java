package demo.git.service;

import demo.git.entity.User;

public interface UserService {
	public User getInfo(String user);

	public String getInstruction();
}
