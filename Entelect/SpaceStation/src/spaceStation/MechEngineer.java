package spaceStation;

public class MechEngineer extends Worm {

	public MechEngineer() {
		// TODO Auto-generated constructor stub
		speciality="M";
		motivationLevel=15;
	}

	@Override
	void setMotivation(int level) {
		// TODO Auto-generated method stub	
		motivationLevel=level;
	}

}
