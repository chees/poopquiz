package models;

import java.util.Collection;

import siena.Generator;
import siena.Id;
import siena.Model;
import siena.Query;
import utils.Util;

public class QuizModel extends Model {
	@Id(Generator.AUTO_INCREMENT)
	public Long id;
	public String owner;
	public String name;
	public String slug;

	public QuizModel(String owner, String name, String slug) {
		this.owner = owner;
		this.name = name;
		this.slug = slug;
	}

	private static Query<QuizModel> all() {
		return Model.all(QuizModel.class);
	}

	public static QuizModel findById(String id) {
		return all().filter("id", id).get();
	}

	public static Collection<QuizModel> findByUser(String owner) {
		return all().filter("owner", owner).fetch();
	}

	public static QuizModel findBySlug(String slug) {
		return all().filter("slug", slug).get();
	}
}
