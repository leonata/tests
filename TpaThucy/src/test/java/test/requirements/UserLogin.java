package test.requirements;

import net.thucydides.core.annotations.Feature;

public class UserLogin {
    @Feature
    public class LoginByUser {
        public class LoginWithCorrectCredentials {}
        public class LoginWithIncorrectCredentials {}
    }
}