package homework;


import java.util.Scanner;

public class MainTest 
{
	public static Scanner sc =new Scanner(System.in);
	public static void main(String[] args) throws Exception 
	{
		startProject();
		
	}
	public static void startProject() throws Exception 
	{
		StudentMenu stm = new StudentMenu();
		int menu=showmenu();
		
		switch(menu) 
		{
		case 1://학과 메뉴  
			showDepartmentMenu();
			break;
		case 2: //학생 메뉴
			showStudentMenu();
			break;
		case 3:	//과목 메뉴
			showLessonMenu();
			break;
		case 4:	//수강신청 메뉴
			showTraineeMenu();
			break;
		case 5:	 
			System.out.println("종료");
			return;
		}
		
	}
	public static void showStudentMenu() throws Exception 
	{
		boolean flag=false;
		StudentMenu stm = new StudentMenu();
		
		while(!flag) 
		{
			System.out.println("학생 정보 메뉴 번호를 입력하세요");
			System.out.println("1. 학생 정보 목록");
			System.out.println("2. 학생 정보 입력");
			System.out.println("3. 학생 정보 수정");
			System.out.println("4. 학생 정보 삭제");
			System.out.println("5  메인 메뉴");
			System.out.println("번호 선택:");
			int menu =sc.nextInt();
			switch(menu) 
			{
			case 1: //학생 목록 보기
				stm.showStudentList();
				break;
			case 2: //학생 추가하기 
				Student student =stm.inputStudent();
				stm.insertStudent(student);
				break;
			case 3://학생 정보 수정하기
				stm.updateStudent();
				break;
			case 4://학생 정보 삭제하기
				stm.deleteStudent();
				break;
			case 5://상위 스위치케이스문으로 돌아가기
				startProject();
				flag=true;
				break;
			}
		 }
	}

	public static void showTraineeMenu() throws Exception 
	{
		boolean flag=false;
		
		TraineeRegisterSubjectmenu.login();
		while(!flag) 
		{
			System.out.println("1.수강신청목록 2.수강신청 3.수강내역삭제 4.메인메뉴");
			int menu = sc.nextInt();
			switch(menu) 
			{
			case 1 ://수강신청 목록 보기
				TraineeRegisterSubjectmenu.showRegisterSubject();
				break;
			case 2 ://수강신청하기
				Trainee trainee =  TraineeRegisterSubjectmenu.inputRegisterSubject();
				TraineeRegisterSubjectmenu.insertRegisterSubject(trainee);
				break;
			case 3://수강신청 삭제하기 
				TraineeRegisterSubjectmenu.deleteRegisterSubject();
				break;
			case 4 ://상위 스위치 케이스문으로 돌아가기
				startProject();
				flag=true;
				break;
			}
		}
	}
		
	public static void showDepartmentMenu() throws Exception 
	{
		boolean flag=false;
		
		while(!flag) 
	{
		DepartmentMenu dm= new DepartmentMenu();
		System.out.println("학과 정보 메뉴 번호를 입력하세요");
		System.out.println("1. 학과 정보 목록");
		System.out.println("2. 학과 정보 입력");
		System.out.println("3. 학과 정보 수정");
		System.out.println("4. 학과 정보 삭제");
		System.out.println("5  메인 메뉴");
		System.out.println("번호 선택:");
		int menu =sc.nextInt();
			switch(menu) 
			{
			case 1://학과 정보 목록 
				dm.showStudyList();
				break;
			case 2://학과 정보 입력
				Department department =dm.inputDepartment();
			dm.insertDepartment(department);
				break;
			case 3://학과 정보 수정
				dm.updateDepartment();
				break;
			case 4://학과 정보 삭제
				dm.deleteDepartment();
				break;
			case 5://메인 메뉴
				startProject();
				flag=true;
				break;
			}
		 }

	}
	public static void showLessonMenu() throws Exception 
	{
		boolean flag=false;
		while(!flag) 
		{
			System.out.println("과목 정보 메뉴 번호를 입력하세요");
			System.out.println("1. 과목 정보 목록");
			System.out.println("2. 과목 정보 입력");
			System.out.println("3. 과목 정보 수정");
			System.out.println("4. 과목 정보 삭제");
			System.out.println("5  메인 메뉴");
			System.out.println("번호 선택:");
			int menu =sc.nextInt();
			
			switch(menu) 
			{
			case 1: //과목 정보 목록
				LessonMenu.showLessonList();
				break;
			case 2: //과목 정보 입력
				Lesson lesson = LessonMenu.inputLesson();
				LessonMenu.insertLesson(lesson);
				break;
			case 3://과목 정보 수정
				LessonMenu.updateLesson();
				break;
			case 4://과목 정보 삭제
				LessonMenu.deleteLesson();
				break;
			case 5://메인 메뉴
				startProject();
				flag=true;
				break;
			}
		 }

	}
	public static int showmenu() 
	{
		System.out.println("과목 정보 메뉴 번호를 입력하세요.");
		System.out.println("1. 학과 정보 목록/입력/수정/삭제");
		System.out.println("2. 학생 정보 입력/수정/목록");
		System.out.println("3. 과목 정보 수정/입력/수정/삭제");
		System.out.println("4  수강 신청 목록/신청/취소");
		System.out.println("5  프로그램 종료");
		System.out.println("번호 선택:");
		int menu =sc.nextInt();
		return menu;
	}
	



	

	
}
