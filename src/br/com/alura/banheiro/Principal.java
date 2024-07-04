package br.com.alura.banheiro;

public class Principal {
    public static void main(String[] args) {

        Banheiro banheiro = new Banheiro();

        Thread convidado1 = new Thread(new TarefaNumero1(banheiro), "João");
        Thread convidado2 = new Thread(new TarefaNumero2(banheiro), "Pedro");
        Thread limpesa = new Thread(new TarefaLimpesa(banheiro), "Serviço de Limpesa.");
        Thread convidado3 = new Thread(new TarefaNumero1(banheiro), "Joey");
        Thread convidado4 = new Thread(new TarefaNumero2(banheiro), "Dany");

        convidado1.start();
        convidado2.start();
        limpesa.setDaemon(true);
        limpesa.start();
        convidado3.start();
        convidado4.start();




    }

}
