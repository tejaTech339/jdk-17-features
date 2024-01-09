package features_17;

public class TestTeja {

	public static void main(String[] args) {
		
		TejaImmutableClass t=new TejaImmutableClass();
		
		String name = t.getName();
		System.out.println("Name :"+name);
		
		String gender = t.getGender();
		System.out.println("Gender :"+gender);
		
		int age = t.getAge();
		System.out.println("Age is:"+age);
		
		String martialStatus = t.getMartialStatus();
		System.out.println("Martial Status :"+martialStatus);
		
		long mobile = t.getMobile();
		System.out.println("Mobile Number :"+mobile);
		
		System.out.println("========================");
		System.out.println("Person ["+t.getName()+"-"+t.getGender()+"-"+t.getAge()+"-"+t.getMartialStatus()+"-"+t.getMobile()+"]");
		
	}
}
