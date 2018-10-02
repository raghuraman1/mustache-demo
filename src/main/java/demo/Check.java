package demo;

import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

import com.github.mustachejava.DefaultMustacheFactory;
import com.github.mustachejava.Mustache;
import com.github.mustachejava.MustacheFactory;

public class Check {

	public static void main(String[] args) throws IOException {
		MustacheFactory mf = new DefaultMustacheFactory();
		  Mustache m = mf.compile("check.mustache");
	        Map<String, Object> context = new HashMap<>();
	        context.put("async", "false");
	        StringWriter writer = new StringWriter();
	        m.execute(writer, context).flush();
	        System.out.println(writer.toString());
	        System.out.println("------------");
	        context = new HashMap<>();
	        context.put("async", false);
	        writer = new StringWriter();
	        m.execute(writer, context).flush();
	        System.out.println(writer.toString());
	}

}
