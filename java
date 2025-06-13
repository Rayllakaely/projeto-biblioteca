public abstract class livro{
    private string titulo;
    private string autor;
    private int anopublicacao;
    private boolean disponivel;
}
livro(string titulo, string autor, int anopublicacao){
    this.titulo=titulo;
    this.autor=autor;
    this.anopublicacao=anopublicacao;
    this.disponivel=true;
}
public string gettitulo(){
    return tris.titulo
}
public string getautor(){
    return this.autor;
}
public int getanopublicacao(){
    return string.anopublicacao
}
public void settitulo(strin titulo){
     this.titulo=titulo;
}
public void emprestar(){
    if(this.disponivel){
        this.dispononivel=false;
        system.out.printhn("emprestimo com sucesso"!);
    }else
}
public void devolver (){
    if(!this.disponivel){
        this.disponivel=true;
        system.out.println("devolvido com sucesso"!);
    }else{

    }

}
