import java.util.ArrayList;
import java.util.Scanner;

public class MetodosVetor {
    Vetor criar() {
        Vetor v1 = new Vetor();
        v1.vetor = new ArrayList<Integer>();
        return v1;
    }

    Scanner prompt = new Scanner(System.in);

    public void mostrarMenu() {
        System.out.println("------------------");
        System.out.println("1 - Inserir dado");
        System.out.println("2 - Alterar dado");
        System.out.println("3 - Pesquisar dado");
        System.out.println("4 - Mostrar dado");
        System.out.println("5 - Voltar");
        System.out.println("------------------");

    }

    Vetor inserirDado(Vetor a, int v) {

            a.valores = v;
            a.vetor.add(v);
            System.out.println("Valor " + v + " inserido com sucesso");

        return a;
    }

    Vetor exibirDados(Vetor a) {
        String txt = "vetor: ";
        //for (int i = 0; i < l.vetor.size(); i++) {
           // System.out.println(l.vetor.get(i));

        //}
        System.out.println(a.vetor);
        if(a.vetor.size() == 0) {
            System.out.println("vetor vazia");
        }
        return a;
    }

//    Vetor excluirDado(Vetor a, int numeroDeletar) {
//        for (int i = 0; i < a.vetor.size(); i++) {
//            if (a.vetor.get(i) == numeroDeletar) {
//                a.vetor.remove(a.vetor.get(i));
//            }
//        }
//        return a;
//    }

    Vetor alterarDado(Vetor a, int indice , int numeroAlterar) {
        a.vetor.set(indice, numeroAlterar);
        return a;
    }

    Vetor pesquisarDado(Vetor a, int numeroPesquisar) {
        for (int i = 0; i < a.vetor.size(); i++) {
            if (a.vetor.get(i) != numeroPesquisar) {
                System.out.println("O número " + numeroPesquisar + " não está na posição " + i + "...");
            }
           else if (a.vetor.get(i) == numeroPesquisar) {
                System.out.println("O numero " + numeroPesquisar + " existe e está na posição " + a.vetor.indexOf(numeroPesquisar));
            }
        }

        return a;

    }
}


