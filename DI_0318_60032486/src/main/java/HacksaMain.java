import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class HacksaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Professor professor = new Professor("choi");
		//Lecture lecturel = new Lecture("소프트웨어 공학");
		
		ApplicationContext factory = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
		Professor professor = (Professor)factory.getBean("professor");
		Lecture lecture2 = (Lecture)factory.getBean("lecture");
		professor.addLecture(lecture2);
		professor.showLecture();
		
		Student student = (Student)factory.getBean("student");
		
		
		
	}

}
