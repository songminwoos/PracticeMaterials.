package p04.restricted_generic;

import java.util.Arrays;

// Generic Wild card type인 ?
// 1. <?>
//    => 모든 class type이 허용
// 2. <? extends Student>
//    => 최상위 부모인 Student와 자식을 포함한 후손 class들만 허용 
// 3. <? super Worker>
//    => Worker class와 Worker class의 부모와 조상 class들만 허용 

public class RestrictedGenericEx {

	public static void main(String[] args) {
		Course<Person> personCourse = new Course("일반인과정", 5);
		personCourse.add(new Person("일반인"));
		personCourse.add(new Worker("직장인"));
		personCourse.add(new Student("학생"));
		personCourse.add(new HighStudent("고등학생"));
		
		Course<Worker> WorkerCourse = new Course("직장인과정", 5);
//		WorkerCourse.add(new Person("일반인"));
		WorkerCourse.add(new Worker("직장인"));
//		WorkerCourse.add(new Student("학생"));
//		WorkerCourse.add(new HighStudent("고등학생"));
		
		Course<Student> StudentCourse = new Course("학생과정", 5);
		//StudentCourse.add(new Person("일반인"));
		//StudentCourse.add(new Worker("직장인"));
		StudentCourse.add(new Student("학생"));
		StudentCourse.add(new HighStudent("고등학생"));
		
		Course<HighStudent> HighStudentCourse = new Course("고등학생과정", 5);
//		HighStudent.add(new Person("일반인"));
//		HighStudent.add(new Worker("직장인"));
//		HighStudent.add(new Student("학생"));
		personCourse.add(new HighStudent("고등학생"));
		
		registerCourse(personCourse);
		registerCourse(WorkerCourse);
		registerCourse(StudentCourse);
		registerCourse(HighStudentCourse);
		
//		registerCourseStudent(personCourse);
//		registerCourseStudent(WorkerCourse);
		registerCourseStudent(StudentCourse);
		registerCourseStudent(HighStudentCourse);
		
		registerCourseWorker(personCourse);
		registerCourseWorker(WorkerCourse);
//		registerCourseWorker(StudentCourse);
//		registerCourseWorker(HighStudentCourse);
		
	}

	public static void registerCourse(Course<?> course) {
		System.out.println(course.getName() + " 수강생:" 
			        + Arrays.toString(course.getStudents()));
	}

	public static void registerCourseStudent(Course<? extends Student> course) {
		System.out.println(course.getName() + " 수강생:" 
					+ Arrays.toString(course.getStudents()));
	}

	public static void registerCourseWorker(Course<? super Worker> course) {
		System.out.println(course.getName() + " 수강생:" 
					+ Arrays.toString(course.getStudents()));
	}
}
