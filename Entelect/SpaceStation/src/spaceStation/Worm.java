package spaceStation;

public abstract class Worm {

	protected int motivationLevel;
    protected boolean needForWeekend;
    protected boolean isEmployed;
    protected String speciality;
    
    abstract void setMotivation(int level);
    protected int getMotivation() {
    	return motivationLevel;
    }
    protected boolean getStatus() {
    	return isEmployed;
    }
    protected void setStatus(boolean b) {
    	isEmployed=b;
    }
      
}
