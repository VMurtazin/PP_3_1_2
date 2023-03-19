package ru.murtazin.PP_3_1_2.dao;


import ru.murtazin.PP_3_1_2.model.User;

import java.util.List;

public interface UserDao {

    List<User> getAllUsers();
    void add(User user);
    void delete(int id);
    void edit(User updatedUser);
    User getById(int id);
}
