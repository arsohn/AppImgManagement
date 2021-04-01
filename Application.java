package imagemanagement3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author arsoh
 */
public class Application extends ImageManagement3
{
     private String name;
    private double basicSize; //assune it is in MB
    private double cpuCores;
    private double memorySize; //in MB
    
     public Application(){
        name = ""; //make the name not null, just empty
    }
    
    //made this constructor for the application adding button
    public Application(String appName, double codeSize, double cpuNum, double memory){
        name = appName; 
        basicSize = codeSize;
        cpuCores = cpuNum;
        memorySize = memory;
    }
    
    @Override
    public String toString(){
        String tmp = name;
        tmp = tmp + " [" + basicSize + "MB";
        tmp = tmp + ", " + cpuCores + ", " + memorySize + "MB]";
        return tmp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBasicSize() {
        return basicSize;
    }

    public void setBasicSize(double basicSize) {
        this.basicSize = basicSize;
    }

    public double getCpuCores() {
        return cpuCores;
    }

    public void setCpuCores(int cpuCores) {
        this.cpuCores = cpuCores;
    }

    public double getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(int memorySize) {
        this.memorySize = memorySize;
    }
}
