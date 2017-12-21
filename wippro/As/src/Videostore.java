
public class Videostore {
int i;
Video o[]=new Video[10];
public void Videostore()
{	
	for(i=0;i<10;i++)
	{
		o[i]=new Video();
	}
	
}
public void addVideo(String title)
{
	for(i=0;i<10;i++)
	{
		if(o[i].getTitle()==null)
		{
			o[i].setTitle(title);
			o[i].setFlag(true);
			break;
		}
	}
}
public void checkOut(String title)
{
	for(i=0;i<o.length;i++)
	{
		if(o[i].getTitle().equals(title))
		{
			o[i].setFlag(false);;
			System.out.println("The video:"+o[i].getTitle()+" is Checked out");
			break;
		}
	}
}
public void returnVideo(String title)
{
	for(i=0;i<o.length;i++)
	{
		if(o[i].getTitle().equals(title))
		{
			o[i].setFlag(false);
			System.out.println("The video:"+o[i].getTitle()+" is returned");
			break;
		}
	}
}
public void receiveRating(String title,double rating)
{
	for(i=0;i<o.length;i++)
	{
		if(o[i].getTitle().equals(title))
		{
			if(o[i].isFlag())
				o[i].setAvgRat(rating);
			else
				o[i].setAvgRat((o[i].getAvgRat()+rating)/2);
			System.out.println("Your rating for the video:"+o[i].getTitle()+" has been recorded");
			break;
		}
	}
}
public void listInventory()
{
	for(i=0;o[i].getTitle()!=null;i++)
	{
		System.out.println("Title:"+o[i].getTitle()+"\tAvailability:"+o[i].isIsavailable()+"\tRating:"+o[i].getAvgRat());
	}
}

}
