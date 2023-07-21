package org.drools6.ddengine;

//import org.drools.devguide.eshop.model.Item;

import org.drools6.ddengine.model.Product;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class App 
{
    public static void main( String[] args )
    {
       System.out.println("Bootstrapping the rule Engine...");

       //Bootstrapping a rule Engine Session
       KieServices ks = KieServices.Factory.get();
       KieContainer kContainer = ks.getKieClasspathContainer();
       KieSession kSession = kContainer.newKieSession();

       //Item item = new Item("A", 1000.0, 2000.0);
       Product product = new Product("Car", 12.8, 33.8);
       System.out.println("Item Category: " + product.getClassCar());
       kSession.insert(product);
       int fired = kSession.fireAllRules();
       System.out.println("Number of Rules executed = " + fired);
       System.out.println("Item Category: " + product.getClassCar());
    }
}
