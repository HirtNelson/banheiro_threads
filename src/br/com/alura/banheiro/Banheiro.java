package br.com.alura.banheiro;

public class Banheiro {


    public boolean ehSujo = true;

    public void fazNumero1() {

        String nome = Thread.currentThread().getName();

        System.out.println(nome + " Batendo na Porta...");

        synchronized (this) {

            System.out.println(nome + " Entrando no banheiro.");
            while (this.ehSujo){
                esperaLaFora(nome);
            }
            System.out.println(nome + " Fazendo coisa rápida.");

            try {
                Thread.sleep(8000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            this.ehSujo = true;

            System.out.println(nome + " Dando descarga.");
            System.out.println(nome + " Lavando a mão.");
            System.out.println(nome + " Saíndo do banheiro.");
        }
    }




    public void fazNumero2() {

        String nome = Thread.currentThread().getName();

        System.out.println(nome + " Batendo na Porta...");

        synchronized (this) {

            System.out.println(nome + " Entrando no banheiro.");

            while (this.ehSujo){
                esperaLaFora(nome);
            }
            System.out.println(nome + " Fazendo coisa demorada.");

            try {
                Thread.sleep(15000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            this.ehSujo = true;

            System.out.println(nome + " Dando descarga.");
            System.out.println(nome + " Lavando a mão.");
            System.out.println(nome + " Saíndo do banheiro.");
        }
    }

    public void limpa(){

        String nome = Thread.currentThread().getName();
        System.out.println(nome + "Batendo na porta...");
        synchronized (this) {
            System.out.println(nome + "Entrando no banheiro...");
            if(!this.ehSujo){
                System.out.println(nome + "Não está sujo, vou sair.");
                return;
            }
            System.out.println(nome + "Limpando o banheiro...");
            this.ehSujo = false;
            try {
                Thread.sleep(13000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            this.notifyAll();
            System.out.println(nome + "Saindo do banheiro...");
        }
    }

    private void esperaLaFora(String nome) {
        System.out.println(nome + ", eca banheiro está sujo...!");
        try {
            this.wait();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
