public class Numeros {
    int numero;

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
    public String toString() {
        return String.valueOf(numero);
    }

}
