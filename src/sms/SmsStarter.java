package sms;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SmsStarter {

	public static void main(String[] args) {
		StudentManagementSystem sms = null;
		//load the bean from spring

                ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("bean.xml");
		Student stu = (Student) appContext.getBean("stu");
                sms=(StudentManagementSystem) appContext.getBean("sms");
               // System.out.println(stu.getFirstName());
               sms.registerStudent(stu);
                sms.listAllStudents();
		sms.registerStudent(stu);
		sms.listAllStudents();
	}
}
