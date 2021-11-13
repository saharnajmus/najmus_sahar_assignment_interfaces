package be.intecbrussel.graphics;

public interface Scalable {
    public final int QUARTER = 25;
    public final int HALF = 50;
    public final int DOUBLE = 200;
    public abstract void scale(int factor);
    public default void scaleDouble(){
        scale(DOUBLE);
    }
    public default void scaleHalf(){
        scale(HALF);
    }
    public default void scaleQuarter(){
        scale(QUARTER);
    }



}
