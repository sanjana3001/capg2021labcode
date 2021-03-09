package test2;

public class student {

	private String name;
	private int age;
	private int id;
	private String college;
	private String branch;
	private String camera;
	private String mic;
	private String chat;
	
	public void details(String sname, int iid, int aage, String ccollege, String bbranch)
	{
		name=sname;
		id=iid;
		age=aage;
		college=ccollege;
		branch=bbranch;
	}
	
	public void camerastatus(String status)
	{
		camera=status;
	}
	public void micstatus(String mstatus)	
	{
		mic=mstatus;
	}
	public void chatstatus(String cstatus)
	{
		chat=cstatus;
	}
	public void display()
	{
		System.out.println(" name:" + name);
		System.out.println(" id:" + id);
		System.out.println(" age:" + age);
		System.out.println(" college:" + college);
		System.out.println(" branch:" + branch);
		System.out.println(" camera:" + camera);
		System.out.println(" mic:" + mic);
		System.out.println(" chat:" + chat);
		
		
	}

	}


