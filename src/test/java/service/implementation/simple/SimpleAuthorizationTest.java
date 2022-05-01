package service.implementation.simple;

import model.Login;
import model.User;
import org.junit.jupiter.api.Test;
import service.base.Storage;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Author: Sergey.
 */
class SimpleAuthorizationTest extends BaseTest{

    @Test
    public void test() {
        User user1 = getUserByName("user", "pass");
        User user2 = getUserByName("username", "123");
        User user3 = getUserByEmail("username@test.com", "123");
        Login login = new Login();
        User emptyUser = new User(login);
        Storage<User> userStorage = new TestStore();
        userStorage.save(user1);
        userStorage.save(user3);
        userStorage.save(emptyUser);

        SimpleAuthorization simpleAuthorization = new SimpleAuthorization(userStorage);
        assertTrue(simpleAuthorization.verify(user1));
        assertFalse(simpleAuthorization.verify(user2));
        assertTrue(simpleAuthorization.verify(user3));
        assertFalse(simpleAuthorization.verify(emptyUser));
    }


}