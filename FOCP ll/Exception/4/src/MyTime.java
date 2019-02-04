class MyTime
{
	int hour;
	int minutes;
	int seconds;

	MyTime()
	{
		this.hour=hour;
		this.minute=minute;
		this.second=second;
	}

	MyTime(int hour, int minute, int second)
	{
		this.hour=hour;
		this.minute=minute;
		this.second=second;
	}
	public void settime(int hour, int minute, int second)
	{
	    this.hour=hour;
		this.minute=minute;
		this.second=second;	
	}
	public int gethour()
	{
         return this.hour;
	}
	public int getminute()
	{
         return this.minute;
	}public int getsecond()
	{
         return this.second;
	}
	public void sethour(int hour)
	{
		this.hour=hour;
	}
	public void setminute(int hour)
	{
		this.minute=minute;
	}public void setsecond(int hour)
	{
		this.second=second;
	}

	public String toString()
	{
		String strtime;
		strtime=this.hour+":"
		        this.minute+":"
		        this.second;
		return strtime;
	}

}