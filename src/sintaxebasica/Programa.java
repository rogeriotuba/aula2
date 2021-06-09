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
	funções e metodos



São sinonimos bloco,metodo,função mostrado entre 

Local

Escopo variaveis - Local - Variavel utilizada dentro de uma chave 
ou função(metodo)


public void m1() { // início do bloco do método
    int x = 10; // variável local do método

    if (x >= 10) { // início do bloco do if
        int y = 50; // variável local do if
        System.out.print(y);

    } // fim do bloco do if

} // fim do bloco do método

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

Podemos declarar variáveis que são compartilhadas por todas as instâncias de uma classe usando a palavra chave static. Essas variáveis estão no escopo da classe, e 
lá ficarão enquanto a classe estiver carregada na memória
		

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




