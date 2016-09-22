package org.kamranzafar.samples.wicket.template.service.impl;

import org.kamranzafar.samples.wicket.template.User;
import org.kamranzafar.samples.wicket.template.service.LoginService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @author kamran
 * 
 */
@Service
public class LoginServiceImpl extends BaseServiceImpl implements LoginService {

    private static final Logger log = LoggerFactory.getLogger(LoginServiceImpl.class);
	@Override
	public User authenticate(String username, String password) {
		log.info("AUTHENTICATING... username: " + username + " password: " + password);
        return daoManager.getUserDao().getUserByUsernameAndPassword(username, password);
	}
}
