package models;

import siena.Column;
import siena.Generator;
import siena.Id;
import siena.Model;
import siena.NotNull;

public class Question extends Model {
	@Id(Generator.AUTO_INCREMENT)
	public Long id;
	
	@Column("quiz")
	@NotNull
	public QuizModel quiz;
	
	@NotNull
	public String question;
	
	public String answer0;
	public String answer1;
	public String answer2;
	public String answer3;
	public String answer4;
	public String answer5;
	
	public int correctAnswer;
}
