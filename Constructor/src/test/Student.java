package test;

public class Student {
	private String name;
	private String school;
	private String phone;
	private String subject;
	private String message;
	
	public Student(String name, String school, String phone, String subject, String message) {
		this.name = name;
		this.school = school;
		this.phone = phone;
		this.subject = subject;
		this.message = message;
	}
//	
//	java 수업 : 낙성대학교 김인규학생
//	김인규님의 학교가 첨성대학교로 변경되었습니다.
//	java 수업 : 첨성대학교 김인규학생
//	김인규학생에게 (010-0000-1111) 수업일정 메시지를 전송 합니다.
//	김인규학생에게 (010-0000-1111) 잘하자! 라고 전송 합니다.
	

	public void setSchool(String school) {
		this.school = school;
	}
	
	public String getschool() {
		return school;
	}
	
	public String getName( ) {
		return name;
	}
	
	public String getSubject() {
		return subject;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
}
