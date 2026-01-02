class TommyVecetli {

    public static void Hit() {
        System.out.println("Hitting...");
    }

    public static void Run() {
        System.out.println("Running...");
    }

    public static void Fire() {
        System.out.println("Firing...");
    }

}

public class Class_08_RockstarGames {
    public static void main(String[] args) {

        TommyVecetli Player1 = new TommyVecetli();

        Player1.Hit();
        Player1.Run();
        Player1.Fire();
    }
}