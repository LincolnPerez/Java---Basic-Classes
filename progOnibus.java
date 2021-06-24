public class progOnibus{
    public static void main(String[] args) {    
        
        Onibus Onibus1 = new Onibus("Mercedes", "AguaBranca", "Rio Janeiro", "São Paulo", "Aparecida do Norte", 60, 54, 3, 6, 5, "Azul");

        Onibus Onibus2 = new Onibus("Mercedes", "Adamantina", "São Paulo", "Minas Gerais", "Barretos", 64, 60, 4, 2, 8, "Verde");

        Onibus Onibus3 = new Onibus("Mercedes", "Penha", "Minas Gerais", "Brasília", "Goiás", 54, 48, 4, 6, 10, "Preto");
        
        Onibus1.liga();

        System.ou.println("Esse onibus é uma " + Onibus1.returnMarca() + ", da empresa" + Onibus1.returnAviacao() + "e tem a cor" + Onibus1.returnCor() + "vai sair do" + Onibus1.returnPonto_Inicio() + "com destino a" + Onibus1.returnPonto_Final() + "a capacidade total dele é" + Onibus1.returnCapacidade() + "mas somente" + Onibus1.returnPessoas() + "vão ir,e durante essa viagem, ele vai fazer" + Onibus1.returnParadas() + "paradas, atualmente ele está parado na" + Onibus1.returnPonto_Atual() + "e" + Onibus1.returnEntrada() + "pessoas entraram, e " + Onibus1.returnCapacidade() + "desceram do onibus");


        System.ou.println("Esse onibus é uma " + Onibus2.returnMarca() + ", da empresa" + Onibus2.returnAviacao() + "e tem a cor" + Onibus2.returnCor() + "vai sair do" + Onibus2.returnPonto_Inicio() + "com destino a" + Onibus2.returnPonto_Final() + "a capacidade total dele é" + Onibus2.returnCapacidade() + "mas somente" + Onibus2.returnPessoas() + "vão ir,e durante essa viagem, ele vai fazer" + Onibus2.returnParadas() + "paradas, atualmente ele está parado na" + Onibus2.returnPonto_Atual() + "e" + Onibus2.returnEntrada() + "pessoas entraram, e " + Onibus2
        .returnCapacidade() + "desceram do onibus");


        System.ou.println("Esse onibus é uma " + Onibus2.returnMarca() + ", da empresa" + Onibus2.returnAviacao() + "e tem a cor" + Onibus2.returnCor() + "vai sair do" + Onibus2.returnPonto_Inicio() + "com destino a" + Onibus2.returnPonto_Final() + "a capacidade total dele é" + Onibus2.returnCapacidade() + "mas somente" + Onibus2
        .returnPessoas() + "vão ir,e durante essa viagem, ele vai fazer" + Onibus2.returnParadas() + "paradas, atualmente ele está parado na" + Onibus2.returnPonto_Atual() + "e" + Onibus2.returnEntrada() + "pessoas entraram, e " + Onibus2.returnCapacidade() + "desceram do onibus");

    }
}

       