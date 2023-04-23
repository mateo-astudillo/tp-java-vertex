package abm;

import utils.Console;
import abm.Vertex;

public class App {

	public static void main(String[] args) {
    Vertex[] arrayVertex = new Vertex[5];
    String option = "";
    String name = "";
    int number = 0;
    while (option != "salir") {
      Console.println(
        "\n" + 
        " 1 - Chequear si el vértice existe (por el nombre)\n" +
        " 2 - Chequear si el arreglo está vacío\n" +
        " 3 - Insertar un nuevo vértice (nombre y valor)\n" +
        " 4 - Actualizar el número de un vértice (por el nombre)\n" +
        " 5 - Eliminar un vértice del arreglo (por el nombre)\n" +
        " 6 - Ver un vértice (por el nombre)\n" +
        " 7 - Ver todos los vértices\n" +
        " 8 - Salir"
      );
      Console.print(" Opción\n > ");
      option = Console.getString();
      Console.println("");
      switch (option) {
        case "1":
          Console.print(" Inserte el nombre de vértice\n > ");
          name = Console.getString();
          if (App.checkVertex(arrayVertex, name))
            Console.println(" El vértice " + name + " existe");
          else
            Console.println(" El vértice " + name + " no existe");
          break;
        case "2":
          if (App.isEmpty(arrayVertex))
            Console.println(" El arreglo está vacío");
          else
            Console.println(" El arreglo tiene al menos un vértice");
          break;
        case "3":
          Console.print(" Inserte el nombre de vértice\n > ");
          name = Console.getString();
          Console.println(" Inserte el valor del vértice\n > ");
          number = Console.getInt(-100, 100);
          if (App.addVertex(arrayVertex, name, number))
            Console.println(" Vértice " + name + " añadido correctamente");
          else
            Console.println(" No se ha podido añadir el vértice " + name);
          break;
        case "4":
          Console.print(" Inserte el nombre de vértice\n > ");
          name = Console.getString();
          Console.print(" Inserte el valor de vértice\n > ");
          number = Console.getInt(-100, 100);
          if (App.updateNumber(arrayVertex, name, number))
            Console.println(" Vértice " + name + " actualizado con " + number);
          else
            Console.println(" No se ha podido actualizar el vértice " + name);
          break;
        case "5":
          Console.print(" Inserte el nombre de vértice\n > ");
          name = Console.getString();
          if (App.deleteVertex(arrayVertex, name))
            Console.println(" Vértice " + name + " eliminado");
          else
            Console.println(" No se ha podido eliminar el vértice " + name);
          break;
        case "6":
          Console.print(" Inserte el nombre de vértice\n > ");
          name = Console.getString();
          if (!App.showVertex(arrayVertex, name))
            Console.println(" No se ha podido encontrar el vértice " + name);
          break;
        case "7":
          App.showAllVertex(arrayVertex);
          break;
        case "8":
          option = "salir";
          break;
        default:
          Console.println(" Vuelva a elegir una opción");
          break;
      }
    }
  }

  // Check_Vertice
  public static boolean checkVertex(Vertex[] av, String name) {
    for (int i = 0; i < av.length; i++) {
      if (av[i] == null)
        continue;
      if (av[i].getName().equals(name))
        return true;
    }
    return false;
  }

  // isEmpty_Vertices
  public static boolean isEmpty(Vertex[] av) {
    for (int i = 0; i < av.length; i++) {
      if (av[i] != null)
        return false;
    }
    return true;
  }

  // Insert_Vertice
  public static boolean addVertex(Vertex av[], String name, int number) {
    for (int i = 0; i < av.length; i++) {
      if (av[i] == null) {
        av[i] = new Vertex();
        av[i].setName(name);
        av[i].setNumber(number);
        return true;
      }
    } 
    return false;
  }

  // Update_Vertice
  public static boolean updateNumber(Vertex av[], String name, int number) {
    for (int i = 0; i < av.length; i++) {
      if (av[i] == null)
        continue;
      if (av[i].getName().equals(name)) {
        av[i].setNumber(number);
        return true;
      }
    }
    return false;
  }

  // Delete_Vertice
  public static boolean deleteVertex(Vertex av[], String name) {
    for (int i = 0; i < av.length; i++) {
      if (av[i] == null)
        continue;
      if (av[i].getName().equals(name)) {
        av[i] = null;
        return true;
      }
    }
    return false;
  }

  public static boolean showVertex(Vertex[] av, String name) {
    for (int i = 0; i < av.length; i++) {
      if (av[i] == null)
        continue;
      if (av[i].getName().equals(name)) {
        Console.println(" Name " + av[i].getName() + "\n Number " + av[i].getNumber());
        return true;
      }
    }
    return false;
  }

  public static void showAllVertex(Vertex[] av) {
    for (int i = 0; i < av.length; i++) {
      if (av[i] == null)
        continue;
      Console.println(" Name " + av[i].getName() + " number " + av[i].getNumber());
    }
  }
}
