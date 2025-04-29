import java.math.BigDecimal;
import java.math.RoundingMode;

// ! array > int[] + String[] + String[]
// 1. Finite length

// ! Class is going to solve a problem of "set of different values"
public class Circle {
  private double radius; // 7
  private String color; // Yellow


  public void setColor(String color) {
    this.color = color;
  }

  // c1.setColor("RED")
  // c1.getColor();
  // c2.getColor();
  public String getColor() {
    return this.color;
  }

  public char getColor2() {
    return this.color.charAt(0);
  }

  public int getColor3() {
    if (this.color.equals("RED")) {
      return 1;
    } else if (this.color.equals("YELLOW")) {
      return 2;
    }
    return 3;
  }




  // area (presentation)
// radius * radius * pi

  // Getter
  public double getRadius() {
    return this.radius;
  }  


   // setter
   public void setRadius(double radius) {
    this.radius = radius;
  }
  
 // area ( radius * radius * pi)
 public double area() { 
 return BigDecimal.valueOf(Math.pow(this.radius, 2.0))
      .multiply(BigDecimal.valueOf(Math.PI)) //
      .doubleValue();
}


  // return "BIG" (>= 5.0) or "SMALL"    
  // ! isBIG mean true / false
  public String getSizeStatus() {
    return this.area() >= 5.0 ? "BIG" : "SMALL" ;
  } 
  




  //
  public static void main(String[] args) {
    System.out.println(Math.PI); //3.14159....
    
    Circle c1 = new Circle();
    System.out.println(c1.getRadius()); //0.0
    
    // Circle c2 = new Circle();
    //System.out.println(c2.getRadius()); //0.0

    c1.setRadius(3.5);
    System.out.println("C1 Circle =" + c1.area()); //24.54
    
    System.out.println(c1.getSizeStatus()); // BIG

    Circle c2 = new Circle();
    c2.setRadius(1.0);
    System.out.println(c2.getSizeStatus()); // SMALL


    Circle c3 = new Circle();
    c3.setColor("YELLOW");
    System.out.println(c3.getColor()); // YELLOW

    c2.setColor("RED");
    System.out.println(c2.getColor()); //RED





  }
}
