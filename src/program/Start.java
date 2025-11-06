package src/program; //reflects file location
import java.util.Optional; //pull the Optional class into the golbal scope
import java.util.Scanner; //a wrapper class to make interacting with input stream easier
import java.text.CharacterIterator; //iterator class
import java.text.StringCharacterIterator; //class to make string into char iterator
//to iterator method

public class Start {
  private String[] CLArgs; //Command Line Arguments
  private Start(String[] args) {
    CLArgs = args; //set CLArgs to the input of the constructor
  }
  public static Start create(String[] args) { //factory constructor
    return new Start(args); //call the constructer and return the value on behalf of the caller
  }
  public void start() { //create a public but not static way to start the program
    while (true) { //do an infinite loop
      System.out.println("-----\ntype an expresion to get it evaluated");//put 5 slashes as divider and then put a
      //newline \n and then ask for an expresion
      var maybeInput = this.getInput(); //get the optional value from getInput and 
      //we use this because getInput is not static
      if (!maybeInput.isPresent()) { //check if theres no input
        System.err.println("No input detected aborting"); //print to the error stream
        return; //return from start
      }
      
      var input = maybeInput.get(); //now safe to get input because we checked for it not being present
      var maybeFinalCalc = this.calculate(new StringCharacterIterator(input)); //make a charactorIterator to pass
      if (!maybeFinalCalc.isPresent()) { //checks if not present
        System.out.println("\"" + input  + "\"" + " is not a valid expresion"); //tells user expresion was not valid
        continue; //pass to next iteratation
      }
      System.out.println(maybeFinalCalc.get()); //print the result if seccesfull (bad spelling)
    }
  }
  private Optional<String> getInput() {
    Scanner inputStream = new Scanner(System.in); //pass in input stream to the scanner to wrap it around
    if (!inputStream.hasNextLine()) { //checks if theres no line to read
      return Optional.empty(); //return an empty option so input reading failed
    }
    return Optional.of(inputStream.nextLine()); //theres never an exception now and the caller must handle 
    //case with no string
  }
  private Optional<String> calculate(CharacterIterator expr) { //take an iterator to allow recursiveness
    return Optional.empty(); //Todo!();
  }
}
