package Students;

public class Chain
{
	Processor chain;
	
	public Chain(){
		buildChain();
	}

	private void buildChain(){
		chain = new Admins_login(new Staffs_login(new Students_login(null)));
	}

	public void process(Login request) {
		chain.process(request);
	}
}

abstract class Processor
{
	private Processor nextProcessor;

	public Processor(Processor nextProcessor){
		this.nextProcessor = nextProcessor;
	};
	
	public void process(Login request){
		if(nextProcessor != null)
			nextProcessor.process(request);
	};
}

class Login
{
	private String password;

	public Login(String password)
	{
		this.password = password;
	}

	public String getLoginID()
	{
		return password;
	}

}

class Admins_login extends Processor
{
	public Admins_login(Processor nextProcessor){
		super(nextProcessor);
		
	}

	public void process(Login request)
	{
		if (request.getLoginID() == "admin1")
		{
			System.out.println("Admin_login : " + request.getLoginID());
		}
		else
		{
			super.process(request);
		}
	}
}

class Staffs_login extends Processor
{
	public Staffs_login(Processor nextProcessor){
		super(nextProcessor);
	}

	public void process(Login request)
	{
		if (request.getLoginID() == "staff1")
		{
			System.out.println("Staff_login : " + request.getLoginID());
		}
		else
		{
			super.process(request);
		}
	}
}

class Students_login extends Processor
{

	public Students_login(Processor nextProcessor){
		super(nextProcessor);
	}

	public void process(Login request)
	{
		if (request.getLoginID() == "50")
		{
			System.out.println("Student_login : " + request.getLoginID());
		}
		else
		{
			super.process(request);
		}
	}
}

class Chain_of_rep
{
	public static void main(String[] args) {
		Chain chain = new Chain();
		
		//Calling chain of responsibility
		chain.process(new Login("staff1"));
		chain.process(new Login("admin1"));
		chain.process(new Login("50"));
		chain.process(new Login("admin2"));
	}
}
