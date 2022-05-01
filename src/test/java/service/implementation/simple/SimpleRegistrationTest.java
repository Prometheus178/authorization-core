package service.implementation.simple;

import model.User;
import org.junit.jupiter.api.Test;
import service.base.Registration;
import service.base.Storage;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Author: Sergey.
 */
class SimpleRegistrationTest extends BaseTest{

    @Test
    public void test() {
        String username = "user";
        String password = "pass";
        User user = getUserByName(username, password);
        User user1 = getUserByEmail("test@test.com", password);

        Storage<User> userStorage = new TestStore();
        Registration registration = new SimpleRegistration(userStorage);
        assertFalse(registration.isRegistered(user.getLogin()));
        assertTrue(registration.registration(user));
        assertTrue(registration.isRegistered(user.getLogin()));

        assertTrue(registration.registration(user1));
        assertTrue(registration.isRegistered(user1.getLogin()));
    }

}