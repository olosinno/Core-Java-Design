public class ArrayDemoFinal{
    public static void main(String[] args) {

        int num;                                                //A variable holds one of an given class instance

        int[] nums = new int[4];                                //An array can hold as many instances as specified when it is created
                                                                //  !!THIS CANNOT BE CHANGED LATER!!

        String[] colors = {"Green", "Blue", "Red", "Purple"};   //When you create an array, you can specify it's elements with {}
                                          
        String color = colors[3];                               //You can reference an element of an array by specifying it's location in that array
        System.out.println(color);
        int z = 3;
        colors[z] = "Pink";
        System.out.println(colors[z]);                          //You can change what's in the array the same way

        int shades = colors.length;                             //You can get the ammount of elements in an array with .length
        System.out.println(shades);
        System.out.println();

        int[] countdown = forLoopInitDemo();                    //This method shows how to use a for loop to initialize an array

        forLoopPrintDemo(countdown);                            //This method shows an example of using a for loop to test the contents of an array

        forEachLoopDemo(countdown);                             //This method shows an example of using a for each loop to test the contents of an array

        chessDemo();                                            //This Method demonstrates multidimentional arrays
    }

    public static int[] forLoopInitDemo() {                     //You can return an array as the result of a method!
        int[] countdown = new int[5];
        for (int i=0; i < countdown.length; i++){               //This is an example of how to use a for loop to set up an array 
            countdown[i] = countdown.length - i;
        }

        return countdown;
    }

    public static void forLoopPrintDemo(int[] countdown) {
        for (int i=0; i <= countdown.length; i++){              //and this is an example of how to use a loop to display an array
            if(i == countdown.length){
                System.out.println("BLASTOFF!!!");
            }else{
                System.out.println(countdown[i]);
            }
        }
        System.out.println();
    }

    public static void forEachLoopDemo(int[] countdown) {
        for (int q : countdown){
            System.out.println(q);                              //Another way to loop through an array
        }
        System.out.println("BLASTOFF!!!");
        System.out.println();
    }

    public static void chessDemo() {
        String[][] chessGrid = new String[8][8]; // chessGrid strings represent pieces on the first and last rows of the board.
        chessGrid[0][0] = "Black Rook";
        chessGrid[0][1] = "Black Knight";
        chessGrid[0][2] = "Black Bishop";
        chessGrid[0][3] = "Black Queen";
        chessGrid[0][4] = "Black King";
        chessGrid[0][5] = "Black Bishop";
        chessGrid[0][6] = "Black Knight";
        chessGrid[0][7] = "Black Rook";
        chessGrid[7][0] = "White Rook";
        chessGrid[7][1] = "White Knight";
        chessGrid[7][2] = "White Bishop";
        chessGrid[7][3] = "White Queen";
        chessGrid[7][4] = "White King";
        chessGrid[7][5] = "White Bishop";
        chessGrid[7][6] = "White Knight";
        chessGrid[7][7] = "White Rook";

        for (int y = 0; y < 8; y++){  // Primary for loop contains the "Vertical" piece movement beginning at 0 or Black Rook.            //Loops through the columns fo the chessboard
            for (int x = 0; x < 8; x++){ // Secondary foor loop contains the "Horizontal" piece movement beginning at 0, also Black Rook. //Loops throught the rows of the chessboard
                if ((y == 0)||(y == 7)){
                    //Already initialized
                }else if (y == 1){
                    chessGrid[y][x] = "Black Pawn"; // Second row of the board contains only pawns at the start of Chess.
                }else if (y == 6){
                    chessGrid[y][x] = "White Pawn"; // Second-last row of the board contains only pawns at the start of Chess.
                }else{
                    chessGrid[y][x] = "None";
                }
            }
        }
        System.out.println(chessGrid[0][4]); // Strictly prints Black King.
    }

}