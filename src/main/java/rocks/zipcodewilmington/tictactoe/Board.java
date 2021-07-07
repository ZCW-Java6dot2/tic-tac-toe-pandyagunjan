package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {

    Character[][] board;
    public Board(Character[][] matrix) {
       this.board=matrix;

    }

    public Boolean isInFavorOfX() {
        /*
        Boolean flagX =false;

         if(    (board[0][0].equals('X') && board[1][0].equals('X') && board[2][0].equals('X')) ||   //First column
                (board[0][1].equals('X') && board[1][1].equals('X') && board[2][1].equals('X')) ||   //Middle column
                (board[0][2].equals('X') && board[1][2].equals('X') && board[2][2].equals('X')) ||   //Third column
                (board[0][0].equals('X') && board[0][1].equals('X') && board[0][2].equals('X')) ||   //First Row
                (board[1][0].equals('X') && board[1][1].equals('X') && board[1][2].equals('X')) ||   //Second Row
                (board[2][0].equals('X') && board[2][1].equals('X') && board[2][2].equals('X')) ||   //Third row
                (board[0][0].equals('X') && board[1][1].equals('X') && board[2][2].equals('X')) ||   //Diagonal
                (board[0][2].equals('X') && board[1][1].equals('X') && board[2][0].equals('X')))   //Diagonal
             flagX=true;
        return flagX;           */
               return checkWinner('X');

    }

    public Boolean isInFavorOfO() {

        /*
        Boolean flagO = false;
        if(     (board[0][0].equals('O') && board[1][0].equals('O') && board[2][0].equals('O')) ||   //First column
                (board[0][1].equals('O') && board[1][1].equals('O') && board[2][1].equals('O')) ||   //Middle column
                (board[0][2].equals('O') && board[1][2].equals('O') && board[2][2].equals('O')) ||   //Third column
                (board[0][0].equals('O') && board[0][1].equals('O') && board[0][2].equals('O')) ||   //First Row
                (board[1][0].equals('O') && board[1][1].equals('O') && board[1][2].equals('O')) ||   //Second row
                (board[2][0].equals('O') && board[2][1].equals('O') && board[2][2].equals('O')) ||   //Third row
                (board[0][0].equals('O') && board[1][1].equals('O') && board[2][2].equals('O')) ||   //Diagonal
                (board[0][2].equals('O') && board[1][1].equals('O') && board[2][0].equals('O')))    //Diagonal
                flagO=true;

        return flagO;    */
        return checkWinner('O');
    }

    public Boolean isTie() {
        return isInFavorOfO()==isInFavorOfX();
    }

    public String getWinner() {
       if(isInFavorOfO())
           return "O";
       else if (isInFavorOfX())
           return "X";
       else
           return "";

    }

    public Boolean checkWinner(Character passedChar)
    {

        Boolean flag=false;
        if(     (board[0][0].equals(passedChar) && board[1][0].equals(passedChar) && board[2][0].equals(passedChar)) ||   //First column
                (board[0][1].equals(passedChar) && board[1][1].equals(passedChar) && board[2][1].equals(passedChar)) ||   //Middle column
                (board[0][2].equals(passedChar) && board[1][2].equals(passedChar) && board[2][2].equals(passedChar)) ||   //Third column
                (board[0][0].equals(passedChar) && board[0][1].equals(passedChar) && board[0][2].equals(passedChar)) ||   //First Row
                (board[1][0].equals(passedChar) && board[1][1].equals(passedChar) && board[1][2].equals(passedChar)) ||   //Second row
                (board[2][0].equals(passedChar) && board[2][1].equals(passedChar) && board[2][2].equals(passedChar)) ||   //Third row
                (board[0][0].equals(passedChar) && board[1][1].equals(passedChar) && board[2][2].equals(passedChar)) ||   //Diagonal
                (board[0][2].equals(passedChar) && board[1][1].equals(passedChar) && board[2][0].equals(passedChar)))    //Diagonal
            flag=true;

                 return flag;
    }

}
