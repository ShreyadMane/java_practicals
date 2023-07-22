import java.awt.*;  
import java.applet.*;  
  
  
public class Displayimage extends Applet {  
  
  Image picture;  
  
  public void init() {  
    picture = getImage(getDocumentBase(),"sonoo.jpg");  
  }  
    
  public void paint(Graphics g) {  
    g.drawImage(picture, 30,30, this);  
  }  
      
  }  
  /* 
<applet code="Displayimage.class" width="300" height="300"> 
</applet> 
*/  