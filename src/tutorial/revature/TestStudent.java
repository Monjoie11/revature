package tutorial.revature;

public class TestStudent {



  public static void main(String[] args) {

    Student s = new Student();
    s.setStudentName("Jeff");
    s.setAddress("1007 SE 49h Ave");
    s.setCollegeName("Revelle");
    s.setStudentId(1111);

    System.out.println(s.getStudentName());
    System.out.println(s.getStudentId());
    System.out.println(s.getAddress());
    System.out.println(s.getCollegeName());
  }

}
