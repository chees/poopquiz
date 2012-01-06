package controllers;

import play.modules.gae.GAE;
import play.mvc.Controller;

import com.google.appengine.repackaged.com.google.common.collect.Lists;

public class Application extends Controller {

	public static void index() {
        if(GAE.isLoggedIn()) {
            Profile.index();
        }
        render();
    }
    
    public static void login() {
        GAE.login("Application.index");
    }
    
    public static void logout() {
        GAE.logout("Application.index");
    }
}