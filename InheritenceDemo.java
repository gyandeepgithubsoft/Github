package doubtProgrames;

class fk_men1{
	public void login() {
		System.out.println("logIn()");
	}
	public void clothes() {
		System.out.println("CLOTHES()");
	}
	public void logout() {
		System.out.println("logout()");

	}
}
class fk_women1 extends fk_men1
{
public void jewellery() {
	System.out.println("JEWELLERY");
}
}


public class InheritenceDemo {
	public static void main(String[] args) {
		fk_men1 fk_men1 = new fk_men1();
		fk_men1.login();
		fk_men1.clothes();
		fk_men1.logout();
	
	}

}
