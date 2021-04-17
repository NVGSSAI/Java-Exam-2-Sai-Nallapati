/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question7A;

/**
 *
 * @author Venkata Gopi Siva Sai Nallapati
 */
public enum Cars {
FORDFIESTA(12000),KIARIO(13500),CHEVISPARK(11000);
private int price;

    private Cars(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

}

