/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imagemanagement3;

import java.util.ArrayList;

/**
 *
 * @author arsoh
 */
public class Image extends ImageManagement3 {
    private String name;
    private ArrayList<Application> apps;
    private ArrayList<Double> extraData;
    
    public Image(){
        name = ""; //the name won't be null, just empty
        
        apps = new ArrayList<>();
        extraData = new ArrayList<>();
    }
    
    @Override
    public String toString(){
        String tmp = name;
        tmp = tmp + ": " + apps;
        return tmp;
    }
    
    public void removeAllAppilcation(){
        apps.clear();
        extraData.clear();
    }
    
    public void addApplication(Application a, double d){
        apps.add(a);
        extraData.add(d);
    }
    
    public void removeApplication(int index){
        apps.remove(index);
        extraData.remove(index);
    }
    
    public void removeApplication(Application a){
        int index = apps.indexOf(a);
        removeApplication(index);
    }
    
    public void setApplicationData(int index, double d){
        extraData.set(index, d);
    }
    
    public void setApplicationData(Application a, double d){
        int index = apps.indexOf(a);
        setApplicationData(index, d);
    }
    
    public int getNumberOfApplications(){
        return apps.size();
    }
    
    public Application getApplication(int index){
        return apps.get(index);
    }
    
    public double getApplicationExtraData(int index){
        return extraData.get(index);
    }
    
    public double getApplicationExtraData(Application a){
        int index = apps.indexOf(a);
        return getApplicationExtraData(index);
    }
    
    public int indexOf(Application a){
        return apps.indexOf(a);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
