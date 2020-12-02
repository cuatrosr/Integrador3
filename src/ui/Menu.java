package ui;
import java.util.*;
import model.*;

public class Menu{

  private FootballClub app;
  private static Scanner sc = new Scanner(System.in);

  public void startProgram(){
    askClub();
    int choice = 0;
    do {
      showMenu();
      choice = readOption(sc);
      doOp(choice);
    } while (choice != 5);
  }

  public void doOp(int choice){
    switch (choice) {
      case 1:
        addEmployee();
        break;
      case 2:
        eraseEmployee();
        break;
      case 3:
        app.showInfoEmployee();
        break;
      case 4:
        editTeams();
        break;
      default:
        System.out.println("\nEsa opcion no era valida.");
        break;
    }
  }

  public void askClub(){
    System.out.println("\nIngrese el nombre del club:");
    String nameFC = sc.nextLine();
    System.out.println("\nIngrese el NIT del club:");
    int nitFC = sc.nextInt();
    sc.nextLine();
    System.out.println("\nIngrese la fecha de fundacion:");
    String fundationDateFC = sc.nextLine();
    app = new FootballClub(nameFC, nitFC, fundationDateFC);
    System.out.println("\nSe registro el club con exito.");
  }

  public void showMenu(){
    System.out.println("\n(1) Añadir un empleado");
    System.out.println("(2) Despedir un empleado");
    System.out.println("(3) Imprimir empleados");
    System.out.println("(4) Editar equipos");
    System.out.println("(5) Salir del programa\n");
  }

  public void addEmployee(){
    System.out.println("\nIngrese el nombre del empleado:");
    String nameEm = sc.nextLine();
    System.out.println("\nIngrese la id del empleado:");
    int idEm = sc.nextInt();
    System.out.println("\nIngrese el salario del empleado:");
    int salaryEm = sc.nextInt();
    System.out.println("\n¿El empleado esta activo?\n(1) Si. (2) No.");
    int booleanCheck = sc.nextInt();
    boolean statuesEm = (booleanCheck == 1) ? true : false;
    System.out.println("\nEl empleado es: \n(1) Jugador. (2) Coach");
    int employee = sc.nextInt();
    if (employee == 1) {
      System.out.println("\nIngrese el dorsal del jugador:");
      int dorsalPl = sc.nextInt();
      System.out.println("\nIngrese la cantidad de goles anotados:");
      int amountGoal = sc.nextInt();
      System.out.println("\nIngrese el promedio del jugador:");
      double averagePl = sc.nextDouble();
      System.out.println("\nIngrese la posicion del jugador:\n");
      Position[] allPosition = app.getAllPosition();
      app.printAllPosition(allPosition);
      int positionChoice = sc.nextInt() - 1;
      Position positionPl = allPosition[positionChoice];
      if (app.addEmployee(nameEm, idEm, salaryEm, statuesEm, dorsalPl, amountGoal, averagePl, positionPl)) {
        System.out.println("\nSe añadio correctamente.");
      } else {
        System.out.println("\nNo se añadio correctamente");
      }
    } else {
      System.out.println("\nIngrese el año de experiencia:");
      int yearExp = sc.nextInt();
      System.out.println("\nTu coach es:\n(1) Principal. (2) Asistente.");
      int coachChoice = sc.nextInt();
      if (coachChoice == 1) {
        System.out.println("\nIngrese la cantidad de equipos dirigidos:");
        int amountTeam = sc.nextInt();
        System.out.println("\nIngrese la cantidad de campeonatos ganados:");
        int amountWinner = sc.nextInt();
        if (app.addEmployee(nameEm, idEm, salaryEm, statuesEm, yearExp, amountTeam, amountWinner)) {
          System.out.println("\nSe añadio correctamente.");
        } else {
          System.out.println("\nNo se añadio correctamente");
        }
      } else {
        System.out.println("\n¿Fuiste jugador profesional?\n(1) Si. (2) No.");
        int asisCoach = sc.nextInt();
        boolean profesionalPlayer = (asisCoach == 1) ? true : false;
        System.out.println("\nIngrese su experticia:\n");
        Expertice[] allExpertice = app.getAllExpertice();
        app.printAllExpertice(allExpertice);
        int experticeChoice = sc.nextInt() - 1;
        Expertice expertice = allExpertice[experticeChoice];
        if (app.addEmployee(nameEm, idEm, salaryEm, statuesEm, yearExp, profesionalPlayer, expertice)) {
          System.out.println("\nSe añadio correctamente.");
        } else {
          System.out.println("\nNo se añadio correctamente");
        }
      }
    }
  }

  public void eraseEmployee(){
    app.showInfoEmployee();
    System.out.println("\nIngrese el nombre del empleado a despedir: ");
    String nameEm = sc.nextLine();
    if (app.eraseEmployee(nameEm)) {
      System.out.println("\nDespedido correctamente");
    } else {
      System.out.println("\nNo se encontro el empleado");
    }
  }

  public int readOption(Scanner sc){
    int choice = sc.nextInt();
    sc.nextLine();
    return choice;
  }

  public void editTeams(){
    app.printTeam();
    System.out.println("\nIngrese el nombre del equipo a editar: ");
    String teamToEdit = sc.nextLine();
  }
}
