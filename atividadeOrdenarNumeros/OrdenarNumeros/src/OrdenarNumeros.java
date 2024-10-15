import java.util.ArrayList;
import java.util.List;
import java.util.Collections;


public class OrdenarNumeros {
   

    private List<Numeros> listanumeros;

    public  OrdenarNumeros(){
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

    public void ordenarAscendente() {
        Collections.sort(listanumeros);
    }

    public void ordenarDescendente() {
        Collections.sort(listanumeros, Collections.reverseOrder());
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
        
        
        OrdenarNumeros ordenarNumeros = new OrdenarNumeros();

        ordenarNumeros.adicionarnumeros(5);
        ordenarNumeros.adicionarnumeros(3);
        ordenarNumeros.adicionarnumeros(8);
        ordenarNumeros.adicionarnumeros(6);

        System.out.println("Nossa lista de numeros");
        System.out.println(ordenarNumeros.listanumeros);
        
        System.out.println("A soma dos numeros");
        System.out.println(ordenarNumeros.calcularValorNumeros());

        System.out.println("Mostrando qual é o menor numero");
        System.out.println(ordenarNumeros.encontrarMenornumero());

        System.out.println("Mostrando qual é o maior numero");
        System.out.println(ordenarNumeros.encontrarMaiorrnumero());


        ordenarNumeros.ordenarAscendente();
    System.out.println("Números em ordem ascendente:");
    ordenarNumeros.exibirNumeros();

    ordenarNumeros.ordenarDescendente();
    System.out.println("Números em ordem descendente:");
    ordenarNumeros.exibirNumeros();



    }
}
