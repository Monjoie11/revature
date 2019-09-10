public class TestBank {

  public static void main(String[] args) {
    Bank b1 = new SBI();
    Bank b2 = new AXIS();
    System.out.println(b1.getRateOfInterest());
    System.out.println(b2.getRateOfInterest());
  }

}
