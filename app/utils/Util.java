package utils;

public class Util {
	public static String slugify(String s) {
		return s.toLowerCase().replaceAll("[^a-z0-9\\s]", "").replaceAll("\\s", "-");
	}
}
