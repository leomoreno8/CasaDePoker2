////////// Casa de Poker //////////
//// Tem um caixa (financeiro)
//// Tem Mesas
//// Tem Torneios
//// Tem Funcionários
//// Tem Ranking
//// Tem Participantes (Clientes)
//
// Funcionários podem ser
// -  Dealers
// -  Consumo (Garçom, cozinheiro, caixa)
//
// Clientes podem
// -  Consumir (comprar comidas e bebidas)
// -  Jogar (participar dos torneios)
//
// Torneio é criado com alguns parâmetros
// -  Quantidade de mesas (Iniciando as mesas. 2 mesas -> inicia duas mesas, que também possui parâmetros)
// -  Quantidade de Participantes (Com listas de participantes também)
// -  Inscrição (Entrada mínima - BuyIn)
// -  Premiação
// -  Pontos para o Ranking
// -  Tempo (Definirá a velocidade do torneio. Se as apostas mínimas irão subir mais rápido, para terminar logo, etc)
// -  Quantidade de Re-buys permitidos (entrar novamente)
//
// As mesas são iniciadas com
// -  Número de jogadores na mesa (E os nomes dos jogadores em cada mesa, também passando seu número de vitórias e posição no ranking, para os demais participantes da mesa ter conhecimento)
// -  Dealer (nome do funcionário)
// -  Quantidade inicial de fichas por jogador
//
// Durante o torneio, os participantes poderão solicitar comidas e bebidas para os garçons, que também serão funcionários
// Conforme as apostas forem acontecendo, quando o participante chegar a ZERO FICHAS, ele poderá escolher o re-buy ou desistir do torneio. Essa escolha será aleatória. Máximo de re-buys definido na criação do torneio.
// Assim que a quantidade de participantes na mesa for diminuindo, o sistema irá verificar se há a possibilidade de juntar as mesas. Se sim, a mesa com menor número de participantes é FECHADA e os participantes que estavam nessa mesa se juntam a outra mesa com espaço.
// Isso acontecerá, até sobrar uma única pessoa, o vencedor.
// O vencedor receberá os pontos de ranking que foi definido na criação do torneio. Segunda e terceira colocação também recebem pontos.
// O excesso de dinheiro arrecadado (Inscrições + Re-buys - Premiação) será adicionado ao caixa da Casa de Poker, assim como a consumação de comes e bebes no local.
// O ranking será por pontuação. O jogador poderá acumular pontos durante vários torneios, subindo de colocação no ranking geral.
//
// Eu pensei em fazer este projeto utilizando um outro modelo, um padrão de projeto utilizado na disciplina de Padrões de Projeto, mas não é nessa estrutura de Model, Service e Repository, então creio que não seria bom.
// Não consegui desenvolver este projeto, principalmente por causa da sintaxe e estrutura. Não tive muitos exemplos para me basear. Outros colegas de turma tiveram a mesma dificuldade.
// Creio que apenas quem já sabia da sintaxe e estrutura, que já sabia fazer, conseguiu fazer com uma certa maestria.
// O conceito e a lógica vai certinho, por isso estou escrevendo isso, mas não sei como colocar isto em forma de código.
// Na disciplina de Padrões de Projeto, também em java, graças aos exemplos, eu consigo desenvolver várias soluções de diversos casos de uso em minutos, em diferentes design patterns, mas aqui, eu realmente travei.
// Se isso não atingir a nota que preciso (1,6 na média), se houver outro método avaliativo, agradeço e farei.

package com.leo.casadepoker2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CasaDePoker2Application {

    public static void main(String[] args) {
        SpringApplication.run(CasaDePoker2Application.class, args);
    }

}
