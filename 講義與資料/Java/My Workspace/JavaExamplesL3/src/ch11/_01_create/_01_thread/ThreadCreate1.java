package ch11._01_create._01_thread;
public class ThreadCreate1 {
   public static void main(String args[]) { 
      HelloThread r = new HelloThread("Kitty", 1500);
      HelloThread s = new HelloThread("Micky", 2000);
      r.start();  s.start();
   }
}
