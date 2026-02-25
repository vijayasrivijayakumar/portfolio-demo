class Copycons{
    String registerNumber;
    String name;


    Copycons(String registerNumber, String name) {
        this.registerNumber = registerNumber;
        this.name = name;
    }

    
      Copycons(Copycons s) {
        this.registerNumber = s.registerNumber;
        this.name = s.name;
    }

    void display() {
        System.out.println("Register Number: " + registerNumber);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
    
        Copycons s1 = new  Copycons("CSE2025A001", "Viji");

        
          Copycons s2 = new  Copycons(s1);

        System.out.println("Original Student:");
        s1.display();

        System.out.println("\nCopied Student:");
        s2.display();
    }
}

