public class Bag {
  private Ball[] balls;

  public Bag() {
    this.balls = new Ball[5];
  }

  public int getSize() {
    return this.balls.length;
  }

  public boolean isEmpty() {
    for (int i = 0; i < this.balls.length; i++) {
      if (this.balls[i] != null) {
        return false;
      }
    }
    return true;
  }

  public boolean isFUll() {
    for (int i = 0; i < this.balls.length; i++) {
      if (this.balls[i] == null) {
        return false;
      }
    }
    return true;
  }

  public boolean add(Ball newBall) {
    for (int i = 0; i < this.balls.length; i++) {
      if (this.balls[i] == null) {
        this.balls[i] = newBall;
      }
    }
    return false;
  }

  public Ball pick(int index) {
    if (index < 0 || index >= 0 this.balls.length)
      return null;
    return this.balls[index];
    this.balls[index] = null;
    return ball;
  }
}
