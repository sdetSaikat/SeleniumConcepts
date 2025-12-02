package seleniumConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsConcepts {

    public static void main(String[] args) {
    WebDriver driver = new ChromeDriver();
driver.get("https://www.cricbuzz.com/");
By imglocator = By.tagName("img");
List<WebElement> imgele = driver.findElements(imglocator);
int elelistsize = imgele.size();
System.out.println("Total number of image available:-"+imgele.size());
System.out.println("******************************");

String[] arr = {"Cricbuzz Logo","Guyana Amazon Warriors","Antigua and Barbuda Falcons",
        "Northern Superchargers","Oval Invincibles","Northern Superchargers Women",
        "Oval Invincibles Women","London Spirit","Southern Brave","Australia","South Africa",
        "Saint Lucia Kings","Trinbago Knight Riders","RCB's IPL reckoning: Part 2 - The dream realised",
        "Shubman Gill may skip Duleep Trophy","India cleared for Asia Cup participation, "
                + "but no bilateral cricket with Pakistan",
                "Split board at USA Cricket cuts ties with ACE; World Cup preparations at risk",
                "White-ball success for Conrad, but there's batting work to do",
          "Women's World Cup 2025: Navi Mumbai replaces Bengaluru as host",
                  "The Shreyas Iyer selection conundrum","Selectors favour continuity over IPL form",
                  "India pin faith on settled core for home World Cup","Maharaj a man for all seasons, "
                          + "and formats","Knight returns to England squad for World Cup",
                          "To get out of the West Indies series unscathed was a good effort - Green",
                          "Pujara available for Ranji season; Rahane quits Mumbai captaincy",
                          "England to tour Sri Lanka ahead of T20 World Cup 2026","CSK clarify Dewald Brevis signing after Ashwin remarks","Babar Azam, Mohammad Rizwan left out of Asia Cup squad","Phoenix eliminated as Fire bring up first win","Patidar as RCB captain: The Midas touch of Kohli & Bobat","Why Shreyas Iyer missed out on Asia Cup 2025? Agarkar explains",
          "India make BIG calls! Gill IN, Iyer OUT","Cricbuzz Logo"};
List<String> asList2 = Arrays.asList(arr);


        
List<String> acturalimgTiltleList = new ArrayList<String>(asList2);
    for(int i=0;i<elelistsize;i++) {
        
        String imgtitle = imgele.get(i).getDomAttribute("title");
        if(imgtitle!=null) {
            acturalimgTiltleList.add(imgtitle);
        }
    }
    System.out.println(acturalimgTiltleList);
    if(asList2.contains("Guyana Amazon Warriors")) {
    	System.out.println("pass");
    }
    else {
    	System.out.println("False");
    }
        

    }

}
