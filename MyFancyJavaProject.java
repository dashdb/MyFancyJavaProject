public class Main {
  int x = 5;
  private static Singleton myObj;
  
  private Singleton() {}

  public static Singleton getInstance() {
    myObj = new Singleton();
    System.out.println(myObj.x);
  }
}
