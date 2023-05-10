package org.credex.hiring.portal.serviceImpl;

import org.credex.hiring.portal.model.LoginInfo;
import org.credex.hiring.portal.service.LoginAndRegistration;
import org.springframework.stereotype.Service;

@Service
public class LoginAndRegistrationImpl implements LoginAndRegistration {
    @Override
    public boolean validateUser(LoginInfo loginInfo) {
        if (loginInfo.getUser().equalsIgnoreCase("test") && loginInfo.getPassword().equalsIgnoreCase("test")) {
            return true;
        }
        return false;
    }
}
