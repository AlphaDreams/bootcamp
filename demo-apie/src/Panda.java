public class Panda extends Animal {
  // Attributes -> inherited (name)
  private String color;

  public Panda(String name) {
    // super (parent)
    super(name); // calling parent class's constructor
  }

  // ! inherit all instance method: getName()
  public String getName() {
    return super.getName();
  }
}