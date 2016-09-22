package org.kamranzafar.samples.wicket.template.pages;

import org.apache.wicket.authroles.authorization.strategies.role.annotations.AuthorizeInstantiation;
import org.kamranzafar.samples.wicket.template.AuthenticatedPage;
import org.kamranzafar.samples.wicket.template.MenuItemEnum;

import java.util.logging.Logger;

/**
 * @author kamran
 * 
 */
@AuthorizeInstantiation("USERS")
public class Index extends AuthenticatedPage {
	private static Logger logger = Logger.getLogger(Index.class.getName());

	public Index() {
	}

	@Override
	public MenuItemEnum getActiveMenu() {
		return MenuItemEnum.INDEX;
	}
}
