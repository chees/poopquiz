package controllers;

import java.util.Collection;

import models.QuizModel;
import play.mvc.Controller;

public class Profile extends BaseController {

    public static void index() {
    	Collection<QuizModel> quizzes = QuizModel.findByUser(getUser());
        render(quizzes);
    }

}
