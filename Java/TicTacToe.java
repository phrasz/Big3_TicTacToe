/*
Title: Tic-Tac-Toe Game
Created: October 5, 2008
Last Edited: pending...
Author: Blmaster
Changes:
See Below...
http://forum.codecall.net/topic/43209-java-source-code-tic-tac-toe-game/
*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
public class TicTacToe implements ActionListener {
final String VERSION = "1.0";
//Setting up ALL the variables
JFrame window = new JFrame("Tic-Tac-Toe " + VERSION);

JMenuBar mnuMain = new JMenuBar();
JMenuItem mnuNewGame = new JMenuItem("New Game"),
mnuInstruction = new JMenuItem("Instructions"),
mnuExit = new JMenuItem("Exit"),
mnuAbout = new JMenuItem("About");

JButton btn1v1 = new JButton("Player vs Player"),
btn1vCPU = new JButton("Player vs CPU"),
btnBack = new JButton("<--back");
JButton btnEmpty[] = new JButton[10];

JPanel pnlNewGame = new JPanel(),
pnlNorth = new JPanel(),
pnlSouth = new JPanel(),
pnlTop = new JPanel(),
pnlBottom = new JPanel(),
pnlPlayingField = new JPanel();
JLabel lblTitle = new JLabel("Tic-Tac-Toe");
JTextArea txtMessage = new JTextArea();

final int winCombo[][] = new int[][] {
{1, 2, 3}, {1, 4, 7}, {1, 5, 9},
{4, 5, 6}, {2, 5, 8}, {3, 5, 7},
{7, 8, 9}, {3, 6, 9}
/*Horizontal Wins*/ /*Vertical Wins*/ /*Diagonal Wins*/
};
final int X = 412, Y = 268, color = 190;
boolean inGame = false;
boolean win = false;
boolean btnEmptyClicked = false;
String message;
int turn = 1;
int wonNumber1 = 1, wonNumber2 = 1, wonNumber3 = 1;

public static void main(String[] args) {
/* new TicTacToe(); */// Calling the class construtor.
}
}
/*
Changes:
1.0- changes below: Stable
0.9- added back button, added comments.
0.8- added dynamic win message.
0.7- added game function- game playable.
0.6- changed menu layout.
0.5- basic functions with menu and nice GUI.
*/
 