package Application;

import Entity.CarrinhoDeCompras;
import Entity.Pizza;

public class Main {
    public static void main(String[] args) {
        Pizza p1 = new Pizza();
        p1.adicionarIngrediente("Tomate");
        p1.adicionarIngrediente("Queijo");
        p1.adicionarIngrediente("Cebola");
        Pizza p2 = new Pizza();
        p2.adicionarIngrediente("Salsa");
        p2.adicionarIngrediente("Calabresa");
        p2.adicionarIngrediente("Pimentão");
        Pizza p3 = new Pizza();
        p3.adicionarIngrediente("Frango");
        p3.adicionarIngrediente("Catupiry");
        p3.adicionarIngrediente("Oregano");

        CarrinhoDeCompras c = new CarrinhoDeCompras();
        c.setCompras(p1);
        c.setCompras(p2);
        c.setCompras(p3);

        System.out.println(c);
        System.out.println(p1);
    }
}
