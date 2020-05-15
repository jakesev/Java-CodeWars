import java.util.ArrayList;
import java.util.Scanner;

public class streetFighter2{

    static String[][] fighters = new String[][] {
            new String[] { "Ryu", "E.Honda", "Blanka", "Guile", "Balrog", "Vega" },
            new String[] { "Ken", "Chun Li", "Zangief", "Dhalsim", "Sagat", "M.Bison" }, };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Boolean characterSelected = false;
        int[]  position = {0,0};
        ArrayList<String> selectedHistory = new ArrayList<String>();

        System.out.println( "Please selection Characted: left, right, up, down! /nPlease write select to choose your Character!");

        while (!characterSelected) {

            String moves = scanner.nextLine();

            if (moves.equals("left") || moves.equals("right") || moves.equals("up") || moves.equals("down") || moves.equals("select")) {

                if (!moves.equals("select")) {
                    position = streetFighterSelection(fighters, position, moves);
                    System.out.println("{"+position[0]+"} {" +position[1] +"}");
                    selectedHistory.add(fighters[position[0]][position[1]]);
                    System.out.println(selectedHistory);

                } else{
                    characterSelected = true;
                }
                
            }

        }


        scanner.close();
    }

    private static int[] streetFighterSelection(String[][] fighter, int[] position, String input) {


        for(int row = 0 ; row<fighter.length; row++){
            for(int col = 0; col<fighter[row].length; col++){
                System.out.print("  {  "+fighter[row][col] + "  } ");
            }
            System.out.println();
        }

        if (input.equals("left") ){
            //col-1
            position[1]-= 1;

           if( position[1] == -1){
               position[1] = fighter[0].length-1;
           } 

        } else if (input.equals("right")){
            //col+1
            position[1]+= 1;
            if( position[1] > 5){
                position[1] = 0;
            } 

        } else if (input.equals("up")){

            if(position[0]-1 < -1){
                position[0]-=1;
            }
 
        } else if (input.equals("down")){
            //row+1
            if(position[0]+1 < 2){
                position[0] += 1;
            } 
        }
        
    
        return  position;
    }

    


}

