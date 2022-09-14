//written by Camden Jones, JONE4307
// written by Logan Jackson, JACK1721
import java.util.Random;
public class Board {

    private Cell[][] gameBoard;
    private Cell[][] displayBoard;
    private Boat[] gameBoats;
    public int gameTurns;
    public int remainingBoats;
    public int PowerPoints = 0;

    public Board(int gameMode) {
        gameBoard = new Cell[gameMode][gameMode];
        if (gameMode == 3) {
            PowerPoints = 1;
            remainingBoats = 1;
            gameBoats = new Boat[1];
        } else if (gameMode == 6) {
            PowerPoints = 3;
            remainingBoats = 3;
            gameBoats = new Boat[3];
        } else if (gameMode == 9) {
            PowerPoints = 5;
            remainingBoats = 5;
            gameBoats = new Boat[5];
        }
        for (int i = 0; i < gameMode; i++) {
            for (int j = 0; j < gameMode; j++) {
                gameBoard[i][j] = new Cell(i, j, '-');
            }
        }
        displayBoard = new Cell[gameMode][gameMode];
        for (int i = 0; i < gameMode; i++) {
            for (int j = 0; j < gameMode; j++) {
                displayBoard[i][j] = new Cell(i, j, '-');
            }
        }
    }
    public void boatCreator(int c, int boatNumber,int bounds){
        int counter = c;
        int i = boatNumber;
        double randomNumx;
        double randomNumy;
        Random random = new Random();
        Boolean randomOrientation;
        Random random1 = new Random();
        boolean randomDirection;
        boolean looper = true;
        while (looper == true) {
            boolean emptySpace = true;
            int tracker = 0;
            Cell[] boatCell = new Cell[counter];
            randomNumx = Math.random();
            randomNumx *= bounds;
            randomNumx = Math.floor(randomNumx);
            int intNumx = (int) randomNumx;
            randomNumy = Math.random();
            randomNumy *= bounds;
            randomNumy = Math.floor(randomNumy);
            int intNumy = (int) randomNumy;
            randomOrientation = random.nextBoolean();
            randomDirection = random1.nextBoolean();
            if (randomOrientation == true) {
                for (int z = counter - 1; z > -1; z--) {
                    if (randomNumy - z < 0) {
                        for (int l = 0; l < counter; l++) {
                            if (gameBoard[intNumx][intNumy + l].getStatus() == 'B') {
                                emptySpace = false;
                                tracker = 1;
                            }
                        }
                        if (emptySpace == true) {
                            looper = false;
                            for (int j = 0; j < counter; j++) {
                                gameBoard[intNumx][intNumy + j].setStatus('B');
                                boatCell[j] = gameBoard[intNumx][intNumy + j];
                                tracker = 1;
                            }
                            gameBoats[i] = new Boat(counter, randomOrientation, boatCell);
                        }
                    } else if (randomNumy + z > (bounds - 1)) {
                        for (int l = 0; l < counter; l++) {
                            if (gameBoard[intNumx][intNumy - l].getStatus() == 'B') {
                                emptySpace = false;
                                tracker = 1;
                            }
                        }
                        if (emptySpace == true) {
                            looper = false;
                            for (int j = 0; j < counter; j++) {
                                gameBoard[intNumx][intNumy - j].setStatus('B');
                                boatCell[j] = gameBoard[intNumx][intNumy - j];
                                tracker = 1;
                            }
                            gameBoats[i] = new Boat(counter, randomOrientation, boatCell);
                        }
                    }
                }
                if (tracker == 0) {
                    if (randomDirection == true) {
                        for (int l = 0; l < counter; l++) {
                            if (gameBoard[intNumx][intNumy + l].getStatus() == 'B') {
                                emptySpace = false;
                            }
                        }
                        if (emptySpace == true) {
                            looper = false;
                            for (int j = 0; j < counter; j++) {
                                gameBoard[intNumx][intNumy + j].setStatus('B');
                                boatCell[j] = gameBoard[intNumx][intNumy + j];
                            }
                            gameBoats[i] = new Boat(counter, randomOrientation, boatCell);
                        }
                    } else if (randomDirection == false) {
                        for (int l = 0; l < counter; l++) {
                            if (gameBoard[intNumx][intNumy - l].getStatus() == 'B') {
                                emptySpace = false;
                            }
                        }
                        if (emptySpace == true) {
                            looper = false;
                            for (int j = 0; j < counter; j++) {
                                gameBoard[intNumx][intNumy - j].setStatus('B');
                                boatCell[j] = gameBoard[intNumx][intNumy - j];
                            }
                            gameBoats[i] = new Boat(counter, randomOrientation, boatCell);
                        }
                    }
                }
            }
            if (randomOrientation == false) {
                for (int z = counter - 1; z > -1; z--) {
                    if (randomNumx - z < 0) {
                        for (int l = 0; l < counter; l++) {
                            if (gameBoard[intNumx + l][intNumy].getStatus() == 'B') {
                                emptySpace = false;
                                tracker = 1;
                            }
                        }
                        if (emptySpace == true) {
                            looper = false;
                            for (int j = 0; j < counter; j++) {
                                gameBoard[intNumx + j][intNumy].setStatus('B');
                                boatCell[j] = gameBoard[intNumx + j][intNumy];
                                tracker = 1;
                            }
                            gameBoats[i] = new Boat(counter, randomOrientation, boatCell);
                        }
                    } else if (randomNumx + z > (bounds - 1)) {
                        for (int l = 0; l < counter; l++) {
                            if (gameBoard[intNumx - l][intNumy].getStatus() == 'B') {
                                emptySpace = false;
                                tracker = 1;
                            }
                        }
                        if (emptySpace == true) {
                            looper = false;
                            for (int j = 0; j < counter; j++) {
                                gameBoard[intNumx - j][intNumy].setStatus('B');
                                boatCell[j] = gameBoard[intNumx - j][intNumy];
                                tracker = 1;
                            }
                            gameBoats[i] = new Boat(counter, randomOrientation, boatCell);
                        }
                    }
                }
                if (tracker == 0) {
                    if (randomDirection == true) {
                        for (int l = 0; l < counter; l++) {
                            if (gameBoard[intNumx + l][intNumy].getStatus() == 'B') {
                                emptySpace = false;
                            }
                        }
                        if (emptySpace == true) {
                            looper = false;
                            for (int j = 0; j < counter; j++) {
                                gameBoard[intNumx + j][intNumy].setStatus('B');
                                boatCell[j] = gameBoard[intNumx + j][intNumy];
                            }
                            gameBoats[i] = new Boat(counter, randomOrientation, boatCell);
                        }
                    } else if (randomDirection == false) {
                        for (int l = 0; l < counter; l++) {
                            if (gameBoard[intNumx - l][intNumy].getStatus() == 'B') {
                                emptySpace = false;
                            }
                        }
                        if (emptySpace == true) {
                            looper = false;
                            for (int j = 0; j < counter; j++) {
                                gameBoard[intNumx - j][intNumy].setStatus('B');
                                boatCell[j] = gameBoard[intNumx - j][intNumy];
                            }
                            gameBoats[i] = new Boat(counter, randomOrientation, boatCell);
                        }
                    }
                }
            }
        }
    }

    public void placeBoats() {
        int counter = 2;

        if (gameBoats.length == 1)
            boatCreator(counter, 0, 3);

        if(gameBoats.length == 3){
            for(int i = 0; i < gameBoats.length; i++){
                boatCreator(counter, i, 6);
                counter++;
            }
        }
        if(gameBoats.length == 5){
            for(int i = 0; i < gameBoats.length; i++){
                boatCreator(counter, i, 9);
                if(i != 1)
                    counter++;
            }
        }
    }

    public boolean fire(int x, int y) {
        if (x < gameBoard.length && x >= 0) {
            if (y < gameBoard.length && y >= 0) {
                if (gameBoard[x][y].getStatus() == 'H' || gameBoard[x][y].getStatus() == 'M') {
                    System.out.println("already guessed, penalty");
                    gameTurns += 1;
                    return false;
                }
            }
        }
        if (x < gameBoard.length && x >= 0) {
            if (y < gameBoard.length && y >= 0) {
                if (gameBoard[x][y].getStatus() == 'B') {
                    gameBoard[x][y].setStatus('H');
                    displayBoard[x][y].setStatus('H');
                    System.out.println("hit at " + x + "," + y);
                    gameTurns += 1;
                    hassunk();
                    return true;
                } else {
                    gameBoard[x][y].setStatus('M');
                    displayBoard[x][y].setStatus('M');
                    System.out.println("miss at " + x + "," + y);
                    gameTurns += 1;
                    return true;
                }
            }
        }
        System.out.println("not in bounds, penalty");
        gameTurns += 1;
        return false;
    }

    public boolean missile(int x, int y) {
        if(PowerPoints < 1){
            System.out.println("not enough power points");
            return true;
        }
        if (x > gameBoard.length - 1 || x < 0) {
            return false;
        }
        if (y > gameBoard.length - 1 || y < 0) {
            return false;
        }
        //impact site
        if (gameBoard[x][y].getStatus() == 'B' || gameBoard[x][y].getStatus() == 'H') {
            gameBoard[x][y].setStatus('H');
            displayBoard[x][y].setStatus('H');
            System.out.println("hit at " + x + "," + y);
        } else {
            gameBoard[x][y].setStatus('M');
            displayBoard[x][y].setStatus('M');
            System.out.println("miss at " + x + "," + y);
        }
        //left of impact side
        if (x - 1 <= gameBoard.length - 1 && x - 1 >= 0) {
            if (y <= gameBoard.length - 1 && y >= 0) {
                if (gameBoard[x - 1][y].getStatus() == 'B' || gameBoard[x - 1][y].getStatus() == 'H') {
                    gameBoard[x - 1][y].setStatus('H');
                    displayBoard[x-1][y].setStatus('H');
                    System.out.println("hit at " + (x - 1) + "," + y);
                } else {
                    gameBoard[x - 1][y].setStatus('M');
                    displayBoard[x-1][y].setStatus('M');
                    System.out.println("miss at " + (x - 1) + "," + y);
                }
            }
        }
        //right of impact site
        if (x + 1 <= gameBoard.length - 1 && x + 1 >= 0) {
            if (y <= gameBoard.length - 1 && y >= 0) {
                if (gameBoard[x + 1][y].getStatus() == 'B' || gameBoard[x + 1][y].getStatus() == 'H') {
                    gameBoard[x + 1][y].setStatus('H');
                    displayBoard[x+1][y].setStatus('H');
                    System.out.println("hit at " + (x + 1) + "," + y);
                } else {
                    gameBoard[x + 1][y].setStatus('M');
                    displayBoard[x+1][y].setStatus('M');
                    System.out.println("miss at " + (x + 1) + "," + y);
                }
            }
        }
        //above impact site
        if (x <= gameBoard.length - 1 && x >= 0) {
            if (y + 1 <= gameBoard.length - 1 && y + 1 >= 0) {
                if (gameBoard[x][y + 1].getStatus() == 'B' || gameBoard[x][y + 1].getStatus() == 'H') {
                    gameBoard[x][y + 1].setStatus('H');
                    displayBoard[x][y+1].setStatus('H');
                    System.out.println("hit at " + x + "," + (y + 1));
                } else {
                    gameBoard[x][y + 1].setStatus('M');
                    displayBoard[x][y+1].setStatus('M');
                    System.out.println("miss at " + x + "," + (y + 1));
                }
            }
        }
        //below impact site
        if (x <= gameBoard.length - 1 && x >= 0) {
            if (y - 1 <= gameBoard.length - 1 && y - 1 >= 0) {
                if (gameBoard[x][y - 1].getStatus() == 'B' || gameBoard[x][y - 1].getStatus() == 'H') {
                    gameBoard[x][y - 1].setStatus('H');
                    displayBoard[x][y-1].setStatus('H');
                    System.out.println("hit at " + x + "," + (y - 1));
                } else {
                    gameBoard[x][y - 1].setStatus('M');
                    displayBoard[x][y-1].setStatus('M');
                    System.out.println("miss at " + x + "," + (y - 1));
                }
            }
        }
        //below left of impact site
        if (x - 1 <= gameBoard.length - 1 && x - 1 >= 0) {
            if (y - 1 <= gameBoard.length - 1 && y - 1 >= 0) {
                if (gameBoard[x - 1][y - 1].getStatus() == 'B' || gameBoard[x - 1][y - 1].getStatus() == 'H') {
                    gameBoard[x - 1][y - 1].setStatus('H');
                    displayBoard[x-1][y-1].setStatus('H');
                    System.out.println("hit at " + (x - 1) + "," + (y - 1));
                } else {
                    gameBoard[x - 1][y - 1].setStatus('M');
                    displayBoard[x-1][y-1].setStatus('M');
                    System.out.println("miss at " + (x - 1) + "," + (y - 1));
                }
            }
        }
        //below right of impact site
        if (x + 1 <= gameBoard.length - 1 && x + 1 >= 0) {
            if (y - 1 <= gameBoard.length - 1 && y - 1 >= 0) {
                if (gameBoard[x + 1][y - 1].getStatus() == 'B' || gameBoard[x + 1][y - 1].getStatus() == 'H') {
                    gameBoard[x + 1][y - 1].setStatus('H');
                    displayBoard[x+1][y-1].setStatus('H');
                    System.out.println("hit at " + (x + 1) + "," + (y - 1));
                } else {
                    gameBoard[x + 1][y - 1].setStatus('M');
                    displayBoard[x+1][y-1].setStatus('M');
                    System.out.println("miss at " + (x + 1) + "," + (y - 1));
                }
            }
        }
        //above right of impact site
        if (x + 1 <= gameBoard.length - 1 && x + 1 >= 0) {
            if (y + 1 <= gameBoard.length - 1 && y + 1 >= 0) {
                if (gameBoard[x + 1][y + 1].getStatus() == 'B' || gameBoard[x + 1][y + 1].getStatus() == 'H') {
                    gameBoard[x + 1][y + 1].setStatus('H');
                    displayBoard[x+1][y+1].setStatus('H');
                    System.out.println("hit at " + (x + 1) + "," + (y + 1));
                } else {
                    gameBoard[x + 1][y + 1].setStatus('M');
                    displayBoard[x+1][y+1].setStatus('M');
                    System.out.println("miss at " + (x + 1) + "," + (y + 1));
                }
            }
        }
        //above left of impact site
        if (x - 1 <= gameBoard.length - 1 && x - 1 >= 0) {
            if (y + 1 <= gameBoard.length - 1 && y + 1 >= 0) {
                if (gameBoard[x - 1][y + 1].getStatus() == 'B' || gameBoard[x - 1][y + 1].getStatus() == 'H') {
                    gameBoard[x - 1][y + 1].setStatus('H');
                    displayBoard[x-1][y+1].setStatus('H');
                    System.out.println("hit at " + (x - 1) + "," + (y + 1));
                } else {
                    gameBoard[x - 1][y + 1].setStatus('M');
                    displayBoard[x-1][y+1].setStatus('M');
                    System.out.println("miss at " + (x - 1) + "," + (y + 1));
                }
            }
        }
        hassunk();
        PowerPoints -= 1;
        gameTurns += 1;
        return true;
    }
    public boolean drone() {
        if (PowerPoints < 1) {
            System.out.println("not enough power points");
            return false;
        }
            Random Rand = new Random();
            int Randchoice = Rand.nextInt(2);
            int Randrow = Rand.nextInt(gameBoard.length);
            int Randcol = Rand.nextInt(gameBoard.length);
            int counter = 0;
            //System.out.println("choice: " + Randchoice + "row: " + Randrow + "col: " + Randcol);
            if (Randchoice == 0) {
                for (int i = 0; i < gameBoard.length; i++) {
                    if (gameBoard[i][Randrow].getStatus() == ('B') || gameBoard[i][Randrow].getStatus() == ('H')) {
                        counter += 1;
                    }else if(gameBoard[i][Randrow].getStatus() == ('S')){
                        counter +=1;
                    }
                }
                System.out.println("drone has scanned " + counter + " targets in row " + Randrow);
            }
            if (Randchoice == 1) {
                for (int i = 0; i < gameBoard.length; i++) {
                    if (gameBoard[Randcol][i].getStatus() == ('B') || gameBoard[Randcol][i].getStatus() == ('H')) {
                        counter += 1;
                    }else if(gameBoard[i][Randrow].getStatus() == ('S')){
                        counter += 1;
                    }
                }
                System.out.println("drone has scanned " + counter + " targets in col " + Randcol);
            }
        gameTurns += 1;
        PowerPoints -= 1;
        return true;
    }
        public boolean Sub ( int x, int y){
            if (PowerPoints < 1) {
                System.out.println("not enough power points");
                return true;
            }
            if (x > gameBoard.length - 1 || x < 0) {
                return false;
            }
            if (y > gameBoard.length - 1 || y < 0) {
                return false;
            }
            if (gameBoard[x][y].getStatus() == 'H' || gameBoard[x][y].getStatus() == 'B') {
                gameBoard[x][y].setStatus('H');
                displayBoard[x][y].setStatus('H');
                System.out.println("hit at " + x + "," + y);
                for (int k = 0; k < gameBoats.length; k++) {
                    Cell[] location = gameBoats[k].getLocation();
                    for (int i = 0; i < location.length; i++) {
                        if (location[i].getRow() == x) {
                            if (location[i].getCol() == y) {
                                if (gameBoats[k].getOrientation() == true) {
                                    for (int j = 0; j < location.length; j++) {
                                        gameBoard[x][location[j].getCol()].setStatus('H');
                                        displayBoard[x][location[j].getCol()].setStatus('H');
                                    }
                                } else {
                                    for (int j = 0; j < location.length; j++) {
                                        gameBoard[location[j].getRow()][y].setStatus('H');
                                        displayBoard[location[j].getRow()][y].setStatus('H');
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                gameBoard[x][y].setStatus('M');
                displayBoard[x][y].setStatus('M');
                System.out.println("miss at " + x + "," + y);
            }
            hassunk();
            PowerPoints -= 1;
            gameTurns += 1;
            return true;
        }
    public void hassunk() {
        int HitCount = 0;
        for (int k = 0; k < gameBoats.length; k++) {
            Cell[] location = gameBoats[k].getLocation();
            HitCount = 0;
            for (int i = 0; i < location.length; i++) {
                if (location[i].getStatus() == 'H') {
                    HitCount += 1;
                }
                if (HitCount == gameBoats[k].getLength()) {
                    remainingBoats -= 1;
                    System.out.println("ship has been sunk");
                    if (gameBoats[k].getOrientation() == true) {
                        for (int j = 0; j < location.length; j++) {
                            gameBoard[location[j].getRow()][location[j].getCol()].setStatus('S');
                            displayBoard[location[j].getRow()][location[j].getCol()].setStatus('S');
                        }
                    } else {
                        for (int j = 0; j < location.length; j++) {
                            gameBoard[location[j].getRow()][location[j].getCol()].setStatus('S');
                            displayBoard[location[j].getRow()][location[j].getCol()].setStatus('S');
                        }
                    }
                }
            }
        }
    }
    public void debugDisplay() {
        for (int i = 0; i < gameBoard.length; i++) {
            System.out.print("  "  + gameBoard[i][0].getRow());
        }
        for (int j = 0; j < gameBoard.length; j++) {
            System.out.println();
            System.out.print(gameBoard[0][j].getCol() + " ");
            for(int f = 0; f<gameBoard.length; f++) {
                System.out.print(gameBoard[f][j].getStatus() + "  ");
            }
        }
        System.out.println(" ");
    }

    public void display() {
        for (int i = 0; i < displayBoard.length; i++) {
            System.out.print("  "  + displayBoard[i][0].getRow());
        }
        for (int j = 0; j < displayBoard.length; j++) {
            System.out.println();
            System.out.print(displayBoard[0][j].getCol() + " ");
            for(int f = 0; f<displayBoard.length; f++) {
                System.out.print(displayBoard[f][j].getStatus() + "  ");
            }
        }
        System.out.println(" ");
    }
}