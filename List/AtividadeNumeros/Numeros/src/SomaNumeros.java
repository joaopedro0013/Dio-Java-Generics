import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    

    private List<Numeros> listanumeros;

    public  SomaNumeros(){
        this.listanumeros = new ArrayList<>();
    }

    public void adicionarnumeros(int numeros) {
        listanumeros.add(new Numeros(numeros));
    }

    public double calcularValorNumeros() {
        double total = 0;
        for (int i = 0; i < listanumeros.size(); i++) {
            total += listanumeros.get(i).getNumeros();
        }
        return total; 
    }

    public void exibirNumeros() {
        for (int i= 0; i < listanumeros.size(); i++) {
            System.out.println(listanumeros.get(i).getNumeros());
        }
    }

    public int encontrarMenornumero() {
        if (listanumeros.isEmpty()) {
            return 0; 
        }
    
        int menornumero = listanumeros.get(0).getNumeros();
        for (int i = 0; i < listanumeros.size(); i++) {
            if (listanumeros.get(i).getNumeros() < menornumero) {
                menornumero = listanumeros.get(i).getNumeros();
            }
        }
        return menornumero;
    }

    public int encontrarMaiorrnumero() {
        if (listanumeros.isEmpty()) {
            return 0; 
        }
    
        int maiornumero = listanumeros.get(0).getNumeros();
        for (int i = 0; i < listanumeros.size(); i++) {
            if (listanumeros.get(i).getNumeros() > maiornumero) {
                maiornumero = listanumeros.get(i).getNumeros();
            }
        }
        return maiornumero;
    }




    public static void main(String[] args) throws Exception {
        
        
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarnumeros(5);
        somaNumeros.adicionarnumeros(3);
        somaNumeros.adicionarnumeros(8);
        somaNumeros.adicionarnumeros(6);

        System.out.println("Nossa lista de numeros");
        System.out.println(somaNumeros.listanumeros);
        
        System.out.println("A soma dos numeros");
        System.out.println(somaNumeros.calcularValorNumeros());

        System.out.println("Mostrando qual é o menor numero");
        System.out.println(somaNumeros.encontrarMenornumero());

        System.out.println("Mostrando qual é o maior numero");
        System.out.println(somaNumeros.encontrarMaiorrnumero());



    }
}
