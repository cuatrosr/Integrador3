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
      case 5:
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
    int index;
    if (teamToEdit.equalsIgnoreCase("team a")) {
      index = 0;
    } else {
      index = 1;
    }
    System.out.println("\nQue desea editar:");
    System.out.println("\n(1) Jugadores. \n(2) Coach Asistente. \n(3) Coach Principal. \n(4) Enviar Coachs a oficina. \n(5) Crear LineUp \n(6) Imprimir LineUp");
    int editChoice = sc.nextInt();
    ArrayList<Employee> employees = app.getEmployees();
    switch (editChoice) {
      case 1:
        System.out.println("\nJugadores: \n(1) Añadir. (2) Remover. (3) Enviar a vestuario.");
        int editChoice2 = sc.nextInt();
        sc.nextLine();
        int count = 0;
        if (editChoice2 == 1) {
          for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i) instanceof Player) {
              System.out.println(employees.get(i).showInfo());
              count++;
            }
          }
          if (count == 0) {
            System.out.println("\nNo hay jugadores contratados.");
          } else {
            System.out.println("\nIngrese el nombre del jugador a añadir:");
            String namePl = sc.nextLine();
            if (app.addPlayerTeam(namePl, index)) {
              System.out.println("\nAñadido correctamente");
            } else {
              System.out.println("\nNo se añadio correctamente");
            }
          }
        } else if (editChoice2 == 2) {
          Team[] teams = app.getTeams();
          Player[] players = teams[index].getPlayers();
          if (players == null) {
            System.out.println("\nNo hay jugadores en el team.");
          } else {
            for (int i = 0; i < players.length; i++) {
              if (players[i] != null) {
                System.out.println(players[i].showInfo());
              }
            }
            System.out.println("\nIngrese el nombre del jugador a eliminar:");
            String namePl = sc.nextLine();
            if (app.removePlayerTeam(namePl, index)) {
              System.out.println("\nSe removio correctamente");
            } else {
              System.out.println("\nNo se removio correctamente");
            }
          }
        } else {
          app.goToCamerino(index);
          app.printCamerino(index);
        }
        break;
      case 2:
        System.out.println("\nCoach Assis: \n(1) Añadir. (2) Remover.");
        int editChoice3 = sc.nextInt();
        sc.nextLine();
        int count2 = 0;
        if (editChoice3 == 1) {
          for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i) instanceof AssistentCoach) {
              System.out.println(employees.get(i).showInfo());
              count2++;
            }
          }
          if (count2 == 0) {
            System.out.println("\nNo hay Asistentes contratados.");
          } else {
            System.out.println("\nIngrese el nombre del asistente a añadir:");
            String namePl = sc.nextLine();
            if (app.addAssisTeam(namePl, index)) {
              System.out.println("\nAñadido correctamente");
            } else {
              System.out.println("\nNo se añadio correctamente");
            }
          }
        } else if (editChoice3 == 2) {
          Team[] teams = app.getTeams();
          AssistentCoach[] assisCoach = teams[index].getAssisCoach();
          if (assisCoach == null) {
            System.out.println("\nNo hay Asistentes en el team.");
          } else {
            for (int i = 0; i < assisCoach.length; i++) {
              if (assisCoach[i] != null) {
                System.out.println(assisCoach[i].showInfo());
              }
            }
            System.out.println("\nIngrese el nombre del asistente a eliminar:");
            String namePl = sc.nextLine();
            if (app.removeAssisTeam(namePl, index)) {
              System.out.println("\nSe removio correctamente");
            } else {
              System.out.println("\nNo se removio correctamente");
            }
          }
        }
        break;
      case 3:
        System.out.println("\nCoach Main: \n(1) Añadir. (2) Remover.");
        int editChoice4 = sc.nextInt();
        sc.nextLine();
        int count3 = 0;
        if (editChoice4 == 1) {
          for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i) instanceof MainCoach) {
              System.out.println(employees.get(i).showInfo());
              count3++;
            }
          }
          if (count3 == 0) {
            System.out.println("\nNo hay Principales contratados.");
          } else {
            System.out.println("\nIngrese el nombre del Principal a añadir:");
            String namePl = sc.nextLine();
            if (app.addMainTeam(namePl, index)) {
              System.out.println("\nAñadido correctamente");
            } else {
              System.out.println("\nNo se añadio correctamente");
            }
          }
        } else if (editChoice4 == 2) {
          Team[] teams = app.getTeams();
          MainCoach[] mainCoach = teams[index].getMainCoach();
          if (mainCoach == null) {
            System.out.println("\nNo hay Principales en el team.");
          } else {
            for (int i = 0; i < mainCoach.length; i++) {
              if (mainCoach[i] != null) {
                System.out.println(mainCoach[i].showInfo());
              }
            }
            System.out.println("\nIngrese el nombre del principal a eliminar:");
            String namePl = sc.nextLine();
            if (app.removeMainTeam(namePl, index)) {
              System.out.println("\nSe removio correctamente");
            } else {
              System.out.println("\nNo se removio correctamente");
            }
          }
        }
        break;
      case 4:
        app.goToOffice();
        app.printOffice();
        break;
      case 5:
        sc.nextLine();
        System.out.println("\nIngrese la fecha del encuentro:");
        String dateLineUp = sc.nextLine();
        app.printTactic();
        System.out.println("\nIngrese el index de la tactica:");
        int indexTactic = sc.nextInt() - 1;
        sc.nextLine();
        Tactic[] allTactic = Tactic.values();
        Tactic tactic = allTactic[indexTactic];
        System.out.println("\nIngrese su formacion en el siguiente formato (x-x-x):");
        String formationLine = sc.nextLine();
        if (app.createLineUp(index, dateLineUp, tactic, formationLine)) {
          System.out.println("\nAñadido correctamente.");
        } else {
          System.out.println("\nNo se añadio correctamente.");
        }
        break;
      case 6:
        System.out.println(app.printTeamLineUp(index));
        break;
      default:
        System.out.println("\nOpcion invalida.");
    }
  }
}
