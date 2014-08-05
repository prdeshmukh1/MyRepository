package persistent.wordpressautomation;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class Page {
	
	public static Logger log = Logger.getLogger(PageObject_TC.class);
	
	public Page()
	{
		DOMConfigurator.configureAndWatch("log4j.xml");
	}

}
