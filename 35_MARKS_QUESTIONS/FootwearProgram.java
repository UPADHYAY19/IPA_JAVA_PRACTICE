import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Footwear {
  private int footwearId;
  private String footwearName;
  private String footwearType;
  private int price;

  Footwear(int a, String b, String c, int d) {
    this.footwearId = a;
    this.footwearName = b;
    this.footwearType = c;
    this.price = d;
  }

  public void setfootwearId(int footwearId) {
    this.footwearId = footwearId;
  }

  public void setfootwearName(String footwearName) {
    this.footwearName = footwearName;
  }

  public void setfootwearType(String footwearType) {
    this.footwearType = footwearType;
  }

  public void setprice(int price) {
    this.price = price;
  }

  public int getfootwearId() {
    return footwearId;
  }

  public String getfoorwearName() {
    return footwearName;
  }

  public String getfootwearType() {
    return footwearType;
  }

  public int getprice() {
    return price;
  }
}

public class FootwearProgram {
  // This method will take two input parameters. array of the Footwear objects and
  // string parameter footwear type.
  // This method will return the count of the footwears from array of the footwear
  // objects for the given type of footwear.
  // if no footwear with the given footwear type is found in the array of footwear
  // abjects,then the method should return 0.
  public static int getCountByType(Footwear[] arr, String type) {
    int cnt = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i].getfootwearType().equalsIgnoreCase(type)) {
        cnt++;
      }
    }
    return cnt > 0 ? cnt : 0;
  }

  // getSecondHighestPriceByBrand method:
  // This method will take 2 input parameters-array of footwear objects and string
  // parameter inputFootwearName.
  // The method will return the second highest footwear objects based on the price
  // from the array of the Footwear
  // objects whose brand name matches with the input string parameter.
  public static Footwear getSecondHighestPriceByBrand(Footwear[] arr, String s) {

    ArrayList<Footwear> list = new ArrayList<>();

    for (int i = 0; i < arr.length; i++) {
      if (arr[i].getfoorwearName().equalsIgnoreCase(s)) {
        list.add(arr[i]);
      }
    }

    if (list.size() < 2) {
      return null;
    }

    Collections.sort(list, (a, b) -> b.getprice() - a.getprice()); // is line me sorting + comparator hai

    return list.get(1);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();
    Footwear[] arr = new Footwear[n];
    for (int i = 0; i < n; i++) {
      int a = sc.nextInt();
      sc.nextLine();
      String b = sc.nextLine();
      String c = sc.nextLine();
      int d = sc.nextInt();
      sc.nextLine();
      arr[i] = new Footwear(a, b, c, d);

    }
    String type = sc.nextLine();
    int cnt = FootwearProgram.getCountByType(arr, type);
    String name = sc.nextLine();
    Footwear f = getSecondHighestPriceByBrand(arr, name);

    System.out.println("printing the output");
    if (cnt == 0) {
      System.out.println("brand is not found");
    } else {
      System.out.println(cnt);
    }

    if (f == null) {
      System.out.println("faaa...");
    } else {
      System.out.println(f.getfootwearId());
      System.out.println(f.getfoorwearName());
      System.out.println(f.getprice());
    }
    sc.close();

  }
}