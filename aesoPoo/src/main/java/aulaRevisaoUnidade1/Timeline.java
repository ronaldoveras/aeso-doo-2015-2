package aulaRevisaoUnidade1;

public class Timeline {

	private Post[] postagens = new Post[50];
	
	public void setPostagens(Post[] postagens) {
		this.postagens = postagens;
	}
	
	public Post[] getPostagens() {
		return postagens;
	}
	
	void imprimirPostagens(){
		for(Post p : postagens){
			//Post p = postagens[i];
			if(p != null){
				
				System.out.println("Texto : " + p.getTexto() + " - público: " 
						+ p.isPublico() + " - Quantidade de likes: " + p.getQtdLikes() );
			}
		}
	}
}
