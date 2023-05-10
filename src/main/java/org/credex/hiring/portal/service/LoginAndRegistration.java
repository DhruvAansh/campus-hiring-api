package org.credex.hiring.portal.service;

import org.credex.hiring.portal.model.LoginInfo;

public interface LoginAndRegistration {
    boolean validateUser (LoginInfo loginInfo);
}
