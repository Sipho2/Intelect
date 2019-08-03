package spaceStation;

public class Task {
	private int NoOfTasks;
	private char type;
	private boolean isComplete;
	public Task(char t) {
		// TODO Auto-generated constructor stub
		isComplete=false;
		type=t;
	}
	void setNoOfTasks(int v) {
		NoOfTasks=v;
	}
	
}
