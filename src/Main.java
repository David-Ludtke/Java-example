package src; //main is included in the path src so we say the package is src I did not go over packages so
//I make this as a example

public class Main {
  private Main() {} //we force only calling main and not it's constructor.
  public static void main(String[] args) { //main function that takes an String array (command line arguments)
    var startprogram = program.Start.create(args); //create an instance of start with a factory constructer
    startprogram.start(); //call start to start the actual program
  }
}
