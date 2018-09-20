package functions;

import java.util.function.Function;

public class Lower implements Function<String, String> {

	public String apply(String name) {
		return name.toUpperCase();
	}
}
