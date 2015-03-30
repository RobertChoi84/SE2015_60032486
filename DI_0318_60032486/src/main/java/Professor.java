
public class Professor {
	private String name;
	private Lecture lecture;
	
	public Professor(){
		
	}
	public Professor(String name){
		this.name = name;
	}

	public String getProfessorName() {
		return name;
	}

	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}	
	
	public void addLecture(Lecture lecture) {
		// TODO Auto-generated method stub
		this.lecture = lecture;		
	}
	
	public void showLecture() {
		System.out.println(lecture.getName());	
	}
	

}
