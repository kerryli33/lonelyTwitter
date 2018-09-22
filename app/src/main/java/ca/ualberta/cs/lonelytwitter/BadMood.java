package ca.ualberta.cs.lonelytwitter;

import android.util.Log;

public class BadMood extends CurrentMood {
    public BadMood(String type, String intensity){
        super(type,intensity);
    }
    public String emo = super.getType();
    public void Mood(){
        Log.d("swag",String.format("I am feeling %s! ", emo));
    }
}
