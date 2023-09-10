public class Livro implements Publicacao{

    private String titulo;
	private String autor;
	private int totPaginas;
	private int pagAtual;
	private boolean aberto;
	private String leitor;
	
	
	public Livro(String titulo,String autor,int totPaginas) {
		
		this.titulo=titulo;
		this.autor=autor;
		this.totPaginas=totPaginas;
		this.pagAtual=0;
		this.aberto=false; // o livro ta fechado

	}
	
	// getters and setters
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo=titulo;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public void setAutor(String autor) {
		this.autor=autor;
	}
	
	public int getTotpaginas() {
		return totPaginas;
	}
	public void setTotpaginas(int totPaginas) {
		this.totPaginas=totPaginas;
	}

	public int getPagAtual() {
		return pagAtual;
	}

	public void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}

	public boolean isAberto() {
		return aberto;
	}

	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}

	public String getLeitor() {
		return leitor;
	}

	public void setLeitor(String leitor) {
		this.leitor = leitor;
	}
	
	//metodos
	
	public String detalhes() {
		return "Titulo do Livro : "+this.titulo+" // Autor do Livro : "+this.autor+" // Total de Paginas : "+this.totPaginas+" // Pagina Atual : "+this.pagAtual;
		
	}
	
	public String pagLivro() {
		
		return "Pagina Atual : "+this.pagAtual;
	}

	@Override
	public void abrir() {
		this.aberto=true;
		
	}

	@Override
	public void fehcar() {
		this.aberto=false;
		
	}

	@Override
	public void folhear(int p) {
	
		if(p>totPaginas) {
			System.out.println("OPERAÇÃO NÃO REALIZADA. VERIFIQUE A QUANTIDADE TOTAL DE PAGINAS");
		}
		this.pagAtual=p; 
		
	}

	@Override
	public void avancarPag() {
		this.pagAtual++;
		
	}

	@Override
	public void voltarPag() {
		this.pagAtual--;
		
	}

}
