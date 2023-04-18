package fuenftertermin;

public class Thread01 {
  public static void main(String[] args){
    final Thread t = Thread.currentThread();
    System.out.println("Name = " + t.getName());
    System.out.println("Id = " + t.getId());
    System.out.println("State = " + t.getState());    
  }
}