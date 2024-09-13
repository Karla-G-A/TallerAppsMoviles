public class Cabeza {
    private String colorDeOjos = "Azules";
    private boolean tieneCabello = true;

    public void mostrarInfo() {
        String tipoDeCabello = this.tieneCabello ? "tiene cabello" : "sin cabello";
        System.out.println("Cabeza con ojos " + this.colorDeOjos + " y " + tipoDeCabello);
    }
}
