package src/program; //reflects file location

public class Start {
  private String[] CLArgs; //Command Line Arguments
  private Start(String[] args) {
    CLArgs = args; //set CLArgs to the input of the constructor
  }
  public static Start create(String[] args) { //factory constructor
    return new Start(args); //call the constructer and return the value on behalf of the caller
  }
  public void start() { //create a public but not static way to start the program
    //todo
  }
}
