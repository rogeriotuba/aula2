package sintaxebasica;

class Teste {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            System.out.println(i);
        }
        int i = 15;
        System.out.println(i);
    }
}


/*

Classes
	fun��es e metodos



S�o sinonimos bloco,metodo,fun��o mostrado entre 

Local

Escopo variaveis - Local - Variavel utilizada dentro de uma chave 
ou fun��o(metodo)


public void m1() { // in�cio do bloco do m�todo
    int x = 10; // vari�vel local do m�todo

    if (x >= 10) { // in�cio do bloco do if
        int y = 50; // vari�vel local do if
        System.out.print(y);

    } // fim do bloco do if

} // fim do bloco do m�todo

Instancia ou Classe ou atributo ou membro
Escopo variaveis - Instancia ou Objeto ou Classe - Utilizada dentro
da classe.
	
class Pessoa {
    static int id = 1;
}

class Teste {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        System.out.println(p.id); // acessando pelo objeto
        System.out.println(Pessoa.id); // acessando direto pela
                                       // classe
    }
}

Podemos declarar vari�veis que s�o compartilhadas por todas as inst�ncias de uma classe usando a palavra chave static. Essas vari�veis est�o no escopo da classe, e 
l� ficar�o enquanto a classe estiver carregada na mem�ria
		

class Pessoa {
    static int id = 1;
}

class Teste {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        System.out.println(p.id); // acessando pelo objeto
        System.out.println(Pessoa.id); // acessando direto pela
                                       // classe
    }
}	
	
Nao e permitido:
	2 variaveis locais com o mesmo nome nao pode
	2 variaveis e uma instancia e outra membro nao pode
	
Permitido
	combinar variavel de instancia com variavel local
	combinar variavel estatica com variavel local
	

*/

/*
 
 
 */




