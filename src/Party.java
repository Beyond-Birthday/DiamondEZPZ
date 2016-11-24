import java.io.*;
import java.util.*;
/**
 * Created by sdomas on 04/10/16.

 NOTE : this class represents a party and its turns
 It is in charge of creating the board, the tree and to
 ask successively players for their choice. After the first turn of red,
 it computes the tree of all possible evolution of the party, and guess what
 red must play to win.
 Method that compute the decision must be implemented in the Tree class and called
 from Party. There should also be a method in Board to print the board.

 */

public class Party {


    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    Board board;
    Tree tree;
    BufferedReader consoleIn;

    public Party() {
        consoleIn = new BufferedReader(new InputStreamReader(System.in));
        board = new Board();
        tree = new Tree(board);
    }

    public void start() {

        board.clearBoard();



        /* A COMPLETER :
           - afficher le plateau de jeu
           - demander son 1er coup au joueur bleu, et mettre à jour l'arbre et le plateau
           - afficher le plateau de jeu
           - demander son 1er coup au joueur rouge, et mettre à jour l'arbre et le plateau
           - calculer l'arbre de tous les coups possibles
           - tant que partie non finie :
              - demander son prochain coup au joueur bleu, et mettre à jour l'arbre et le plateau
              - afficher le plateau de jeu
              - calculer le meilleur prochain cou du rouge et mettre à jour l'arbre et le plateau
               - afficher le plateau de jeu
            - fin tant que
            - afficher vainqueur

         */

    }

}
