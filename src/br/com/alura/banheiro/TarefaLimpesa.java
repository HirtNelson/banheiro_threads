package br.com.alura.banheiro;

public class TarefaLimpesa implements Runnable{

    private Banheiro banheiro;


    public TarefaLimpesa(Banheiro banheiro) {
        this.banheiro = banheiro;
    }

    @Override
    public void run() {
        while(true) {
            this.banheiro.limpa();
            try {
                Thread.sleep(15000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }


    }
}
