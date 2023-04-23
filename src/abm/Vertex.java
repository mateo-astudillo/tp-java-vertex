package abm;

public class Vertex {
  private int id;
  private int number;
  private char letter;
  private String name;

  public Vertex() {

  }

  public int getId() {
    return this.id;
  }

  public int getNumber() {
    return this.number;
  }

  public char getLetter() {
    return this.letter;
  }

  public String getName() {
    return this.name;
  }

  public void setId (int id) {
    this.id = id;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  public void setLetter(char letter) {
    this.letter = letter;
  }

  public void setName(String name) {
    this.name = name;
  }
}
