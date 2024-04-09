package implementation;

public class SingletonThreadSafe {
  // volatile - the variable must be read from the memory every time (cannot be cached)
  private static volatile SingletonThreadSafe instance;
  private String data;

  private SingletonThreadSafe() {
    this.data = "data";
  }

  public static SingletonThreadSafe getInstance() {
    // Introducing a local variable that can be cached to prevent reading multiple times from the memory when there is no need
    SingletonThreadSafe result = instance;
    if (result == null) {
      synchronized (SingletonThreadSafe.class) {
        result = instance;
        if (result == null) {
          instance = result = new SingletonThreadSafe();
        }
      }
    }
    return result;
  }
}
