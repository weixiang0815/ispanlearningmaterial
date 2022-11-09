package ch09;

public class TestCommandLineArgs { 
   public static void main(String[] args) {
      for ( int i = 0; i < args.length; i++ ) {
        System.out.println("args[" + i + "] is '" +   args[i] + "'");
      }
   }
}
