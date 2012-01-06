package controllers;

import models.QuizModel;
import play.data.validation.Required;
import play.modules.gae.GAE;
import play.mvc.Before;
import play.mvc.Controller;
import utils.Util;

public class Quiz extends BaseController {
	
	public static void index() {
        //Collection<QuizModel> quizzes = List.findByUser(getUser());
        //render(lists);
    }
	
    public static void show(String slug) {
    	QuizModel quiz = QuizModel.findBySlug(slug);
        notFoundIfNull(quiz);
        render(quiz);
    }

    public static void create() {
    	render();
    }
    
    public static void createPost(@Required String name) {
    	String slug = Util.slugify(name);
    	
    	// TODO check if slug is valid
    	// TODO check reserved words
    	
    	if(validation.hasErrors()) {
            flash.error("Please give a name to your quiz.");
            create();
        }
    	
    	new QuizModel(getUser(), name, slug).insert();
    	
    	redirect("/"+slug);
    }
}
