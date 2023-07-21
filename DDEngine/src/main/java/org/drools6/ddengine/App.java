package org.drools6.ddengine;

import java.io.PrintStream;
import javax.inject.Inject;
import org.drools.devguide.eshop.model.Item;
import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;
import org.kie.api.cdi.KSession;
import org.kie.api.runtime.KieSession;

public class App 
{
    @Inject
    @KSession("")

    KieSession kSession;

    public void start(){
        Item item = new Item("A", 123.0, 234.0);
        System.out.println("Item Category : " + item.getCategory());
        kSession.insert(item);
        int fired = kSession.fireAllRules();
        System.out.println("Number of Rules executed = " + fired);
        System.out.println("Item Category: " + item.getCategory());
    }

    public static void main( String[] args )
    {
        Weld weld = new Weld();

        WeldContainer wc = weld.initialize();
        App bean = wc.instance().select(App.class).get();
        bean.start();
        weld.shutdown();
    }
}
