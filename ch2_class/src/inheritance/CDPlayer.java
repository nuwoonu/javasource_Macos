package inheritance;

public class CDPlayer extends Player{

    // abstract은 오버라이딩이 되어야함.
    
    int currentTrack;
    @Override
    void play(int pos) {
        System.out.println("CD Play");
    }

    @Override
    void stop() {
        System.out.println("CD Stop");
    }
    
    void nextTrack()
    {
        currentTrack++;
    }
    void prevTrack()
    {
        if(currentTrack >1)
        {
            currentTrack--;
        }
    }
}
