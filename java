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
    return string.anopublicacao;
}
public void settitulo(string titulo){
     this.titulo=titulo;
}
public void setautor(string autor){
    this.autor=autor;
    }
public void setanopublicacao(string anopublicacao){
    this.anopublicacao=anopublicacao;
}
public void setdisponivel(string disponivel){
    this.disponivel=disponivel){
    }
public void emprestar(){
    if(this.disponivel){
        this.dispononivel=false;
        system.out.printhn("emprestimo com sucesso"!);
    }else{
        sytem.out.println("livro indisponivel!")
            }
}
public void devolver (){
    if(!this.disponivel){
        this.disponivel=true;
        system.out.println("devolvido com sucesso"!);
    }else{
        system.out.println("erro ao devolver");
    }
}
    public abstract void exiberdetalhes();
    private arraylist<livro> linhasemprerstimo; 
    [=new arraylist<>();]

    this.livrosemprestados=new arraylist<>();

public inteface itembiblioteca {
    boolean estadoisdisonivel();

package br.com.minhaclasse.contrato;
    public interface biblioteca{
        boolean isdisponivel();
        void realizaremprestimo();
        string gettitlo();
    }
package br.com.minhaclasse.modelo;
    public abstract class livro{
        string titulo;
        private string autor;
        private in anopublicacao;
        private boolean disponivel;

public livro(string titulo,string autor,int anopublicacao){
    this.autor=titulo.
    this.autor=autor;
    this.anopublicacao=anopublicacao;
}   
        public boolean isdisponivel(){
            return disponivel;
        }
        package br.com.minhaclasse.modelo;
    import
        br.com.minhaclasse.contrato.itembiblioteca;
    public class livrofisico extend livro implementos itembiblioteca{
        public livrofisico(string titulo,string autor,int anopublicacao,string localizacaopratileira{
                           this.localizacaoprateleira=localizacao;
        }
        package br.com.minhaclasse.modelo
            import br.com.minhaclasse.contrato.itembiblioteca;
        public class ebook extends livro implements itembiblioteca{
            private string formato;
            public ebook(string titulo,string autor,int anopublicacao,double tamanho,string formato){
                super(titulo,autor,anopublicacao);
                this.formato=formato;
            }
            public void exibirdetalhes(){
                system.out.println("ebook:"+gettitulo());
            }
        }
        package br.com.minhaclasse.modelo;
        import java.util.arraylist;
        public class usuario{
            public string nome;
            public string idusuario;
        public usuario(string nome, string id){
            this.nome=nome;
            this.idusuario=id;
        }
            package br.com.minhaclasse.servico;
        import java.util.arraylist;
        public classe biblioteca{
            private string nome;
         public biblioteca{
             private string nome;
         }
        }
        publick biblioteca(string nome){
            import
            br.com.minhaclasse.servico.biblioteca;
        public class.main{
            public static void main(string args){
                biblioteca b=new
                    biblioteca("biblioteca central");
            }
        }
                
                
                
                super(titulo,autor,anopublicacao);
                this.formato=formato;
                    }

