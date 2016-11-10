package hipster.controller;

import hipster.model.Hipster;

public class HipsterController
{
	private String [] words; {"this","is","the","next","level","of","hipster","the", "initialization","sequence"};
	private Hipster [] hipsters;
	private int [] numbers;
	private HipsterFrame appFrame;

	public HipsterController()
	{
		showHipsterLevelThree();
		appFrame = new HipsterFrame(this);
		hipsters = new Hipster [5];
	}
	public void start()

	{
		for(int index = 0; index < hipster.length; index++)
		{
			Hipster[index] = new Hipster("Hipster #" + index);
		}
		
		for(Hipster current : Hipster)
		{
			System.out.println(current);
		}
	}

	private void showHipsterLevelThree()
	{
		numbers = new int [] {1,2,3,4,5,6,7,8,9,0,9,8,7,6,5,4,3,2,1};
	}
	public Hipster[] getHipster()
	{
		return hipster;
	}
	public String[] getWords()
	{
		return words;
	}
}


