package singlrtonpatterndesign;

public class logger {
      private static logger obj=new logger();
      private logger() {
    	  System.out.println("logger obj created by early");
      }
      public static logger getlogger() {
    	  return obj;
      }
      public void log(String msg) {
    	  System.out.println(msg );
      }
}
