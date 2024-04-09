package implementation;

public class SingletonSimple {
  private static SingletonSimple instance;
  private String data;

  private SingletonSimple() {
    this.data = "data";
  }

  public static SingletonSimple getInstance() {
    if (instance == null) {
      instance = new SingletonSimple();
    }
    return instance;
  }
}
