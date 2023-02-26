public class ListaLigada {



        private No primeiro;
        private int tamanho;

        public ListaLigada() {
            this.primeiro = null;
            this.tamanho = 0;
        }

        public int tamanho() {
            return this.tamanho;
        }

        public void inserir(int valor) {
            No novoNo = new No(valor);
            if (this.primeiro == null) {
                this.primeiro = novoNo;
            } else {
                No atual = this.primeiro;
                while (atual.getProximo() != null) {
                    atual = atual.getProximo();
                }
                atual.setProximo(novoNo);
            }
            this.tamanho++;
        }

        public void substituir(int posicao, int valor) {
            if (posicao < 0 || posicao >= this.tamanho) {
                throw new IndexOutOfBoundsException();
            }
            No atual = this.primeiro;
            for (int i = 0; i < posicao; i++) {
                atual = atual.getProximo();
            }
            atual.setValor(valor);
        }

        public void excluir(int posicao) {
            if (posicao < 0 || posicao >= this.tamanho) {
                throw new IndexOutOfBoundsException();
            }
            if (posicao == 0) {
                this.primeiro = this.primeiro.getProximo();
            } else {
                No atual = this.primeiro;
                for (int i = 0; i < posicao - 1; i++) {
                    atual = atual.getProximo();
                }
                atual.setProximo(atual.getProximo().getProximo());
            }
            this.tamanho--;
        }

        public int buscar(int valor) {
            No atual = this.primeiro;
            int posicao = 0;
            while (atual != null) {
                if (atual.getValor() == valor) {
                    return posicao;
                }
                atual = atual.getProximo();
                posicao++;
            }
            return -1;
        }

        public void mostrar() {
            No atual = this.primeiro;
            while (atual != null) {
                System.out.print(atual.getValor() + " ");
                atual = atual.getProximo();
            }
            System.out.println();
        }
    }


