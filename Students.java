package Assigment3;

public class Students {

	public String getstudentinfo(int id,int phonenumber){
		return "23100,9310292" ;
		
	}
	public String getstudentinfo(String name){
		return name;
		
	}
	public String getstudentinfo(int id ,String Email){
		return "23100,vishwakala@gmail.com";
		
	}
	
	public static void main(String[]args) {
		Students stu =new Students();
	String a=	stu.getstudentinfo(89,98987897);
		String b= stu.getstudentinfo("Vishwakala");
		
		String c=stu.getstudentinfo(012, "email");
		System.out.println("Id,phonenumber ="+a);
		System.out.println("name  ="+b);
		System.out.println("id,email ="+c);
		
	}
	
	
}
