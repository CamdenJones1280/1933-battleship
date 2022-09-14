//written by Camden Jones, JONE4307
// written by Logan Jackson, JACK1721
public class Cell {
    private int row;
    private int col;
    private char status;

    public Cell(int row, int col, char status){
        this.row = row;
        this.col = col;
        this.status = status;
    }
    public void setStatus(char c){
        status = c;
    }
    public void setRow(int r){
        row = r;
    }
    public void setCol(int c){
        col = c;
    }
    public char getStatus(){
        return status;
    }
    public int getRow(){
        return row;
    }
    public int getCol(){
        return col;
    }
}
