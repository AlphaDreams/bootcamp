import java.math.BigDecimal;
import java.math.RoundingMode;
  
public class Person { // blueprint 藍圖
  // height weight
  private double height;
  private double weight;
  // private double bmi;

  // Getter
  public double getHeight() {
    return this.height;
  }

  public double getWeight() {
    return this.weight;
  }

  // setter
  public void setHeight(double height) {
    this.height = height;
    // calculate BMI and refresh
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }


 // getBMI (weight / height^2)
  public double getBMI() { // presentation
    return BigDecimal.valueOf(this.weight)
        .divide(BigDecimal.valueOf(Math.pow(this.height, 2.0)), 2,
            RoundingMode.HALF_UP)
        .doubleValue();
  }

  //getWeightStatus
  public String getWeightStatus(){
    double bmi = this.getBMI();
    if(bmi < 18.5) {
      return "Underweight";
    } else if (bmi >=18.5 && bmi < 25.0) {
      return "Normal";
    } else if (bmi >=25.0 && bmi < 30.0) {
      return "Overweight";
    }
    return "Obese";
  }

  public static void main(String[] args) {
    Person p1 = new Person();
    System.out.println(p1.getHeight()); //0.0
    System.out.println(p1.getWeight()); //0.0
    
    Person p2 = new Person();
    System.out.println(p2.getHeight()); //0.0
    System.out.println(p2.getWeight()); //0.0

    p1.setHeight(1.76);
    p1.setWeight(76);
    System.out.println("P1 BMI =" + p1.getBMI()); //24.54
    System.out.println("P1 WeightStatus =" + p1.getWeightStatus()); //Overweight

    p2.setHeight(1.61);
    p2.setWeight(54);
    System.out.println("P2 BMI =" + p2.getBMI()); //24.54
    System.out.println("P2 WeightStatus =" + p2.getWeightStatus()); //Overweight
  
    
  }
}
