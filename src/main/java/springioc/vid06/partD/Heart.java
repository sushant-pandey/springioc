package springioc.vid06.partD;

public class Heart {
	private int numOfHearts;
	private String nameOfAnimal;

	public void setNumOfHearts(int numOfHearts) {
		this.numOfHearts = numOfHearts;
	}

	public void setNameOfAnimal(String nameOfAnimal) {
		this.nameOfAnimal = nameOfAnimal;
	}

	@Override
	public String toString() {
		return "Heart [numOfHearts=" + numOfHearts + ", " + "nameOfAnimal=" + nameOfAnimal + "]";
	}

}
