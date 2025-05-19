public class Main {

    public static void main (String[] args) {
        Queen queen = new Queen();
        queen.row = 4;
        queen.column = 4;
        Position testPosition = new Position(3, 4);
        if (queen.isValidMove(testPosition))
        {
            System.out.println("Yes, I can move there.");
        }
        else{
            System.out.println("Nope, can't do!");
        }
        }
    }


