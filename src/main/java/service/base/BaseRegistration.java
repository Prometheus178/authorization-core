package service.base;

import model.User;

/**
 * Author: Sergey.
 */
public abstract class BaseRegistration implements Registration {

    protected final Storage<User> storage;

    protected BaseRegistration(Storage<User> storage) {
        this.storage = storage;
    }
}
