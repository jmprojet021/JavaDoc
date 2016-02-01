/*Conectar-se a um banco de dados com Java é feito de maneira elegante. Para evitar que cada banco tenha a sua própria API e conjunto de classes e métodos,
temos um único conjunto de interfaces muito bem definidas que devem ser implementadas. Esse conjunto de interfaces fica dentro do pacote java.sql e nos referiremos a ela como JDBC.*/

public class JDBCexemplo {

			 public static void main(String[] args) {
			
			 		Connection conexao = DriverMananger.getConnection("jdbc:mysql://localhost/fdsa1");
			 		System.out.println("Conectado");
			 		conexao.close();



			}	


}

/*A classe DriverManager é a responsável por se comunicar com todos os drivers que você deixou disponível. 
Para isso, invocamos o método estático getConnection com uma String que indica a qual banco desejamos nos conectar.
*/


/*
SQLexception é uma Exception do tipo checked.Lançadas por muitos métodos da API sw JDBC.
Ter cuidado para quando abrir uma conexão, fecha-la. 
*/ 


Connection con = new ConnectionFactory().getConnection();

/* O método getConnection é uma fábrica de conexões, basta invocar e criaremos uma nova conexão */ 


/* Tratamento de Exception */

/* Repare que estamos fazendo um try/catch em SQLException e relançando-a como uma RuntimeException. Fazemos isso para que o seu código que chamará a 
fábrica de conexões não fique acoplado com a API de JDBC. Toda vez que tivermos que lidar com uma SQLException, vamos relançá-las como RuntimeException. */ 

/* Poderíamos ainda criar nossa própria exceção que indicaria que ocorreu um erro dentro da nossa Factory, algo como uma ConnectionFactoryException. */

/*

Orientação a objetos resolve as grandes dores de cabeça que tínhamos na programação procedural, restringindo e centralizando responsabilidades.
Mas alguns problemas não podemos simplesmente resolver com orientação a objetos, pois não existe palavra chave para uma funcionalidade tão específica
Alguns desses pequenos problemas aparecem com tanta frequência que as pessoas desenvolvem uma solução "padrão" para ele. 
Com isso, ao nos defrontarmos com um desses problemas clássicos, podemos rapidamente implementar essa solução genérica com uma ou outra modificação,
de acordo com nossa necessidade. Essa solução padrão tem o nome de Design Pattern (Padrão de Projeto). */

/*A nossa ConnectionFactory implementa o design pattern Factory que prega o encapsulamento da construção (fabricação) de objetos complicados. */

/* Design pattern
Mas o que realmente importa são os conceitos e os diagramas que fazem desse livro independente de qualquer linguagem. Além de tudo, o livro é de leitura agradável.*/

/*Javabeans são classes que possuem o construtor sem argumentos e com métodos de acesso do tipo get e set! Mais nada! Simples, não? */












