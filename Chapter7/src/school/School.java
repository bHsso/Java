package school;

import java.util.ArrayList;

public class School {

	private static School instance = new School();
	private static String SCHOOL_NAME = "Good School";
	
	private ArrayList<Student> studentList = new ArrayList<Student>();
	private ArrayList<Subject> subjectList = new ArrayList<Subject>();
	
	//private School() {}; : 있어야 하는 이유는
	
	public static School getInstance() {
		if(instance == null ) {
			instance = new School() ;
		}
		return instance;
	}
	public static void setInstance(School instance) {
		School.instance = instance;
	}
	
	
	public ArrayList<Student> getStudentList() {
		return studentList;
	}
	public void addStudent( Student std ) {
		studentList.add(std);
	}
//	public void setStudentList(ArrayList<Student> studentList) {
//		this.studentList = studentList;
//	}
	
	
	public ArrayList<Subject> getSubjectList() {
		return subjectList;
	}
	public void addSubject( Subject sbj) {
		subjectList.add(sbj);
	}
//	public void setSubjectList(ArrayList<Subject> subjectList) {
//		this.subjectList = subjectList;
//	}
	
	
	
	
}
