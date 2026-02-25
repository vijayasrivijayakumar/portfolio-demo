class Viji
{
    int block;
    int floor;
    String name;

    
Viji() {
        this.block = 2;
        this.floor = 3;
        this.name = "A.P.J. Auditorium";
    }

    
    void display() {
        System.out.println("Block : " + block);
        System.out.println("Floor : " + floor);
        System.out.println("Name  : " + name);
    }

 public static void main(String[] args) {
        Viji a = new Viji(); 
        a.display(); 
    }
}

    