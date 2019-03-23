package ssm.service;



import org.springframework.stereotype.Service;
import ssm.dao.UserMapper;
import ssm.model.User;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    UserMapper userMapper;

    //验证用户名和密码
    @Override
    public User getUser(String username, String password) {
        return userMapper.getUser(username, password);
    }
}
