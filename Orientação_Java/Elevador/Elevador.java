//Crie uma classe denominada Elevador para armazenar as informações de um elevador dentro de um prédio. A classe deve armazenar o andar atual (térreo = 0), total de andares no prédio (desconsiderando o térreo), capacidade do elevador e quantas pessoas estão presentes nele. A classe deve também disponibilizar os seguintes métodos:


class Elevador {
    String térro;
    String inicializa; //Inicializa : que deve receber como parâmetros a capacidade do elevador e o total de andares no prédio (os elevadores sempre começam no térreo e vazio)
    int entra;   //Entra: para acrescentar uma pessoa no elevador (só deve acrescentar se ainda houver espaço)//
    //Sai: para remover uma pessoa do elevador (só deve remover se houver alguém dentro dele)
    int sai; //Sai: para remover uma pessoa do elevador (só deve remover se houver alguém dentro dele)
    int sobe; //Sobe: para subir um andar (não deve subir se já estiver no último andar)
    int desce; //Desce: para descer um andar (não deve descer se já estiver no térreo)
    String encapsular; //Encapsular todos os atributos da classe (criar os métodos set e get)
    //
    int andares;
    int capacidade;
    int pessoas;

    //Método Construtor//

    public Elevador (String térro, String inicializa, int entra, int sai, int sobe, int desce, String encapsular, int andares, int capacidade, int pessoas ) {


        this.térro = térro;
        this.inicializa = inicializa;
        this.entra = entra;
        this.sai = sai;
        this.sobe = sobe;
        this. desce = desce;
        this.encapsular = encapsular;
        this.andares = andares;
        this.capacidade = capacidade;
        this.pessoas = pessoas;


    }
        public String returnTérro() {
            return this.térro;
        }
        public String returnInicializa(){
            return this.inicializa;
        }
        public String returEncapsular(){
            return this.encapsular;
        }
        public int returnEntra(){
            return this.entra;
        }
        public int returnSai(){
            return this.sai;
        }
        public int returnAndares(){
            return this.andares;
        }
        public int returnCapacidade(){
            return this.entra;
        }
        public int returnPessoas(){
            return this.entra;
        }
        void sobe(){
            System.out.println("O elevador está subindo");
        }
        void desce(){
            System.out.println("O eleveador está descendo");
        }
}