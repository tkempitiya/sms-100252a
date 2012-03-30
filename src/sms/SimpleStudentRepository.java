package sms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SimpleStudentRepository implements StudentRepository {

	private Map<Long, Student> studentsDb = new HashMap<Long, Student>();

	@Override
	public void saveStudent(Student stu) {
		// TODO Auto-generated method stub
            studentsDb.put(stu.getRegNumber(), stu);

	}

	@Override
	public void deleteStudent(Student stu) {
		// TODO Auto-generated method stub
            if(studentsDb.containsValue(stu))
            studentsDb.remove(stu.getRegNumber());
            else

                System.out.println("error");


	}

	@Override
	public Student findStudent(long regNumber) {
		// TODO Auto-generated method stub

		return  studentsDb.get(regNumber);
	}

	@Override
	public void updateStudent(Student stu) {
		// TODO Auto-generated method stub
            studentsDb.remove(stu.getRegNumber());
            studentsDb.put(stu.getRegNumber(), stu);


	}

	@Override
	public List<Student> findAllStudents() {
		// TODO Auto-generated method stub
                ArrayList aList =new ArrayList();
                aList.addAll(studentsDb.values());
		return aList;
	}

}
