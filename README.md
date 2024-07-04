Projeto Banheiro Sincronizado
Este projeto demonstra o uso de threads e sincronização em Java para simular o uso de um banheiro por várias pessoas. O objetivo é garantir que apenas uma pessoa use o banheiro por vez e que ele seja limpo regularmente.

Descrição
O projeto consiste em uma aplicação que simula várias pessoas tentando usar um banheiro para necessidades rápidas (número 1) e demoradas (número 2). Há também uma thread dedicada para a limpeza do banheiro, garantindo que ele esteja sempre limpo antes de ser usado novamente.

Estrutura do Projeto
Banheiro: Classe principal que contém os métodos sincronizados para usar o banheiro e limpá-lo.
TarefaNumero1: Implementa a interface Runnable para simular uma pessoa fazendo número 1.
TarefaNumero2: Implementa a interface Runnable para simular uma pessoa fazendo número 2.
TarefaLimpesa: Implementa a interface Runnable para simular o serviço de limpeza do banheiro.
Principal: Classe que inicializa as threads e inicia a simulação.
