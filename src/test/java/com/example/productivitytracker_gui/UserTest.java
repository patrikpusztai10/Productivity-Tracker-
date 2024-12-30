package com.example.productivitytracker_gui;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class UserTest extends User {


    @Test
    public void test() {

        User u=new User("petra","35462");
        assertNotNull(u,"The object user is not null");
        assertNotEquals("", u.getNameField(), "User name field cannot be empty");
        assertNotEquals("", u.getPasswordField(), "Password field cannot be empty");



    }
}
