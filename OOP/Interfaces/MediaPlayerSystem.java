package Interfaces;

interface Playable {
void play();
void pause();
}

class MP3Player implements Playable{
    @Override
    public void play(){
        System.out.println("mp3 is playing");
    }
    @Override 
    public void pause(){
        System.out.println("mp3 is paused");
    }
}
class VideoPlayer implements Playable{
    @Override
    public void play(){
        System.out.println("VideoPlayer is playing");
    }
    @Override 
    public void pause(){
        System.out.println("VideoPlayer is paused");
    }
}
class RadioPlayer implements Playable{
    @Override
    public void play(){
        System.out.println("RadioPlayer is playing");
    }
    @Override 
    public void pause(){
        System.out.println("RadioPlayer is paused");
    }
}
public class MediaPlayerSystem {
 public static void main(String[] args) {
    Playable[] music ={
        new MP3Player(),
        new VideoPlayer(),
        new RadioPlayer()
    };

    for(Playable p : music){
        p.play();
        p.pause();
        System.out.println("------------------");
    }
 }   
}
