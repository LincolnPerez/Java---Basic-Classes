public class progOnibus{
    public static void main(String[] args) {    
        
        Onibus Onibus1 = new Onibus("Mercedes", "Agua Branca", "Rio Janeiro", "Sao Paulo", 60, 54, "azul", 54, "Aparecida");

        Onibus Onibus2 = new Onibus("Mercedes", "Adamantina", "Sao Paulo", "Minas Gerais", 64, 60, "verde", 60, "Barretos");

        Onibus Onibus3 = new Onibus("Mercedes", "Penha", "Minas Gerais", "Brasilia", 54, 48, "preto", 48, "Goiais");
        
        Onibus1.liga();

        System.out.println("Esse onibus e da " + Onibus1.returnMarca() + ", da empresa " + Onibus1.returnViacao() + " e tem a cor " + Onibus1.returnCor() + " vai sair do " + Onibus1.returnPonto_Inicio() + " com destino a " + Onibus1.returnPonto_Final() + " a capacidade total dele e de " + Onibus1.returnCapacidade() + " pessoas, mas somente " + Onibus1.returnPessoas() + " pessoas vao ir,e durante essa viagem, ele vai fazer " + Onibus1.returnParadas() + " paradas, atualmente ele esta parado na " + Onibus1.returnPonto_Atual() + " e " + Onibus1.returnEntrada() + " pessoas entraram, e " + Onibus1.returnPessoas() + " desceram do onibus ");


        System.out.println("Esse onibus e da " + Onibus2.returnMarca() + ", da empresa " + Onibus2.returnViacao() + " e tem a cor " + Onibus2.returnCor() + " vai sair do " + Onibus2.returnPonto_Inicio() + " com destino a " + Onibus2.returnPonto_Final() + " a capacidade total dele e de " + Onibus2.returnCapacidade() + " pessoas, mas somente " + Onibus2.returnPessoas() + " pessoas vao ir,e durante essa viagem, ele vai fazer " + Onibus2.returnParadas() + " paradas, atualmente ele esta parado na " + Onibus2.returnPonto_Atual() + " e " + Onibus2.returnEntrada() + " pessoas entraram, e " + Onibus2.returnPessoas() + " desceram do onibus ");


        System.out.println("Esse onibus e da " + Onibus3.returnMarca() + ", da empresa " + Onibus3.returnViacao() + " e tem a cor " + Onibus3.returnCor() + " vai sair do " + Onibus3.returnPonto_Inicio() + " com destino a " + Onibus3.returnPonto_Final() + " a capacidade total dele e de " + Onibus3.returnCapacidade() + " pessoas, mas somente " + Onibus3.returnPessoas() + " pessoas vao ir,e durante essa viagem, ele vai fazer " + Onibus3.returnParadas() + " paradas, atualmente ele esta parado na " + Onibus3.returnPonto_Atual() + " e " + Onibus3.returnEntrada() + " pessoas entraram, e " + Onibus3.returnPessoas() + " desceram do onibus ");

    }
}

       