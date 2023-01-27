public class Main {
    public static void main(String[] args) {

     Swimable[] okeanarium ={new Shark(),
             new Shark(),
             new Shark(),
             new Shark(),
             new Shark(),
             new Duck(),
             new Duck(),
             new Duck(),
             new Duck(),
             new Duck(),
             new Turtle(),
             new Turtle(),
             new Turtle(),
             new Turtle(),
             new Turtle(),};

        for (Swimable swimable : okeanarium){
            swimable.swim();
        }
    }

}