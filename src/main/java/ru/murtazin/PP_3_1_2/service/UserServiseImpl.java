package ru.murtazin.PP_3_1_2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.murtazin.PP_3_1_2.dao.UserDao;
import ru.murtazin.PP_3_1_2.model.User;

import java.util.List;


@Service
public class UserServiseImpl implements UserService {

    private UserDao userDao;

    @Autowired
    public UserServiseImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    @Transactional
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    @Transactional
    public void add(User user) {
        userDao.add(user);
    }

    @Override
    @Transactional
    public void delete(int id) {
        userDao.delete(id);
    }

    @Override
    @Transactional
    public void edit(User updatedUser) {
        userDao.edit(updatedUser);
    }

    @Override
    @Transactional
    public User getById(int id) {
        return userDao.getById(id);
    }
}
