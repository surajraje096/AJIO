package config;

import base.TestBase;

public class XPath extends TestBase {

	public static final String url = "https://www.ajio.com/";
	public static final String browser = "chrome";

	// AJIO search page
	
	public static final String signbtn = "//*[text()=\"Sign In / Join AJIO\"]";
	public static final String searchAJIO = "//*[@id=\"appContainer\"]/div[1]/div/header/div[3]/div[2]/form/div/div/input";
	public static final String logo = "//*[@id=\"appContainer\"]/div[1]/div/header/div[2]";
	
	// Ajio Menu
	
	public static final String MEN = "//*[text()=\"MEN\"]";
	public static final String WOMEN = "//*[text()=\"WOMEN\"]";
	public static final String KIDS = "//*[text()=\"KIDS\"]";
	public static final String INDIE = "//*[text()=\"INDIE\"]";
	public static final String HOME_AND_KITCHEN = "//*[text()=\"HOME AND KITCHEN\"]";
	
	//Product
	
	public static final String MENjaket = "//*[text()=\"Jackets & Coats\"][1]";
	public static final String WOMENpro = "//*[@class=\"slick-slide slick-active\"]";
	public static final String KIDSpro = "//*[@class=\"LazyLoad is-visible gtm-bnr-comp-evt-enbld\"]";
	public static final String INDIEpro = "//*[@class=\"LazyLoad is-visible gtm-bnr-comp-evt-enbld\"]";
	public static final String HOME_AND_KITCHENpro = "class=\"item rilrtl-products-list__item item\"";
	
	

}
