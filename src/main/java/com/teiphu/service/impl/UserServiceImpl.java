package com.teiphu.service.impl;

import com.teiphu.mapper.UserMapper;
import com.teiphu.pojo.UserDo;
import com.teiphu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.util.List;

/**
 * @Author Teiphu
 * @Date 2019.04.17 下午 09:54
 **/
@Service
public class UserServiceImpl implements UserService, UserDetailsService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        UserDo user = userMapper.getUserByUsername(s);
        if (user == null) {
            throw new UsernameNotFoundException("username is not exists");
        }
        return user;
    }

    @Override
    @Transactional(rollbackFor = { IOException.class })
    public int addUser(UserDo user) {
        return userMapper.insertUser(user);
    }

    @Override
    @Transactional(rollbackFor = { IOException.class })
    public int deleteUser(Integer userId) {
        return userMapper.deleteUser(userId);
    }

    @Override
    @Transactional(rollbackFor = { IOException.class })
    public int updateUser(UserDo user) {
        return userMapper.updateUser(user);
    }

    @Override
    public UserDo getUser(Integer userId) {
        return userMapper.getUser(userId);
    }

    @Override
    public List<UserDo> listUser() {
        return userMapper.listUser();
    }

    @Override
    public UserDo getUserByLogin(String email, String phone, String password) {
        UserDo user = new UserDo(email, phone, password);
        UserDo userDo = userMapper.getUserByLogin(user);
        return userDo;
    }


}
