package spaceStation;

public class spacePlumber extends Worm{

	public spacePlumber() {
		// TODO Auto-generated constructor stub
		speciality="S";
		motivationLevel=15;
	}

	@Override
	void setMotivation(int level) {
		// TODO Auto-generated method stub
		motivationLevel=level;
	}

}
