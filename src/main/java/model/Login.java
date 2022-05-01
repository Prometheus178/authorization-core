package model;

import java.util.Objects;

/**
 * Author: Sergey.
 */
public class Login extends BaseObject {

    private String name;
    private String email;
    private String phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Login login = (Login) o;
        return Objects.equals(name, login.name) && Objects.equals(email, login.email) && Objects.equals(phone, login.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name, email, phone);
    }

    @Override
    public String toString() {
        return "Login{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
