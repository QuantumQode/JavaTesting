public class SuperChar {
    static final char zero; // line n2
    private transient final char one = '1'; // line n3  
  
    public SuperChar() {    
      System.out.print("'" + zero + one + "'"); 
    }
  
    public static void main(String... args) {
      new SuperChar();
    }
  }