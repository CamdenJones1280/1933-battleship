//written by Camden Jones, JONE4307
// written by Logan Jackson, JACK1721
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner modeScanner = new Scanner(System.in);
        System.out.println("Enter what game mode you would like to play (Beginner, Intermediate, Expert, or deBug): ");
        String mode = modeScanner.nextLine();
        Board gameBoard;
        if (mode.equals("Beginner")) {
            gameBoard = new Board(3);
            gameBoard.placeBoats();
            System.out.println("there is 1 boat on the board");
            while (gameBoard.remainingBoats >= 1) {
                Scanner Action = new Scanner(System.in);
                gameBoard.display();
                System.out.println("you have " + gameBoard.PowerPoints + " power point(s) remaining");
                System.out.println("what action do you want to take? (missile, sub, drone, fire) ");
                String action = Action.nextLine();
                if (action.equals("fire")) {
                    Scanner Cords = new Scanner(System.in);
                    System.out.println("Enter x cord ");
                    int x_cord = Cords.nextInt();
                    System.out.println("Enter y cord ");
                    int y_cord = Cords.nextInt();
                    gameBoard.fire(x_cord, y_cord);
                } else if (action.equals("missile")) {
                    boolean valid = false;
                    while (valid == false) {
                        Scanner Cords = new Scanner(System.in);
                        System.out.println("Enter x cord ");
                        int x_cord = Cords.nextInt();
                        System.out.println("Enter y cord ");
                        int y_cord = Cords.nextInt();
                        if (gameBoard.missile(x_cord, y_cord) == true) {
                            valid = true;
                        } else {
                            System.out.println("invalid");
                        }
                    }
                } else if (action.equals("drone")) {
                    gameBoard.drone();
                } else if (action.equals("sub")) {
                    boolean valid = false;
                    while (valid == false) {
                        Scanner Cords = new Scanner(System.in);
                        System.out.println("Enter x cord ");
                        int x_cord = Cords.nextInt();
                        System.out.println("Enter y cord ");
                        int y_cord = Cords.nextInt();
                        if (gameBoard.Sub(x_cord, y_cord) == true) {
                            valid = true;
                        } else {
                            System.out.println("invalid");
                        }
                    }
                }
            }
            System.out.println("you have taken " + gameBoard.gameTurns + " turn(s)");
        } else if (mode.equals("Intermediate")) {
            gameBoard = new Board(6);
            gameBoard.placeBoats();
            System.out.println("there are 3 boats on the board");
            while (gameBoard.remainingBoats >= 1) {
                Scanner Action = new Scanner(System.in);
                gameBoard.display();
                System.out.println("you have " + gameBoard.PowerPoints + " power point(s) remaining");
                System.out.println("what action do you want to take? (missile, sub, drone, fire) ");
                String action = Action.nextLine();
                if (action.equals("fire")) {
                    Scanner Cords = new Scanner(System.in);
                    System.out.println("Enter x cord ");
                    int x_cord = Cords.nextInt();
                    System.out.println("Enter y cord ");
                    int y_cord = Cords.nextInt();
                    gameBoard.fire(x_cord, y_cord);
                } else if (action.equals("missile")) {
                    boolean valid = false;
                    while (valid == false) {
                        Scanner Cords = new Scanner(System.in);
                        System.out.println("Enter x cord ");
                        int x_cord = Cords.nextInt();
                        System.out.println("Enter y cord ");
                        int y_cord = Cords.nextInt();
                        if (gameBoard.missile(x_cord, y_cord) == true) {
                            valid = true;
                        } else {
                            System.out.println("invalid");
                        }
                    }
                } else if (action.equals("drone")) {
                    gameBoard.drone();
                } else if (action.equals("sub")) {
                    boolean valid = false;
                    while (valid == false) {
                        Scanner Cords = new Scanner(System.in);
                        System.out.println("Enter x cord ");
                        int x_cord = Cords.nextInt();
                        System.out.println("Enter y cord ");
                        int y_cord = Cords.nextInt();
                        if (gameBoard.Sub(x_cord, y_cord) == true) {
                            valid = true;
                        } else {
                            System.out.println("invalid");
                        }
                    }
                }
            }
            System.out.println("you have taken " + gameBoard.gameTurns + " turn(s)");
        } else if (mode.equals("Expert")) {
            gameBoard = new Board(9);
            gameBoard.placeBoats();
            System.out.println("there are 5 boats on the board");
            while (gameBoard.remainingBoats >= 1) {
                Scanner Action = new Scanner(System.in);
                gameBoard.display();
                System.out.println("you have " + gameBoard.PowerPoints + " power point(s) remaining");
                System.out.println("what action do you want to take? (missile, sub, drone, fire) ");
                String action = Action.nextLine();
                if (action.equals("fire")) {
                    Scanner Cords = new Scanner(System.in);
                    System.out.println("Enter x cord ");
                    int x_cord = Cords.nextInt();
                    System.out.println("Enter y cord ");
                    int y_cord = Cords.nextInt();
                    gameBoard.fire(x_cord, y_cord);
                } else if (action.equals("missile")) {
                    boolean valid = false;
                    while (valid == false) {
                        Scanner Cords = new Scanner(System.in);
                        System.out.println("Enter x cord ");
                        int x_cord = Cords.nextInt();
                        System.out.println("Enter y cord ");
                        int y_cord = Cords.nextInt();
                        if (gameBoard.missile(x_cord, y_cord) == true) {
                            valid = true;
                        } else {
                            System.out.println("invalid");
                        }
                    }
                } else if (action.equals("drone")) {
                    gameBoard.drone();
                } else if (action.equals("sub")) {
                    boolean valid = false;
                    while (valid == false) {
                        Scanner Cords = new Scanner(System.in);
                        System.out.println("Enter x cord ");
                        int x_cord = Cords.nextInt();
                        System.out.println("Enter y cord ");
                        int y_cord = Cords.nextInt();
                        if (gameBoard.Sub(x_cord, y_cord) == true) {
                            valid = true;
                        } else {
                            System.out.println("invalid");
                        }
                    }
                }
            }
            System.out.println("you have taken " + gameBoard.gameTurns + " turn(s)");
        }else if(mode.equals("deBug")){
            Scanner deBugmodeScanner = new Scanner(System.in);
            System.out.println("Enter what game mode you would like to play (Beginner, Intermediate, or Expert): ");
            String deBugmode = deBugmodeScanner.nextLine();
            if (deBugmode.equals("Beginner")) {
                gameBoard = new Board(3);
                gameBoard.placeBoats();
                System.out.println("there is 1 boat on the board");
                while (gameBoard.remainingBoats >= 1) {
                    Scanner Action = new Scanner(System.in);
                    gameBoard.debugDisplay();
                    System.out.println("you have " + gameBoard.PowerPoints + " power point(s) remaining");
                    System.out.println("what action do you want to take? (missile, sub, drone, fire) ");
                    String action = Action.nextLine();
                    if (action.equals("fire")) {
                        Scanner Cords = new Scanner(System.in);
                        System.out.println("Enter x cord ");
                        int x_cord = Cords.nextInt();
                        System.out.println("Enter y cord ");
                        int y_cord = Cords.nextInt();
                        gameBoard.fire(x_cord, y_cord);
                    } else if (action.equals("missile")) {
                        boolean valid = false;
                        while (valid == false) {
                            Scanner Cords = new Scanner(System.in);
                            System.out.println("Enter x cord ");
                            int x_cord = Cords.nextInt();
                            System.out.println("Enter y cord ");
                            int y_cord = Cords.nextInt();
                            if (gameBoard.missile(x_cord, y_cord) == true) {
                                valid = true;
                            } else {
                                System.out.println("invalid");
                            }
                        }
                    } else if (action.equals("drone")) {
                        gameBoard.drone();
                    } else if (action.equals("sub")) {
                        boolean valid = false;
                        while (valid == false) {
                            Scanner Cords = new Scanner(System.in);
                            System.out.println("Enter x cord ");
                            int x_cord = Cords.nextInt();
                            System.out.println("Enter y cord ");
                            int y_cord = Cords.nextInt();
                            if (gameBoard.Sub(x_cord, y_cord) == true) {
                                valid = true;
                            } else {
                                System.out.println("invalid");
                            }
                        }
                    }
                }
                System.out.println("you have taken " + gameBoard.gameTurns + " turn(s)");
            } else if (deBugmode.equals("Intermediate")) {
                gameBoard = new Board(6);
                gameBoard.placeBoats();
                System.out.println("there are 3 boats on the board");
                while (gameBoard.remainingBoats >= 1) {
                    Scanner Action = new Scanner(System.in);
                    gameBoard.debugDisplay();
                    System.out.println("you have " + gameBoard.PowerPoints + " power point(s) remaining");
                    System.out.println("what action do you want to take? (missile, sub, drone, fire) ");
                    String action = Action.nextLine();
                    if (action.equals("fire")) {
                        Scanner Cords = new Scanner(System.in);
                        System.out.println("Enter x cord ");
                        int x_cord = Cords.nextInt();
                        System.out.println("Enter y cord ");
                        int y_cord = Cords.nextInt();
                        gameBoard.fire(x_cord, y_cord);
                    } else if (action.equals("missile")) {
                        boolean valid = false;
                        while (valid == false) {
                            Scanner Cords = new Scanner(System.in);
                            System.out.println("Enter x cord ");
                            int x_cord = Cords.nextInt();
                            System.out.println("Enter y cord ");
                            int y_cord = Cords.nextInt();
                            if (gameBoard.missile(x_cord, y_cord) == true) {
                                valid = true;
                            } else {
                                System.out.println("invalid");
                            }
                        }
                    } else if (action.equals("drone")) {
                        gameBoard.drone();
                    } else if (action.equals("sub")) {
                        boolean valid = false;
                        while (valid == false) {
                            Scanner Cords = new Scanner(System.in);
                            System.out.println("Enter x cord ");
                            int x_cord = Cords.nextInt();
                            System.out.println("Enter y cord ");
                            int y_cord = Cords.nextInt();
                            if (gameBoard.Sub(x_cord, y_cord) == true) {
                                valid = true;
                            } else {
                                System.out.println("invalid");
                            }
                        }
                    }
                }
                System.out.println("you have taken " + gameBoard.gameTurns + " turn(s)");
            } else if (deBugmode.equals("Expert")) {
                gameBoard = new Board(9);
                gameBoard.placeBoats();
                System.out.println("there are 5 boats on the board");
                while (gameBoard.remainingBoats >= 1) {
                    Scanner Action = new Scanner(System.in);
                    gameBoard.debugDisplay();
                    System.out.println("you have " + gameBoard.PowerPoints + " power point(s) remaining");
                    System.out.println("what action do you want to take? (missile, sub, drone, fire) ");
                    String action = Action.nextLine();
                    if (action.equals("fire")) {
                        Scanner Cords = new Scanner(System.in);
                        System.out.println("Enter x cord ");
                        int x_cord = Cords.nextInt();
                        System.out.println("Enter y cord ");
                        int y_cord = Cords.nextInt();
                        gameBoard.fire(x_cord, y_cord);
                    } else if (action.equals("missile")) {
                        boolean valid = false;
                        while (valid == false) {
                            Scanner Cords = new Scanner(System.in);
                            System.out.println("Enter x cord ");
                            int x_cord = Cords.nextInt();
                            System.out.println("Enter y cord ");
                            int y_cord = Cords.nextInt();
                            if (gameBoard.missile(x_cord, y_cord) == true) {
                                valid = true;
                            } else {
                                System.out.println("invalid");
                            }
                        }
                    } else if (action.equals("drone")) {
                        gameBoard.drone();
                    } else if (action.equals("sub")) {
                        boolean valid = false;
                        while (valid == false) {
                            Scanner Cords = new Scanner(System.in);
                            System.out.println("Enter x cord ");
                            int x_cord = Cords.nextInt();
                            System.out.println("Enter y cord ");
                            int y_cord = Cords.nextInt();
                            if (gameBoard.Sub(x_cord, y_cord) == true) {
                                valid = true;
                            } else {
                                System.out.println("invalid");
                            }
                        }
                    }
                }
                System.out.println("you have taken " + gameBoard.gameTurns + " turn(s)");
            }
        }
    }
}