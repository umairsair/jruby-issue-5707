package jrbuy.encoding.error;

import org.jruby.embed.LocalContextScope;
import org.jruby.embed.ScriptingContainer;

public class JRubyEvalTest {

	public static void main(String[] args) {
		new ScriptingContainer(LocalContextScope.SINGLETHREAD).runScriptlet("puts 'hello from jruby'"); 
	}

}
