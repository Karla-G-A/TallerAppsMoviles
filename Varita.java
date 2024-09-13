public class Varita extends Outfit {
    private String material = "Madera de roble";

    @Override
    public String getNombre() {
        return "Varita de " + this.material;
    }
}
