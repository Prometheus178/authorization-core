package service.interfaces;

import model.Login;

/**
 * Author: Sergey.
 */
public interface Registration {

    boolean registration(Login login, String password);

    boolean isRegistered(Login login);

}
