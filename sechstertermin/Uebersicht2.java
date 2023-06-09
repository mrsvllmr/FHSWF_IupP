package sechstertermin;

// Path
import java.nio.file.*;
// Files
import java.io.*;
import java.nio.file.*;
import java.nio.charset.Charset;
// Threads
import java.util.concurrent.*;
// Streams
import java.util.stream.*;
// Wrapper (Arrays)
import java.util.*;

// Files
public class Uebersicht2 {
   public static void main(String[] args) {
      Path p = Paths.get("C:","Users","Rainald","Documents","ausgabe.txt");
      System.out.println(p.getFileName().toString());
      System.out.println(p.getParent().toString());
      System.out.println(p.getNameCount());
      System.out.println(p.isAbsolute());
      System.out.println(p.normalize().toString());
      System.out.println(p.toString());      
   }
}

// Files
class Files01Druck {

   public static String KODIERUNGEN = 
   "US-ASCII UTF-8 UTF-16 UTF-32 " +
   "windows-1251 windows-1252 windows-1253 windows-1254 " +
   "ISO-8859-1 ISO-8859-2 ISO-8859-15 ISO-8859-16";
 
   public static void main(String[] args) throws IOException {
   
      System.out.println("Standardkodierung: " + 
         System.getProperty("file.encoding"));
   
      for (String name : KODIERUNGEN.split(" ")) {
         System.out.println("\nKodierung: " + name + "\n");      
         try {
            Files.lines(Paths.get("test.txt"),Charset.forName(name))
               .forEach(System.out::println);
         } catch (Throwable e) {
            System.out.println("-> Funktioniert nicht");        
         }
      } 
      
   }
}

class Uebung5_LoesungDruck {
   public static void main(String[] args) throws IOException {
      String datei = "Uebung5.java";
      System.out.println("Anzahl Zeilen: "+countLines(datei));
   }
   public static long countLines(String datei) throws IOException {
      return Files.lines(Paths.get(datei)).count();
   }
}

// Threads
class Uebung02_LoesungDruck { 
    private static void methodA() {
        while(true) {System.out.println("A");}
    }
    public static void methodB() {
        while(true) {System.out.println("B");}
    }
    public static void main(String[] args) throws Exception{ 
        ExecutorService pool = Executors.newCachedThreadPool();
        pool.execute(Uebung02_LoesungDruck::methodA); 
        pool.execute(Uebung02_LoesungDruck::methodB); 
    } 
}

class BankAccount_SyncDruck {
   private volatile double balance;
   
   public synchronized void credit(double amount){
      balance = balance + amount; 
   }
   
   public synchronized void debit(double amount){ 
      balance = balance - amount; 
   }
   
   public double getBalance(){
      return balance;
   }
   
   public static void main(String[] args) throws InterruptedException {
      final BankAccount_Sync bankAccount = new BankAccount_Sync();
      ExecutorService executorService = Executors.newFixedThreadPool(10);
      for (int i=0; i < 100; i++) {
         executorService.execute(()-> bankAccount.debit(100)); 
         executorService.execute(()-> bankAccount.credit(100)); 
      }
      executorService.shutdown(); 
      while (!executorService.isTerminated()) {
         Thread.sleep(100);
      }
      System.out.println("Final Balance: " + bankAccount.getBalance()); 
   }
   
}

// Streams
class Uebung03_LoesungDruck { 
   public static double average(int... a) {
      return IntStream.of(a)
         .average()
         .getAsDouble();
   }
   public static void main(String[] args) throws Exception{        
      int[] a = {1,7,4,8,2,9,20,3};
      System.out.println(average(a)); 
   }       
}

class Uebung04_LoesungDruck { 
   public static void main(String[] args) {
      System.out.println(count(4,"Rudolf","Emma","Otto",
         "Agnes","Kurt","Emma","Otto"));
   }
   private static long count(int length, String... namen) {
      return Stream.of(namen)
         .distinct()
         .filter(s -> s.length() == length)
         .count();
   }
}

// String (und z.T: Stream(
class String01Druck {
   public static void main(String[] args) {
      Stream
         .of("a1 c1 b2 b1 a2 d1 c2 d2".split(" "))
         .filter(s -> s.startsWith("c") || s.endsWith("2"))
         .map(String::toUpperCase)
         .sorted()
         .forEach(System.out::println); 
   }
}

class String02Druck {

   public static final String LOREMIPSUM = "Lorem ipsum dolor sit amet, " +
   "consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt " +
   "ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero " +
   "eos et accusam et justo duo dolores et ea rebum. Stet clita kasd " + 
   "gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet.";
   
   public static void main(String[] args) {
      int count = 0;
      int i = 0;
      String s = LOREMIPSUM.toLowerCase();
      while (i < s.length()) {
         char c = s.charAt(i++);
         if (c >= 'a' && c <= 'z') count++;         
      }
      System.out.println("Anzahl Buchstaben A-Z: " + count);
      
      System.out.println("Anzahl Worte: " +
         Stream
         .of(s.replace(",","").replace(".","").split(" "))
         .filter(wort -> wort.length() > 0)
         .count()
         );
   }
}

class String03Druck {
   public static void main(String[] args) {
      System.out.print("\"aaaab\".matches(\"a*b\") ist ");
      System.out.println("aaaab".matches("a*b"));               // true, weil kein oder mehrere a gefolgt von b
   
      System.out.print("\"b\".matches(\"a*b\") ist ");
      System.out.println("b".matches("a*b"));                   // true, weil kein oder mehrere a gefolgt von b
   
      System.out.print("\"a\".matches(\".\") ist ");
      System.out.println("a".matches("."));                     // true, weil einzelnes Zeichen
   
      System.out.print("\"abc\".matches(\".\") ist ");
      System.out.println("abc".matches("."));                   // false, weil kein einzelnes Zeichen
   
      System.out.print("\"abc\".matches(\".*\") ist ");
      System.out.println("abc".matches(".*"));                  // true, weil keins oder mehrere beliebige Zeichen
      
      System.out.print("\"2nnp\".matches(\".n{1,3}\") ist ");
      System.out.println("2nnp".matches(".n{1,3}"));            // false, weil mindestens 1 und höchstens 3 Zeichen
   
      System.out.print("\"2ybcd\".matches(\"2[xyz].+\") ist ");
      System.out.println("2ybcd".matches("2[xyz].+"));          // true, weil 2 gefolgt von (x oder y oder z) gefolgt von mindestens irgendeinem Zeichen
   
      System.out.print("\"2bkbv\".matches(\".+[abc][zv].*\") ist ");
      System.out.println("2bkbv".matches(".+[abc][zv].*"));     // true, weil mindestens ein beliebiges Zeichen gefolgt von (a oder b oder c) gefolgt von (z oder v) gefolgt von keinem oder mehreren beliebigen Zeichen
                                                                // "2kb" hier von .+ abgedeckt!
      
      System.out.print("\"1+1\".matches(\"1+1\") ist ");
      System.out.println("1+1".matches("1+1"));                 // false, weil mindestens eine 1 gefolgt von 1
      
      System.out.print("\"1+1\".matches(\"1\\\\+1\") ist ");
      System.out.println("1+1".matches("1\\+1"));               // true, weil 1+1 
                                                                // durch \\ ist das "+" ohne Bedeutung            
   }
}

class String04Druck {
   public static void main(String[] args) {
      String[] r = "1x2x3x4x5".split("x");   
      String[] s = "1\\2\\3\\4\\5".split("\\\\");   
      String[] t = "1.2.3.4.5".split("\\.");
   }
}

class Uebung1Druck {
    
   public static void main(String[] args) {
      String test = "0xABC 0x126 0xxa 0abc 0xAaA 0x";
      for (String s : test.split(" "))
         System.out.println(s+" "+isHexIntLiteral(s));
   }
   
   public static boolean isHexIntLiteral(String s) {
       if (s.matches("0x[0-9A-Fa-f]+")) {
           return true;
       }
       // return s != null && s.length() <= 10 && s.toLowerCase().matches("0x[0-9a-f]+");
       return false;
   }
}


/*
 * Warum?
 * - Übergebener String sollte nie null sein, da dann in jedem Fall kein HexLiteral
 * - Die Länge kann maximal 10 betragen: 0x bzw. 0X --> 2 Stellen + maximal 8 hexadezimale Ziffern (eine hexadezimale Ziffern braucht binär 4 Bits -> 4*8 = 32 Bits -> int-Größe)
 */

class BeispieleStreamsDruck {
   public static void main(String[] args)
   {
      // initialize array of Employees
      Employee[] employees = {
         Employee.create("Jason", "Red", 5000, "IT"),
         Employee.create("Ashley", "Green", 7600, "IT"),
         Employee.create("Matthew", "Indigo", 3587.5, "Sales"),
         Employee.create("James", "Indigo", 4700.77, "Marketing"),
         Employee.create("Luke", "Indigo", 6200, "IT"),
         Employee.create("Jason", "Blue", 3200, "Sales"),
         Employee.create("Wendy", "Brown", 4236.4, "Marketing")};
   
      // get List view of the Employees
      List<Employee> list = Arrays.asList(employees);
   
      // display all Employees
      System.out.println("Complete Employee list:");
      list.stream().forEach(System.out::println);
      
      // Predicate that returns true for salaries in the range $4000-$6000
      Predicate<Employee> fourToSixThousand = 
         e -> (e.getSalary() >= 4000 && e.getSalary() <= 6000);
   
      // Display Employees with salaries in the range $4000-$6000
      // sorted into ascending order by salary
      System.out.printf(
         "%nEmployees earning $4000-$6000 per month sorted by salary:%n");
      list.stream()
          .filter(fourToSixThousand)
          .sorted(Comparator.comparing(Employee::getSalary))
          .forEach(System.out::println);
   
      // Display first Employee with salary in the range $4000-$6000
      System.out.printf("%nFirst employee who earns $4000-$6000:%n%s%n",
         list.stream()
             .filter(fourToSixThousand)
             .findFirst()
             .get());
   
      // Functions for getting first and last names from an Employee
      Function<Employee, String> byFirstName = Employee::getFirstName;
      Function<Employee, String> byLastName = Employee::getLastName;
   
      // Comparator for comparing Employees by first name then last name
      Comparator<Employee> lastThenFirst = 
         Comparator.comparing(byLastName).thenComparing(byFirstName);
   
      // sort employees by last name, then first name 
      System.out.printf(
         "%nEmployees in ascending order by last name then first:%n");
      list.stream()
          .sorted(lastThenFirst)
          .forEach(System.out::println);
   
      // sort employees in descending order by last name, then first name
      System.out.printf(
         "%nEmployees in descending order by last name then first:%n");
      list.stream()
          .sorted(lastThenFirst.reversed())
          .forEach(System.out::println);
   
      // display unique employee last names sorted
      System.out.printf("%nUnique employee last names:%n");
      list.stream()
          .map(Employee::getLastName)
          .distinct()
          .sorted()
          .forEach(System.out::println);
   
      // display only first and last names
      System.out.printf(
         "%nEmployee names in order by last name then first name:%n"); 
      list.stream()
          .sorted(lastThenFirst)
          .map(Employee::getName)
          .forEach(System.out::println);
   
      // group Employees by department
      System.out.printf("%nEmployees by department:%n"); 
      Map<String, List<Employee>> groupedByDepartment =
         list.stream()
             .collect(Collectors.groupingBy(Employee::getDepartment));
      groupedByDepartment.forEach(
         (department, employeesInDepartment) -> 
         {
            System.out.println(department);
            employeesInDepartment.forEach(
               employee -> System.out.printf("   %s%n", employee));
         }
         );
   
      // count number of Employees in each department
      System.out.printf("%nCount of Employees by department:%n"); 
      Map<String, Long> employeeCountByDepartment =
         list.stream()
             .collect(Collectors.groupingBy(Employee::getDepartment, 
                TreeMap::new, Collectors.counting()));
      employeeCountByDepartment.forEach(
         (department, count) -> System.out.printf(
            "%s has %d employee(s)%n", department, count));
   
      // sum of Employee salaries with DoubleStream sum method
      System.out.printf(
         "%nSum of Employees' salaries (via sum method): %.2f%n",
         list.stream()
             .mapToDouble(Employee::getSalary)
             .sum());
   
      // calculate sum of Employee salaries with Stream reduce method
      System.out.printf(
         "Sum of Employees' salaries (via reduce method): %.2f%n",
         list.stream()
             .mapToDouble(Employee::getSalary)
             .reduce(0, (value1, value2) -> value1 + value2));  
   
      // average of Employee salaries with DoubleStream average method
      System.out.printf("Average of Employees' salaries: %.2f%n",
         list.stream()
             .mapToDouble(Employee::getSalary)
             .average()
             .getAsDouble());      
   } // end main

}

// System
class System01Druck {
    public static void main(String[] args) {
        System.out.println("OS: " + System.getenv("os"));
        System.out.println("OS: " + System.getProperty("os.name"));        
    }
}

// Wrapperklasse
class Wrapperklasse01Druck {
   public static void main(String[] args) {
      Double p = 123456789.123456789;
      System.out.println("byte: " + p.byteValue());
      System.out.println("short: " + p.shortValue());
      System.out.println("int: " + p.intValue());
      System.out.println("long: " + p.longValue());
      System.out.println("float: " + p.floatValue());
      System.out.println("double: " + p.doubleValue());
      System.out.println(4711.longValue());
   }
}

class Wrapperklasse02Druck {
   public static void main(String[] args) {
      System.out.println(Boolean.parseBoolean("Weihnachten"));
      System.out.println(Boolean.parseBoolean("TRUE")); 
      System.out.println(Boolean.parseBoolean("very true")); 
      System.out.println(Byte.parseByte("123"));                  
      System.out.println(Integer.parseInt("123"));
      System.out.println(Integer.parseInt("123",8));  
      System.out.println(Float.parseFloat("123.0"));   
      System.out.println(Double.parseDouble("123.0"));                
   }
}

class Uebung2Druck {
   public static void main(String[] args) {
      Integer i1 = Integer.valueOf(1000);
      Integer i2 = Integer.valueOf(1000);
      System.out.println( i1 >= i2 );   // true, durch Unboxing und Autoboxing
      System.out.println( i1 <= i2 );   // true, durch Unboxing und Autoboxing
      System.out.println( i1 == i2 );   // false, weil "==" nur auf dem Stack arbeitet, d.h. es vergleicht Referenzen
                                        // in einer gewissen Spanne werden Objekte als Pool vorgehalten, dann wird das sogar auch true
      
      // zeigt, dass es sich hierbei um Objekte handelt
      // Prüfung auf Gleichheit "==" nur bei primitiven Datentypen gegeben!
   }
}

class Wrapperklasse03Druck {
   public static void main(String[] args) {
      Integer i1 = 127;
      Integer i2 = 127;
      int i3 = 127;
      System.out.println(i1 == i2);     // true, weil gleiches Objekt (Integer-Pool/-Cache von -128-127)
      System.out.println(i1 == i3);     // true, weil automatisches Unboxing von Integer zu int
      Integer j1 = 128;
      Integer j2 = 128;
      int j3 = 128;
      System.out.println(j1 == j2);     // false, weil nicht mehr innerhalb Integer-Pool/-Cache
      System.out.println(j1 == j3);     // true, weil automatisches Unboxing von Integer zu int
      Integer k1 = 1000;
      Integer k2 = 1000;
      int k3 = 1000;
      System.out.println(k1 == k2);     // false, weil nicht mehr innerhalb Integer-Pool/-Cache
      System.out.println(k1 == k3);     // true, weil automatisches Unboxing von Integer zu int          
   }
}

class Wrapperklasse04Druck {
   public static void main(String[] args) {
      int i = 0x24b62;
      System.out.println(Character.isLetter(i));        // true                                     -> ist also Buchstabe
      System.out.println(Character.getName(i));         // CJK UNIFIED IDEOGRAPHS EXTENSION B 24B62 -> interner Name des Zeichens
      char high = Character.highSurrogate(i);               // 0xd852
      char low = Character.lowSurrogate(i);                 // 0xdf62
      String s = String.valueOf(Character.toChars(i));      
      System.out.println(s);                            // ?
      String s1 = "\ud852\udf62";
      String s2 = String.valueOf(new char[]{high,low});  
      System.out.println(s.equals(s1));                 // true
      System.out.println(s.equals(s2));                 // true 
      System.out.println(s1.equals(s2));                // true
   }
}

// Arrays
class Arrays01Druck {

   public static final String KODIERUNGEN = 
   "US-ASCII UTF-8 UTF-16 UTF-32 " +
   "windows-1251 windows-1252 windows-1253 windows-1254 " +
   "ISO-8859-1 ISO-8859-2 ISO-8859-15 ISO-8859-16";
 
   public static void main(String[] args){
      String[] kodierungen = KODIERUNGEN.toUpperCase().split("\\s+");
      System.out.println(Arrays.toString(kodierungen));
      Arrays.sort(kodierungen);
      System.out.println(Arrays.toString(kodierungen));
      Arrays.stream(kodierungen)
         .filter(s -> s.matches("ISO-8859-[1-9]")) 
         .forEach(System.out::println);  
   }
}

class Uebung6_LoesungDruck {
   public static void main(String[] args) {
      String[] months = {"January","February","March","April","May",
         "June","July","August","September","October","December"};
      System.out.println(Arrays.toString(months));
      sortByLength(months);
      System.out.println(Arrays.toString(months));      
   }
   public static void sortByLength(String[] s) {
      Arrays.sort(s,(a,b) -> a.length()-b.length());
   }
}