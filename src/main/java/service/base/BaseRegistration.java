package service.base;

import model.User;

/**
 * Author: Sergey.
 */
public abstract class BaseRegistration implements Registration {

    protected final Storage<User> userStorage;

    protected BaseRegistration(Storage<User> userStorage) {
        this.userStorage = userStorage;
    }
}
