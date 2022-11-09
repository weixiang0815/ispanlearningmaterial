package ch06.lab01.solution;

public class Cat { 
	double weight;
	int iq;
	public void eat(int foodWeight) { 
		weight += foodWeight * 0.2;
	}
	public void study(int hours) {
		iq = iq + hours;
	}
	public void displayInformation() {
		System.out.println("IQ=" + iq);
		System.out.println("體重:" + weight);
	}
  public double getWeight()
  {
    return weight;
  }
  public void setWeight(double weight)
  {
    this.weight = weight;
  }
  public int getIQ()
  {
    return iq;
  }
  public void setIQ(int iQ)
  {
    iq = iQ;
  }
	
}
