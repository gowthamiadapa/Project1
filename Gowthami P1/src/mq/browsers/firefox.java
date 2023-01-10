package mq.browsers;

    public class firefox
 {
    public void setup_browser() 
	{
		System.out.println("browser is opened");
	}
    public void visite_site()
    {
    	System.out.println("site is opened");
	}
    public void capture_screen()
    {
    	System.out.println("screen is captured");
    }
    public void close_browser()
    {
    	System.out.println("screen is closed");
	}
    public void screen1 ()
    {
    	
		setup_browser();
		visite_site();
		capture_screen();
	}
    public static void main(String[] args)
    {
		new firefox().setup_browser(); 
		new firefox().visite_site();
		new firefox().capture_screen();
		new firefox().close_browser();
		new firefox().screen1();
	}
    
 }
