package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public abstract class CurrentMood{
    protected String type;
    protected String intensity;
    protected Date date;

    public CurrentMood(String type, String intensity){
        this.type= type;
        this.intensity = intensity;
    }

    public void setType(String type){
        this.type = type;
    }
    public void setIntensity(String intensity){
        this.intensity = intensity;
    }
    public String getType(){
        return this.type;
    }
    public String getIntensity(){
        return this.intensity;
    }
    public void setDate(Date date){
        this.date= date;
    }
    public Date getDate(){
        return this.date;
    }
    public abstract void Mood();
}
