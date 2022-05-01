package service.implementation.simple;

import model.Login;
import model.User;
import service.base.BaseRegistration;
import service.base.Storage;

/**
 * Author: Sergey.
 */
public class SimpleRegistration extends BaseRegistration {


    public SimpleRegistration(Storage<User> storage) {
        super(storage);
    }

    @Override
    public boolean registration(User user) {
        return storage.save(user);
    }

    @Override
    public boolean isRegistered(Login login) {
        User user = storage.get(login);
        return user != null;
    }
}
