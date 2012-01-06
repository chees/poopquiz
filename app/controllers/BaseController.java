package controllers;

import play.modules.gae.GAE;
import play.mvc.*;

public class BaseController extends Controller {

	@Before
    protected static void checkConnected() {
        if(GAE.getUser() == null) {
            Application.login();
        } else {
            renderArgs.put("user", GAE.getUser().getEmail());
        }
    }
	
    protected static String getUser() {
        return renderArgs.get("user", String.class);
    }
}
