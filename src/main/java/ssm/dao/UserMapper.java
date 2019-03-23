package ssm.dao;


import org.apache.ibatis.annotations.Param;
import ssm.model.User;

public interface UserMapper {

    User getUser(@Param("username") String username, @Param("password") String password);
}
