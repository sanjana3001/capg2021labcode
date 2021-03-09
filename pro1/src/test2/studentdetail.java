package test2;

public class studentdetail {

	public static void main(String[] args) {
		student obj=new student();
		
		obj.details("pooja",201,21,"bmsit","ece");
		obj.camerastatus("on");
		obj.micstatus("off");
		obj.chatstatus("off");
		obj.display();

	}

}
