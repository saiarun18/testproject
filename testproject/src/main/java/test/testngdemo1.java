package test;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import net.sourceforge.htmlunit.corejs.javascript.tools.debugger.Main;
import sourcemethods.SeMethods;

public class testngdemo1 extends SeMethods{
	

	@Test
public void browserlaunch()
{
		startApp("chrome", "https://www.google.co.in/");
		
}
	 
	
	
	}
