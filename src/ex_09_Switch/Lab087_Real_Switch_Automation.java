package ex_09_Switch;

import java.util.Scanner;

public class Lab087_Real_Switch_Automation
{
    public static void main(String[] args)
    {
        // Web Automation
        // I will ask the user to give me the input from browser which he wants to
        // use to I will start the automation in that browser.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Browser");
        String browser = scanner.next();
        browser = browser.toLowerCase(); // lower(Chrome, CHROME, CHrome) == chrome
        switch (browser)
        {
            case "chrome":
                System.out.println("Starting Chrome");
                break;
            case "firefox":
                System.out.println("Starting Firefox");
                break;
            case "edge":
                System.out.println("Starting Edge");
                break;
            default:
                System.out.println("Browser not identified");
                break;
        }
    }
}
