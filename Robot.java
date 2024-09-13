public class Robot {
    private Manos manos;
    private Piernas piernas;
    private Torso torso;
    private Cabeza cabeza;

    public Robot() {
        this.manos = new Manos();
        this.piernas = new Piernas();
        this.torso = new Torso();
        this.cabeza = new Cabeza();
    }

    public void mostrarDetalles() {
        System.out.println("Detalles del Robot:");
        this.manos.mostrarInfo();
        this.piernas.mostrarInfo();
        this.torso.mostrarInfo();
        this.cabeza.mostrarInfo();
    }

    public void aplicarOutfit(Outfit outfit) {
        System.out.println("Aplicando el outfit: " + outfit.getNombre());
    }

    public static void main(String[] args) {
        Robot robot = new Robot();
        robot.mostrarDetalles();
        Outfit tunica = new Tunica();
        robot.aplicarOutfit(tunica);
    }
}
