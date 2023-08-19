/*
 * Copyright 2018-2023 Henri Tremblay.
 */
package pro.tremblay.alljava.conf;

import org.graalvm.polyglot.Context;
import org.junit.jupiter.api.Test;

import javax.script.ScriptException;

class TextBlock16 {

  @Test
  void test() throws ScriptException {
    String script = "function hello() {\n" +
      "    print(\"Hello, world\");\n" +
      "}\n" +
      "\n" +
      "hello();\n";

    try (Context context = Context.create("js")) {
      context.eval("js", script);
    }

//    ScriptEngine engine = new ScriptEngineManager().getEngineByName("js");
//    engine.eval(script);

    System.out.println(script);
  }

  @Test
  void escaping() {

    // Escape character
    var tab = """
        a\tb""";
    System.out.println(tab);

    // Trailing whitespaces
    var trailing = """
        a   \s
        """;
    System.out.println("trailing");

    // Multiline
    var multiline = """
        this \
        is \
        a super long line""";
    System.out.println(multiline);

  }

}

// Text block
// .replace
// Show bytecode
// -XX:+UnlockExperimentalVMOptions -XX:-UseJVMCICompiler
