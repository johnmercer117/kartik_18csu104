class testcustomexception{
	static void validate(int age)throws Invalidageexception{
	if(age<18)
	throw new Invalidageexception("not valid");
	else
	System.out.println("welcome to vote");
	}

	public static void main(String [] args){
	try{
	validate(13);

	}
	catch(Exception m){System.out.println("Exception occured:"+m);}
	System.out.println("Rest of the code...");
	}
}