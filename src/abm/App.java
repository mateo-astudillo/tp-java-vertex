package abm;

import utils.Console;
import abm.Vertex;

public class App {

	public static void main(String[] args) {
    System.out.println(" Start Vertexs!");
    Vertex[] arrayVertex = new Vertex[5];

    App.addVertex(arrayVertex);
    App.addVertex(arrayVertex);
    App.addVertex(arrayVertex);
    //App.deleteVertex(arrayVertex, 3);
    App.editVertex(arrayVertex, 0);
    App.editVertex(arrayVertex, 2);
    App.editVertex(arrayVertex, 1);
    for (int i = 0; i < 5; i++)
      App.showVertex(arrayVertex, i);
    App.showVertex(arrayVertex, 2);

	}

  public static boolean addVertex(Vertex av[]) {
    for (int i = 0; i < av.length; i++) {
      if (av[i] == null) {
        av[i] = new Vertex();
        av[i].setId(i);
        Console.println(" Vertex added with id: " + i); 
        return true;
      }
    } 
    Console.println("There is no place");
    return false;
  }

  public static void deleteVertex(Vertex av[], int id) {
    try {
      av[id] = null;
      Console.println(" Vertex " + id + " deleted"); 
    } catch(NullPointerException ex) {
      Console.println(" Vertex not exists");
    } catch(Exception ex) {
      Console.println(ex);
    }
  }

  public static void editVertex(Vertex av[], int id) {
    try {
      av[id].setNumber(Console.getInt(0, 100));
      av[id].setLetter(Console.getChar());
      av[id].setName(Console.getString());
      Console.println(" Vertex " + id + " edited"); 
    } catch(ArrayIndexOutOfBoundsException ex) {
      Console.println(" Vertex not exists");
    } catch(Exception ex) {
      Console.println(ex);
    }
  }

  public static void showVertex(Vertex av[], int id) {
    try {
      Console.println(" Id: " + av[id].getId()
          + "\n Number: " + av[id].getNumber()
          + "\n Letter: " + av[id].getLetter()
          + "\n Name: " + av[id].getName()
      );
    } catch(NullPointerException ex) {
      Console.println(" Vertex " + id + " not exists");
    } catch(Exception ex) {
      Console.println(ex);
    }

  }
}
