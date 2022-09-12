
public class Student {
	String name;
	final int studentnumber;
	Diploma diploma;
	
	Student(String name, int studentnumber){
		this.name = name;
		this.studentnumber = studentnumber;
	}
	
	void CheckGraduated(int averageGrade, String education){
		if(averageGrade >= 6) {
			diploma = new Diploma(true);
			diploma.education = education;
			System.out.println(name + " graduated with an average of: " + averageGrade + " for the education: " + diploma.education);
		}
		else {
			System.out.println(name + " did not graduate, his average grade was: " + averageGrade);
		}
	}
}
