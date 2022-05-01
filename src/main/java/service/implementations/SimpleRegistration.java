package service.implementations;

import model.Login;
import model.User;
import service.base.BaseRegistration;
import service.base.Storage;

/**
 * Author: Sergey.
 */
public class SimpleRegistration extends BaseRegistration {


    public SimpleRegistration(Storage<User> userStorage) {
        super(userStorage);
    }

    @Override
    public boolean registration(User user) {
        return userStorage.save(user);
    }

    @Override
    public boolean isRegistered(Login login) {
        User user = userStorage.get(login);
        return user != null;
    }
}
