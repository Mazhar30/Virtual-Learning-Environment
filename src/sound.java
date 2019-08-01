
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.swing.JOptionPane;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
        
  public class sound{
  
       sound(String nm){
   
    AudioStream BGM ;

try {
      InputStream test = new FileInputStream(nm);
         BGM = new AudioStream(test);
          AudioPlayer.player.start(BGM);
       
         }  

           catch(IOException error){

         JOptionPane.showMessageDialog(null,error.getMessage()); 
 }
           
  }
  }
// new sound("./guyg.wav");