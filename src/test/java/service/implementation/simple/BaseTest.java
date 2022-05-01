package service.implementation.simple;

import model.Login;
import model.User;

/**
 * Author: Sergey.
 */
public abstract class BaseTest {

    protected User getUserByName(String username, String password) {
        Login login = new Login();
        User user = new User(login);
        login.setName(username);
        user.setLogin(login);
        user.setPassword(password);
        return user;
    }

    protected User getUserByEmail(String email, String password) {
        Login login = new Login();
        User user = new User(login);
        login.setEmail(email);
        user.setLogin(login);
        user.setPassword(password);
        return user;
    }
}
