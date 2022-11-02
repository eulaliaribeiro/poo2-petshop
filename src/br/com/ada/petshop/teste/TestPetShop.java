package br.com.ada.petshop.teste;

import br.com.ada.petshop.businessobject.CachorroRepository;
import br.com.ada.petshop.businessobject.Internacoes;
import br.com.ada.petshop.modelo.Cachorro;
import br.com.ada.petshop.modelo.Dono;
import br.com.ada.petshop.modelo.Endereco;

public class TestPetShop {

    public static void main(String[] args) {
        /* criando/instanciando objetos e pegando o endereço deles na memoria
        esse endereço é atributo a variavel
        estamos usando varios construtores para isso*/

        Endereco endereco1 = new Endereco("pastor gabino brelaz", "1401", "59082-010", "capim macio", "RN");
        Endereco endereco2 = new Endereco("das orquídeas", "82", "59082-012", "mirassol", "RN");
        Endereco endereco3 = new Endereco("roberto freire", "2050", "59082-014", "capim macio", "RN");

        Dono dono1 = new Dono("eulalia", "05192642159", "eulaliaribeiro@hotmail.com", endereco1);
        Dono dono2 = new Dono("renan", "11111111111", "renanribeiro@hotmail.com", endereco2);
        Dono dono3 = new Dono("francisca", "22222222222", "euzibeneribeiro@hotmail.com", endereco3);

        Cachorro cachorro1 = new Cachorro("marley", "labrador", 6, true, dono1);
        Cachorro cachorro2 = new Cachorro("zidane", "SRD", 10, true, dono2);
        Cachorro cachorro3 = new Cachorro("fred", "fox paulista", 2, false, dono3);

//        System.out.println(cachorro1);
//        System.out.println(cachorro2);
//        System.out.println(cachorro3);

        CachorroRepository cachorroRepository = new CachorroRepository();
        cachorroRepository.cadastra(cachorro1);
        cachorroRepository.cadastra(cachorro2);
        cachorroRepository.cadastra(cachorro3);

        cachorroRepository.imprimirCachorrosCadastrados();


    }

}
