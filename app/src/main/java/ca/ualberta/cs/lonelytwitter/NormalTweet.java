package ca.ualberta.cs.lonelytwitter;

public class NormalTweet extends Tweet {
    @Override
    public boolean isImportant(){
        return false;
    }
}
