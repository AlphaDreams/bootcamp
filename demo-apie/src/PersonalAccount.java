public class PersonalAccount extends Account{
  
  public PersonalAccount() {
    // super(); // implicitly calling Account() conttuctor
  }

  @Override
  public double totalValue() {
    return -1.0;
    
  }
  public static void main(String[] args) {
    PersonalAccount pa = new PersonalAccount();
    pa.getSavingAccount();
    pa.getCurrentAccount();
    pa.totalValue();
    
  }
}
