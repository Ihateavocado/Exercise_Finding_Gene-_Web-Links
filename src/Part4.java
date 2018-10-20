import edu.duke.*;
import java.io.File;

public class Part4 {
        URLResource ur = new URLResource("http://www.dukelearntoprogram.com/course2/data/manylinks.html");
        void checkYoutubeURL(){
            for (String s : ur.lines()) {
                int pos = s.indexOf("youtube.com");
                if(pos != -1){
                    int beg = s.lastIndexOf("\"",pos);
                    int end = s.indexOf("\"", pos+1);
                    System.out.println(s.substring(beg+1,end));
                    System.out.println(s);
                }
            }
        }
    }
