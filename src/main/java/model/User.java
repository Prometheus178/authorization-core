package model;

/**
 * Author: Sergey.
 */
public class User extends BaseObject {

    private Login login;
    private String password;

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
