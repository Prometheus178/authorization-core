package service.implementation.simple;

import model.Login;
import model.User;
import service.base.Storage;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Sergey.
 */
public class TestStore implements Storage<User> {

    private List<User> userStorage = new ArrayList<>();

    @Override
    public boolean save(User user) {
        return userStorage.add(user);
    }

    @Override
    public boolean update(User user) {
        return true;
    }

    @Override
    public void delete(Login login) {

    }

    @Override
    public void erase(Login login) {

    }

    @Override
    public User get(Login login) {
        for (User user : userStorage) {
            if (login.equals(user.getLogin())) {
                return user;
            }
        }
        return null;
    }
}
