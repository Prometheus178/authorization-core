package service.base;

import model.Login;

/**
 * Author: Sergey.
 */
public interface Storage<User>{

    boolean save(User user);

    boolean update(User user);

    void delete(Login login);

    void erase(Login login);

    User get(Login login);


}
