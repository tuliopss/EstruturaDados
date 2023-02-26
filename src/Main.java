import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);

        MenuPrincipal menuPrincipal = new MenuPrincipal();
        MetodosVetor metodosVetor = new MetodosVetor();
        ListaLigada lista = new ListaLigada();

        menuPrincipal.mostrarMenu();
        Vetor v1 = metodosVetor.criar();
        int opcaovetor;
        int opcao = prompt.nextInt();

        //Mostrar menu
        if (opcao == 1) {
            do {
                System.out.println("Selecione uma opção:");
                metodosVetor.mostrarMenu();

                opcaovetor = prompt.nextInt();


                switch (opcaovetor) {
                    case 1:
                        System.out.println("Informe o dado a ser inserido");
                        int v;
                        v = prompt.nextInt();
                        metodosVetor.inserirDado(v1, v);
                        break;


                    case 2:
                        System.out.println("Informe o indice que deseja alterar");
                        int indice = prompt.nextInt();

                        System.out.println("Informe o valor que deseja alterar");
                        int numeroAlterar = prompt.nextInt();

                        metodosVetor.alterarDado(v1, indice, numeroAlterar);

                        break;

                    case 3:
                        System.out.println("Informe o valor que deseja pesquisar");
                        int numeroPesquisar = prompt.nextInt();
                        metodosVetor.pesquisarDado(v1, numeroPesquisar);
                        break;

                    case 4:
                        metodosVetor.exibirDados(v1);
                        break;

                    case 5:
                        menuPrincipal.mostrarMenu();
                        break;

                    default:
                        System.out.println("Valor inválido");
                }
            } while (opcaovetor < 5);
        }
            else if (opcao == 2) {
                while (opcao != 6) {
                    System.out.println("     Lista");
                    System.out.println("1 - Inserir dado");
                    System.out.println("2 - Alterar dado");
                    System.out.println("3 - Excluir dado");
                    System.out.println("4 - Pesquisar dado");
                    System.out.println("5 - Mostrar dados");
                    System.out.println("6 - Voltar");
                    System.out.print("Escolha uma opção: ");
                    opcao = prompt.nextInt();
                    switch (opcao) {
                        case 1:
                            System.out.print("Digite um inteiro para inserir na lista: ");
                            int valor = prompt.nextInt();
                            lista.inserir(valor);
                            break;
                        case 2:
                            System.out.print("Digite a posição do elemento a ser substituído: ");
                            int posicaoSub = prompt.nextInt();
                            System.out.print("Digite o novo valor: ");
                            int novoValor = prompt.nextInt();
                            lista.substituir(posicaoSub, novoValor);
                            break;
                        case 3:
                            System.out.print("Digite a posição do elemento a ser excluído");
                            int posicaoExcl = prompt.nextInt();
                            lista.excluir(posicaoExcl);
                            break;

                        case 4:
                            System.out.print("Digite um número para buscar na lista: ");
                            int numBusca = prompt.nextInt();
                            int posicaoNum = lista.buscar(numBusca);
                            if (posicaoNum == -1) {
                                System.out.println("O número não está na lista.");
                            } else {
                                System.out.println("O número está na posição " + posicaoNum + " da lista.");
                            }
                            break;
                        case 5:
                            lista.mostrar();
                            break;

                        case 6:
                            menuPrincipal.mostrarMenu();
                            break;

                        default:
                            System.out.println("Opção inválida. Tente novamente.");
                    }
                    System.out.println();
                }

            }
        }


    //TESTANDO OS MÉTODOS
//        metodosVetor.inserirDado(v1, 2);
//        metodosVetor.inserirDado(v1, 3);
//        metodosVetor.inserirDado(v1, 4);
//        metodosVetor.inserirDado(v1, 5);
//        //metodosVetor.exibirDado(v1);
//        metodosVetor.alterarDado(v1, 2, 1);
//
//        //metodosVetor.excluirDado(v1, 5);
//        metodosVetor.exibirDados(v1);
//        metodosVetor.pesquisarDado(v1, 2);


    }
