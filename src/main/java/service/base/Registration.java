package service.base;

import model.Login;
import model.User;

/**
 * Author: Sergey.
 */
public interface Registration {

    boolean registration(User user);

    boolean isRegistered(Login login);

}
