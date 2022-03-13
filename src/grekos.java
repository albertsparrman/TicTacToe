import java.util.Scanner;

public class grekos {
    public static void main(String[] args) {
        char[][] board = {{'_','|','_','|','_'},{'_','|','_','|','_'},{' ','|',' ','|',' '}};
        printBoard(board);
        boolean gameOver = false;

        while (!gameOver){
            player1Move(board);
            gameOver = isGameOver(board);
            if(gameOver){
                break;
            }

            player2Move(board);
            gameOver = isGameOver(board);
            if(gameOver){
                break;
            }
        }
    }

public static void printBoard(char [][] board){
        for (char[] row : board){
            for (char c : row){
                System.out.print(c);
            }
            System.out.println();
        }
}

public static void  updateBoard(int position, int player, char[][] board){

        char character;

        if(player==1){
            character = 'X';
        }else{
            character = 'O';
        }

        switch (position){

            case 1:
                board[0][0] = character;
                printBoard(board);
                break;

            case 2:
                board[0][2] = character;
                printBoard(board);
                break;

            case 3:
                board[0][4] = character;
                printBoard(board);
                break;

            case 4:
                board[1][0] = character;
                printBoard(board);
                break;

            case 5:
                board[1][2] = character;
                printBoard(board);
                break;

            case 6:
                board[1][4] = character;
                printBoard(board);
                break;

            case 7:
                board[2][0] = character;
                printBoard(board);
                break;

            case 8:
                board[2][2] = character;
                printBoard(board);
                break;

            case 9:
                board[2][4] = character;
                printBoard(board);
                break;

            default:
                break;

        }
}

public static void  player1Move(char[][] board){

        System.out.println("Enter a move. (1-9)");
        Scanner input = new Scanner(System.in);

        int move = input.nextInt();

        boolean result = isValidMove(move, board);

        while (!result){
            System.out.println("Invalid move. Try a different move.");
            move = input.nextInt();
            result = isValidMove(move,board);
        }

        updateBoard(move, 1, board);

}

public static void  player2Move(char[][] board){

        System.out.println("Enter a move. (1-9)");
        Scanner input = new Scanner(System.in);

        int move = input.nextInt();

        boolean result = isValidMove(move, board);

        while (!result){
            System.out.println("Invalid move. Try a different move.");
            move = input.nextInt();
            result = isValidMove(move,board);
        }

        updateBoard(move, 2, board);

    }

public static boolean isValidMove(int move, char[][] board){

        switch (move){
            case 1:
                if(board[0][0] == '_'){
                    return true;
                }else{
                    return false;
                }
            case 2:
                if(board[0][2] == '_'){
                    return true;
                }else{
                    return false;
                }

            case 3:
                if(board[0][4] == '_'){
                    return true;
                }else{
                    return false;
                }

            case 4:
                if(board[1][0] == '_'){
                    return true;
                }else{
                    return false;
                }
            case 5:
                if(board[1][2] == '_'){
                    return true;
                }else{
                    return false;
                }

            case 6:
                if(board[1][4] == '_'){
                    return true;
                }else{
                    return false;
                }

            case 7:
                if(board[2][0] == ' '){
                    return true;
                }else{
                    return false;
                }
            case 8:
                if(board[2][2] == ' '){
                    return true;
                }else{
                    return false;
                }

            case 9:
                if(board[2][4] == ' '){
                    return true;
                }else{
                    return false;
                }

            default:
                return false;

        }

}

public static boolean isGameOver(char[][] board){
        //Horizontal wins
        if (board[0][0] == 'X'&& board[0][2] == 'X'&& board[0][4] == 'X'){
            System.out.println("Player 1 wins");
            return true;
        }
        if (board[0][0] == 'O'&& board[0][2] == 'O'&& board[0][4] == 'O'){
            System.out.println("Player 2 wins");
            return true;
        }
        if (board[1][0] == 'X'&& board[1][2] == 'X'&& board[1][4] == 'X'){
            System.out.println("Player 1 wins");
            return true;
        }
        if (board[1][0] == 'O'&& board[1][2] == 'O'&& board[1][4] == 'O'){
            System.out.println("Player 2 wins");
            return true;
        }
        if (board[2][0] == 'X'&& board[2][2] == 'X'&& board[2][4] == 'X'){
            System.out.println("Player 1 wins");
            return true;
        }
        if (board[2][0] == 'O'&& board[2][2] == 'O'&& board[2][4] == 'O'){
            System.out.println("Player 2 wins");
            return true;
        }

        //Vertical wins

        if (board[0][0] == 'X'&& board[1][0] == 'X'&& board[2][0] == 'X'){
            System.out.println("Player 1 wins");
            return true;
        }
        if (board[0][0] == 'O'&& board[1][0] == 'O'&& board[2][0] == 'O'){
            System.out.println("Player 2 wins");
            return true;
        }
        if (board[0][2] == 'X'&& board[1][2] == 'X'&& board[2][2] == 'X'){
            System.out.println("Player 1 wins");
            return true;
        }
        if (board[0][2] == 'O'&& board[1][2] == 'O'&& board[2][2] == 'O'){
            System.out.println("Player 2 wins");
            return true;
        }
        if (board[0][4] == 'X'&& board[1][4] == 'X'&& board[2][4] == 'X'){
            System.out.println("Player 1 wins");
            return true;
        }
        if (board[0][4] == 'O'&& board[1][4] == 'O'&& board[2][4] == 'O'){
            System.out.println("Player 2 wins");
            return true;
        }

        //Diagonal wins
        if (board[0][0] == 'X'&& board[1][2] == 'X'&& board[2][4] == 'X'){
            System.out.println("Player 1 wins");
            return true;
        }
        if (board[0][0] == 'O'&& board[1][2] == 'O'&& board[2][4] == 'O'){
            System.out.println("Player 2 wins");
            return true;
        }
        if (board[0][4] == 'X'&& board[1][2] == 'X'&& board[2][0] == 'X'){
            System.out.println("Player 1 wins");
            return true;
        }
        if (board[0][4] == 'O'&& board[1][2] == 'O'&& board[2][0] == 'O'){
            System.out.println("Player 2 wins");
            return true;
        }

        if (board[0][0] != '_' && board[0][2] != '_' && board[0][4] != '_' && board[1][0] != '_' && board[1][2] != '_' && board[1][4] != '_' &&board[2][0] != ' ' && board[2][2] != ' ' && board[2][4] != ' '){
            System.out.println("Its a tie");
            return true;
        }
        return false;
}
}
