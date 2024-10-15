public class Numeros implements Comparable<Numeros> {
    private int numero;

    public Numeros(int numeros) {
        this.numero = numeros;
    }

    public int getNumeros() {
        return numero;
    }

    public void setNumeros(int numero) {
        this.numero = numero;
    }

    @Override
    public int compareTo(Numeros outroNumero) {
        return Integer.compare(this.numero, outroNumero.getNumeros());
    }

    @Override
    public String toString() {
        return String.valueOf(numero);
    }
}
