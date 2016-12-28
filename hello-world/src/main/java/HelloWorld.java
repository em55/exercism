public class HelloWorld {
  public static String hello(String name) {
    if (name == "" || name == null) {
      return "Hello, World!";
    }
    return "Hello, " +name+ "!";
  }
}
