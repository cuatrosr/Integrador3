package ui;
import java.util.*;
import model.*;

public class Menu{

  private static Scanner sc = new Scanner(System.in);

  public void startProgram(){
    int choice = 0;
    do {
      showMenu();
      choice = readOption(sc);
    } while (choice != 3);
  }

  public void showMenu(){
    System.out.println("\n(1) Prueba1");
    System.out.println("(2) Prueba2\n");
  }

  public int readOption(Scanner sc){
    int choice = sc.nextInt();
    sc.nextLine();
    return choice;
  }
}
