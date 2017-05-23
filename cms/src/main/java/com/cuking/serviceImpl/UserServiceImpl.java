package com.cuking.serviceImpl;

import com.cuking.core.domain.User;
import com.cuking.dao.UserMapper;
import com.cuking.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by cuking on 2017/5/22.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Transactional
    public void save(String name, String password){
        User user  = new User();
        user.setName(name);
        user.setPassword(password);
        userMapper.insert(user);
    }
}
