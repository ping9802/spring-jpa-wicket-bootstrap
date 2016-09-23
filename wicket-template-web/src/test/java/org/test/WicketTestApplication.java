package org.test;

import org.apache.wicket.spring.test.ApplicationContextMock;
import org.kamranzafar.samples.wicket.template.Application;

public class WicketTestApplication extends Application {

    public ApplicationContextMock getCtx() {
        return ctx;
    }

    private ApplicationContextMock ctx = new ApplicationContextMock();


   // @Override
   /* protected void init() {
        getComponentInstantiationListeners().add(new SpringComponentInjector(this, ctx));
    }*/
}
