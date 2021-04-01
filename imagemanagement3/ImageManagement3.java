/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imagemanagement3;

import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author arsoh
 */
public class ImageManagement3 {
    
    public static ArrayList<Application> allApplications = new ArrayList<>();
    public static ArrayList<Image> allImages = new ArrayList<>();
    
    public static App_Img_Panel appPanel;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Image x, y;
        Application a1, a2, a3, b1, b2, b3;
        
        a1 = new Application();
        a1.setName("Chrome");
        a1.setBasicSize(12.1);
        a1.setCpuCores(1);
        a1.setMemorySize(230);
        
        allApplications.add(a1);
        
        a2 = new Application();
        a2.setName("Photoshp");
        a2.setBasicSize(230);
        a2.setCpuCores(3);
        a2.setMemorySize(1300);
        
        allApplications.add(a2);
        
        a3 = new Application();
        a3.setName("Discord");
        a3.setBasicSize(150);
        a3.setCpuCores(1);
        a3.setMemorySize(500);
        
        allApplications.add(a3);
        
        // IMAGE 1
        x = new Image();
        x.setName("Marketing Desktops");
        x.addApplication(a1, 0); //nothing extra for chrome
        x.addApplication(a2, 51); //requires 51 gb in addition to 230 basic size
        x.addApplication(a3, 10);
        
        allImages.add(x);
        
        x = new Image(); //now x points to a different image object
        x.setName("Kiosk Lobby");
        x.addApplication(a1, 11);
        
        allImages.add(x); // add kiosk lobby to my respository
        
        
        
//        System.out.println("Printing image for " + x.getName() + " ----------");
        //print all the applications one at a time
//        for(int i = 0; i < x.getNumberOfApplications(); i++){
//            //find application at position i
//            Application a;
//            a = x.getApplication(i);
//            
//            //print information about that app
//            System.out.println("\t" + a.getName() + ": basic size " + a.getBasicSize() +
//                    ", cores " + a.getCpuCores() + ", memory " + a.getMemorySize());
//            
//            //get extraData
//            System.out.println("\t\tExrta Data on this image: " + x.getApplicationExtraData(a));
//        }
        // END IMAGE 1 AND 3 APPLICATIONS
        
        // START IMAGE 2 AND 3 APPLICATIONS
        
        b1 = new Application();
        b1.setName("Steam");
        b1.setBasicSize(100);
        b1.setCpuCores(1);
        b1.setMemorySize(600);
        
        allApplications.add(b1);
        
        b2 = new Application();
        b2.setName("Minecraft");
        b2.setBasicSize(300);
        b2.setCpuCores(3);
        b2.setMemorySize(2000);
        
        allApplications.add(b2);
        
        b3 = new Application();
        b3.setName("League of Legends");
        b3.setBasicSize(350);
        b3.setCpuCores(5);
        b3.setMemorySize(4000);
        
        allApplications.add(b3);
        
        //IMAGE 2
        y = new Image();
        y.setName("Gaming");
        y.addApplication(b1, 0); 
        y.addApplication(b2, 30); 
        y.addApplication(b3, 40);
        
        allImages.add(y);
        
//        System.out.println("Printing image for " + y.getName() + " ----------");
//        
//        for(int i = 0; i < y.getNumberOfApplications(); i++){
//            //find application at position i
//            Application b;
//            b = y.getApplication(i);
//            
//            //print information about that app
//            System.out.println("\t" + b.getName() + ": basic size " + b.getBasicSize() +
//                    ", cores " + b.getCpuCores() + ", memory " + b.getMemorySize());
//            
//            //get extraData
//            System.out.println("\t\tExrta Data on this image: " + y.getApplicationExtraData(b));
//        }
//        
//     System.out.println("-------------------");
     
        JFrame f = new JFrame("Manage Applications and Images");
        f.setSize(1000, 600);
        f.setLocation(800, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        appPanel = new App_Img_Panel(); //note that it is a "global" variable to allow other parts of the code to find this panel
        
        f.add(appPanel);
        f.setVisible(true);
        
        
        
    }
    
}
