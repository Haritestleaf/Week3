package Students;

public class StudentsOverloading {
	public void getStudentInfo(int id) {
System.out.println("Student id is " + id);

	}
	public void getStudentInfo(int id, String name) {
		System.out.println("Student name " + name + " and ID is "+ id);

			}
	public void getStudentInfo(String email, long number) {
		System.out.println("Student email " + email   + " and phone number : " + number);

			}
	public static void main(String[] args) {
		StudentsOverloading s = new StudentsOverloading();
		s.getStudentInfo(151030341);
		s.getStudentInfo(151030341, "Hari");
		s.getStudentInfo("hari@gmail.com", 9894593722L);
		
	}
}
