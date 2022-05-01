package service.interfaces;

import model.Login;

/**
 * Author: Sergey.
 */
public interface Authorization {

    boolean verify(Login login, String password);

}
