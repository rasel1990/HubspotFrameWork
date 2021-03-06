package com.qa.hubspot.base;

import java.util.Hashtable;
import java.util.Map;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.opera.OperaOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariOptions;

public class OptionsManager {
	public ChromeOptions co;
	public FirefoxOptions fo;
	public SafariOptions so;
	public InternetExplorerOptions io;
	public OperaOptions oo;
	
	public Properties prop;

	public OptionsManager(Properties prop) {
		this.prop = prop;
	}

	public ChromeOptions getChromeOptions() {
		co = new ChromeOptions();
		if (prop.getProperty("incognito").equals("yes")) co.addArguments("--incognito");
		if (prop.getProperty("headless").equals("yes")) co.addArguments("--headless");

		return co;
	}
	
	public FirefoxOptions getFirefoxOptions() {
		fo = new FirefoxOptions();
		if (prop.getProperty("headless").equals("yes")) fo.addArguments("--headless");
		return fo;
	}
	
	
	public SafariOptions getSafariOptions() {
		so = new SafariOptions();
		if (prop.getProperty("headless").equals("yes")) fo.addArguments("--headless");
		return so;
	}
	
	
	
	public InternetExplorerOptions getInternetExplorerOptions() {
		io = new InternetExplorerOptions();
		if (prop.getProperty("headless").equals("yes")) fo.addArguments("--headless");
		return io;
	}
	
	public OperaOptions getOperaOptions() {
		oo = new OperaOptions();
		if (prop.getProperty("headless").equals("yes")) fo.addArguments("--headless");
		return oo;
	}
	

}
