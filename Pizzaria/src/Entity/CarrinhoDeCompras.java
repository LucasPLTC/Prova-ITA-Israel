package Entity;

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


}
