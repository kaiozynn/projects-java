public class App {
    public static void main(String[] args) throws Exception {
        Deck dk = new Deck();
        Monstro m1 = new Monstro("Abaki", "Quando este card for destruído em batalha e enviado para o Cemitério, cada duelista sofre 500 de dano.", "Demônio", "Fogo", 4);
        Magica ma1 = new Magica("Espadas da Luz Reveladora", "Depois da ativação deste card, ele permanece no campo, mas destrua-o durante a Fase Final do 3º turno do seu oponente. Quando este card for ativado: se seu oponente controlar um monstro com a face para baixo, vire com a face para cima todos os monstros que ele controla. Enquanto este card estiver com a face para cima no campo, os monstros do seu oponente não podem declarar um ataque.");
        Armadilha a1 = new Armadilha("Cessar-Fogo", "Se um monstro com a face para baixo em Posição de Defesa ou um Monstro de Efeito estiverem no campo: coloque com a face para cima em Posição de Defesa todos os monstros que estiverem no campo com a face para baixo em Posição de Defesa (os efeitos de monstros de Virar não são ativados neste momento) e, além disso, cause 500 de dano ao seu oponente para cada Monstro de Efeito no campo.");

        // Monstro m2 = new Monstro("Caio", "Magro", "Humano", "Vento", 5);

        dk.inserir(m1);
        dk.inserir(ma1);
        dk.inserir(a1);
        // dk.trocarCarta(m1, m2);
        System.out.println(dk.getIndice());
        dk.iniciarGame();
        System.out.println(dk.getIndice());
        // dk.printAll();
    }
}
