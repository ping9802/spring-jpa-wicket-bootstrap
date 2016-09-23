package org.test;

import org.apache.wicket.util.tester.WicketTester;
import org.junit.Before;
import org.junit.Test;
import org.kamranzafar.samples.wicket.template.User;
import org.kamranzafar.samples.wicket.template.dao.UserDao;
import org.kamranzafar.samples.wicket.template.pages.Index;
import org.mockito.Mockito;

/**
 * Simple test using the WicketTester
 */
public class TestHomePage
{
	private WicketTester tester;

	@Before
	public void setUp()
	{
        WicketTestApplication application = new WicketTestApplication();
        application.getCtx().putBean(new User());
        application.getCtx().putBean(createMockDao());
        tester = new WicketTester(application);
	}

    @Test
	public void homepageRendersSuccessfully()
	{
		tester.startPage(Index.class);
		tester.assertRenderedPage(Index.class);
	}

    private UserDao createMockDao() {
        UserDao mock = Mockito.mock(UserDao.class);
        Mockito.when(mock.getUserByUsernameAndPassword("test", "password")).thenReturn(new User());
        return mock;
    }
}
