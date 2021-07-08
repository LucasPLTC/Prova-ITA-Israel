package Entity;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Pizza> compras = new ArrayList<Pizza>();

    public List<Pizza> getCompras() {
        return compras;
    }

    public void setCompras(Pizza pz) {
        if(pz.getIngredientes().isEmpty()){
          System.out.println("PIZZA VAZIA");
        }else{
            compras.add(pz);
        }
    }

    public Long getValorTotal(){
        return compras.stream().mapToLong(pizza -> pizza.getPreço()).sum();
    }

    @Override
    public String toString() {
        return MessageFormat.format("O valor todal da compra é de: R${0}.", getValorTotal());
    }
}
