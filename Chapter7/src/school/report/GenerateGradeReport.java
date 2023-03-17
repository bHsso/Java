package school.report;

import java.util.ArrayList;

import grade.BasicEvaluation;
import grade.GradeEvaluation;
import grade.MajorEvaluation;
import school.School;
import school.Score;
import school.Student;
import school.Subject;
import utils.Define;

public class GenerateGradeReport {

	School school = School.getInstance(); 
	public static final String TITLE = " 수강생 학점 \t\t\n";
	public static final String HEADER = " 이름  |  학번  | 중점과목 | 점수     \n";
	public static final String LINE = "--------------------------------------\n";
	
	private StringBuffer buffer = new StringBuffer();

	public String getReport() {
		ArrayList<Subject> subjectList = school.getSubjectList() ;
		for( Subject subject : subjectList) {
			
		}
		return buffer.toString();
	}
	
	public void makeHeader(Subject subject ) { 
		buffer.append(GenerateGradeReport.LINE);
		buffer.append("\t"+ subject.getSubjectName());
		buffer.append(GenerateGradeReport.TITLE);
		buffer.append(GenerateGradeReport.HEADER);
		buffer.append(GenerateGradeReport.LINE);
	}
	public void getScoreGrade(Student std , int subjectId) {
		ArrayList<Score> scoreList = std.getScoreList();
		int majorId = std.getMajorSubject().getSubjectId();
		
		GradeEvaluation[] gradeEvaluation = { new BasicEvaluation() , new MajorEvaluation() };
		
		for( int i= 0 ; i<scoreList.size();i++) {
			Score score = scoreList.get(i);
			if(score.getSubject().getSubjectId() == subjectId ) {
				String grade ;
				if(score.getSubject().getSubjectId() == subjectId ) {
					grade = gradeEvaluation[Define.SAB_TYPE].getGrade(score.getPoint());
				}else {
					grade = gradeEvaluation[Define.AB_TYPE].getGrade(score.getPoint());
				}
				buffer.append(score.getPoint());
				buffer.append(":");
				buffer.append(grade);
				buffer.append("  |  ");
			}
		}
		
	}
	public void makeBody(Subject subject) {
		ArrayList<Student> stdList = subject.getStudentList();
		
		for( int i = 0 ; i<stdList.size() ; i++) {
			Student std = stdList.get(i);
			buffer.append(std.getStudentName());
			buffer.append("  |  ");
			buffer.append(std.getStudentId());
			buffer.append("  |  ");
			buffer.append(std.getMajorSubject().getSubjectName() +"\t");
			buffer.append("  |  ");
			getScoreGrade(std , subject.getSubjectId() );
			buffer.append("\n");
			buffer.append(LINE);
		}
	}
	
	public void makeFooter() {
		buffer.append("\n");
	}
	
	
}
