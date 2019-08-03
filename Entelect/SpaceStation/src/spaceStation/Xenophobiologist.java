package spaceStation;

public class Xenophobiologist extends Worm {

	public Xenophobiologist() {
		// TODO Auto-generated constructor stub
		speciality="X";
		motivationLevel=15;
	}

	@Override
	void setMotivation(int level) {
		// TODO Auto-generated method stub
		motivationLevel=level;
	}

}
