import java.util.Scanner;

public class Biblioteca {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("INSIRA ABAIXO A QUANTIDADE DE PESSOAS NO SITE : ");
		int n = sc.nextInt();
	
		//atributos
		Pessoa infPessoa[] = new Pessoa[n];
		Livro infLivro[] = new Livro[3];// digamos que já exista 3 livros no Banco de Dados desse meu comercio
		int opcao,codLivro,opLivro,pag;
		
		// preenchimento das informações do cliente
		System.out.println("PREENCHA AS INFORMAÇÕES ABAIXO : ");
		for(int i=0;i<n;i++) {
			System.out.print("NOME :");
			String nome = sc.nextLine();
			sc.next();// limpar o buff
			System.out.print("IDADE :");
			int idade = sc.nextInt();
			System.out.print("SEXO H(homem) // M(mulher) : ");
			char sexo = sc.next().charAt(0);
		
			infPessoa[i] = new Pessoa(nome,idade,sexo);
				
		}
		
		// dados dos livros existentes
		
		infLivro[0] = new Livro("Aprendendo Java","Jose da Silva",300);
		infLivro[1] = new Livro("POO para iniciantes","Pedro Paulo",500);
		infLivro[2] = new Livro("JAVA Avançado","Maria Candido",800);
		
		
		do {
			System.out.println("-----MENU-----");
			System.out.println("1- Ver Livros da Biblioteca ");
			System.out.println("2- Inserir Codigo do Livro");
			System.out.println("0 -Finalizar Operação");
			System.out.print("Opção : "); 
			opcao = sc.nextInt();
			System.out.println();
			
			switch(opcao) {
			
			case 1 :
				System.out.println("LIVRO : Aprendendo Java // PAGINAS TOTAIS : 300 --> CODIGO DE ACESSO : 0");
				System.out.println("LIVRO : POO para iniciantes // PAGINAS TOTAIS 500 --> CODIGO DE ACESSO : 1");
				System.out.println("LIVRO : JAVA Avançado // PAGINAS TOTAIS 800 --> CODIGO DE ACESSO : 2");
				break;
			
			case 2 :
				System.out.println("INSIRA O CODIGO DO LIVRO : ");
				codLivro = sc.nextInt();
				infLivro[codLivro].abrir();
				System.out.println("LIVRO ABERTO");
				System.out.println(infLivro[codLivro].detalhes());
				System.out.println();
				
				do {
					System.out.println("LIVRO : "+infLivro[codLivro].getTitulo());
					System.out.println("1-Folhear");
					System.out.println("2-Avançar Pagina");
					System.out.println("3-Voltar Pagina");
					System.out.println("0-Fechar Livro");
					System.out.print("Opção : "); 
					opLivro=sc.nextInt();
					
					System.out.println();
					switch(opLivro){
					
					case 1 :
						System.out.println("INSIRA A PAGINA QUE QUEIRA LER : ");
						pag = sc.nextInt();
						infLivro[codLivro].folhear(pag);
						System.out.println(infLivro[codLivro].pagLivro());
						break;
					
						
					case 2 :
						infLivro[codLivro].avancarPag();
						System.out.println(infLivro[codLivro].pagLivro());
						break;
						
					case 3 :
						infLivro[codLivro].voltarPag();
						System.out.println(infLivro[codLivro].pagLivro());
					}
					
					
				}while(opLivro!=0);
				infLivro[codLivro].fehcar();
				System.out.println("LIVRO FECHADO. VOLTANDO PARA O MENU INICIAL....");
			}
			
		
		}while(opcao!=0);
		
		System.out.println("OBRIGADO POR UTILIZAR OS NOSSOS SERVIÇOS!!!");
		

	}

}