package test;

public class Test02 {

	public static void main(String[] args) {
		Student student = new Student("김인규", "낙성대학교", "010-4710-9210", "Java 수업", "수업일정 메시지를 전송 합니다.");
		
		System.out.println(student.getSubject() + " : " + student.getschool() + " "+ student.getName() + "학생");
		student.setSchool("첨성대학교");
		System.out.println("김인규님의 학교가 "+ student.getschool()  + " 로 변경되었씁니다.");
		System.out.println(student.getSubject() + " : " + student.getschool() + " "+ student.getName() + "학생");
		System.out.println(student.getName() + "에게" + " " + student.getPhone() + " " + student.getMessage());
		student.setMessage("잘하자! 라고 전송 합니다.");
		System.out.println(student.getName() + "에게" + " " + student.getPhone() + " " + student.getMessage());
		
//		삼성에서 제조된 Gallaxy 입니다. 
//		전화 번호 : 010-111-2222
//		일련 번호 : 1234567890
//		010-0000-9999 로 전화를 겁니다 뚜르르르르...
//		000-1234-5678 로 "자니?" 메시지를 전송 합니다.
		System.out.println();
		Galaxy gal = new Galaxy("삼성", "Gallaxy", "1234567890", "010-111-2222");
		System.out.println(gal.getCompany() + "에서 제조된 " + gal.getModelName() + " 입니다. ");
		System.out.println("전화번호 : " +gal.getPhone());
		System.out.println("일련 번호 : " +gal.getModelNumber());
		gal.SetPhone("010-0000-9999");
		System.out.println(gal.getPhone() + "로 전화를 겁니다 뚜르르르르....");
		gal.SetPhone("000-1234-5678");
		System.out.println(gal.getPhone() + " 로 \"자니?\" 메시지를 전송 합니다.");
	}
	

}
