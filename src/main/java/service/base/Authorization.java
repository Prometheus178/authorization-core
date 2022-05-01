package service.base;

import model.User;

/**
 * Author: Sergey.
 */
public interface Authorization {

    boolean verify(User user);

}
