package service.implementation.simple;

import model.Login;
import model.User;
import service.base.BaseAuthorization;
import service.base.Storage;

/**
 * Author: Sergey.
 */
public class SimpleAuthorization extends BaseAuthorization {

    public SimpleAuthorization(Storage<User> storage) {
        super(storage);
    }

    @Override
    public boolean verify(User user) {
        if (user == null) return false;
        Login login = user.getLogin();
        User existedUser = storage.get(login);
        if (existedUser != null){
            return existedUser.equals(user);
        }
        return false;
    }


}
