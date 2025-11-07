package src/program; //reflects the file location

public class Start {
  private Start() {} //define a private Start constructer
  public static Start create() { //define a factory constructer for Start
    return new Start(); //returns a new start
  }
  public void start() { //define a public start function to start the program
    var scanner = new Scanner(System.in); //make a new scanner and have it read input
    System.out.println("please select a base for the number you input press enter for default(10)"); //ask for a default base
    while (base == 0)
    while (!scanner.hasNextByte) {
      if (!scanner.hasNextLine) {
        System.err.println("error reading input please try again later");
        return;
      }
      System.out.println("please type a valid base");
      scanner.nextByte();
    }
    base = scanner.nextByte();
    if (base < 2 || base > 36) {
      base = 0;
      continue;
    }
  }
}
