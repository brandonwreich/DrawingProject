package art.controller;

import art.view.ArtFrame;

public class ArtController
{
	private ArtFrame appFrame;

	public ArtController()
	{
		appFrame = new ArtFrame(this);
	}

	public void start()
	{

	}
	
	public void handleErrors(Exception error)
	{
		System.out.println(error);
	}
	
	public ArtFrame getFrame()
	{
		return appFrame;
	}
}