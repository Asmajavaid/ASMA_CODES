package Static_nonstatichomeworknnov6;

public class Sdlc {

	public static void main(String[] args) {

		Sdlc.design();
		Sdlc.planning();
		Sdlc.requirments();
		Sdlc.coding();

		Sdlc Test1 = new Sdlc();
		Sdlc Test2 = new Sdlc();
		Test1.deployment();
		Test1.maintences();
		Test1.product();
		Test2.diffrenttest();
		
	}

	public static void Sdlc() {
		System.out.println("sdlc:software development life cycle");

	}

	public static void design() {
		System.out.println("design:custumers demmand");

	}

	public static void planning() {
		System.out.println("planning:concept");
	}

	public static void requirments() {
		System.out.println("requirment:busniss needs");

	}

	public static void coding() {
		System.out.println("coding:cycles of testing");
	}

	public void deployment() {
		System.out.println("deployment:the process of coding ");
	}

	public void maintences() {
		System.out.println("maintences:team ready to solve any problem");
	}

	public void product() {
		System.out.println("product:the original foam of idea");

	}

	public void diffrenttest() {
		System.out.println("diffenttest:types of checking the perfarmce");
	}
}
