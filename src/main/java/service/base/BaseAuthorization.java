package service.base;

import model.User;

/**
 * Author: Sergey.
 */
public abstract class BaseAuthorization implements Authorization{

    protected Storage<User> storage;

    public BaseAuthorization(Storage<User> storage) {
        this.storage = storage;
    }
}
