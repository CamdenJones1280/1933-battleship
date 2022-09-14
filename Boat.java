//written by Camden Jones, JONE4307
// written by Logan Jackson, JACK1721
public class Boat {
    private int length;
    private boolean orientation;
    private Cell[] location;

    public Boat(int l, boolean o, Cell[] local){
        length = l;
        orientation = o;
        location = local;
    }

    public void setLength(int boatLength){
        length = boatLength;
    }

    public void setOrientation(boolean boatDirection){
        orientation = boatDirection;
    }

    public void setLocation(Cell[] cells){
        location = cells;
    }

    public int getLength(){
        return length;
    }

    public boolean getOrientation(){
        return orientation;
    }

    public Cell[] getLocation(){
        return location;
    }
}
