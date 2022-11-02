package br.com.ada.petshop.businessobject;

/*
Guarde os cães em um array de Cachorros.

Não permita que cães sem donos sejam cadastrados.

Crie um método que mostre os cães cadastrados.
*/

import br.com.ada.petshop.modelo.Cachorro;

import java.util.Objects;

public class CachorroRepository {
    private Cachorro[] cachorrosCadastrados = new Cachorro[10];
    private int counter = 0;

    public void cadastra(Cachorro cachorro) {
        if (Objects.nonNull(cachorro) && Objects.nonNull(cachorro.getDono())) {
            cachorrosCadastrados[counter] = cachorro;
            counter++;
        } else {
            System.out.println("cachorro nulo ou sem dono");
        }
    }

    public void imprimirCachorrosCadastrados(){
        boolean existeCaoCadastrado = false;
        System.out.println("-----------DOGS CADASTRADOS----------");
        for (Cachorro cachorro: cachorrosCadastrados) {
            if (Objects.nonNull(cachorro)){
                existeCaoCadastrado = true;
                System.out.println(cachorro);
            }
        }

        if (!existeCaoCadastrado){
            System.out.println("_____________ZERO CAES CADASTRADOS_____________");
        }
    }

}
