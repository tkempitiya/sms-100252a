package sms;

import java.util.Iterator;
import java.util.List;

public class StudentManagementSystem {

	private StudentRepository repo=new SimpleStudentRepository();

	public void listAllStudents() {
		//Get all the students from repository and print them in the screen
           List list= repo.findAllStudents();
           Iterator itr=list.iterator();
           while(itr.hasNext()){
               Student stu =(Student)itr.next();
               System.out.println("name :"+stu.getFirstName()+" "+stu.getLastName()+" Address :"+stu.getAddress()+" RegNO :"+stu.getRegNumber());

            }
	}

	public void registerStudent(Student stu){
		//Save the new student using repository
            repo.saveStudent(stu);
	}
}
