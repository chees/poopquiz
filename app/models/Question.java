package models;

import java.util.Collection;

import siena.Generator;
import siena.Id;
import siena.Model;
import siena.Query;

public class Question extends Model {
	@Id(Generator.AUTO_INCREMENT)
	public Long id;
	
	public QuizModel quiz;
	
	public String question;
	
	public String answer0;
	public String answer1;
	public String answer2;
	public String answer3;
	public String answer4;
	public String answer5;
	
	public int correctAnswer;
}
