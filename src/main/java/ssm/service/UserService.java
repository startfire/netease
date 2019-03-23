package ssm.service;


import ssm.model.User;

public interface UserService {

    User getUser(String username, String password);
}
