public class Coche {
    private int puertas;

    public Coche() {
        this.puertas = 0;
    }

    public Coche(int puertas) {
        this.puertas = puertas;
    }

    public void incrementarPuertas() {
        this.puertas ++;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }
}

