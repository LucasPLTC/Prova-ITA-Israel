package Entity;

import java.util.*;

public class Pizza {

    private static HashMap<String,Integer> allIngredients = new HashMap<String, Integer>();

    private ArrayList<String> ingredientes = new ArrayList<String>();

    public List<String> getIngredientes() {
        return ingredientes;
    }


    public void adicionarIngrediente(String ingrediente){
        this.ingredientes.add(ingrediente.toUpperCase());
        contabilizaingrediente(ingrediente.toUpperCase());

    }
    public long getPreço(){
        int howManyIngredients = getIngredientes().size();
        if(howManyIngredients <=2){
            return 15;
        }if(howManyIngredients >=3 && howManyIngredients<=5){
            return 20;
        }
        return 23;
    }

    private static void contabilizaingrediente(String ingrediente){
        if(allIngredients.containsKey(ingrediente)){
            allIngredients.put(ingrediente, allIngredients.get(ingrediente)+1);
        }else{
            allIngredients.put(ingrediente, 1);
        }

    }

    public static HashMap<String, Integer> getAllIngredients() {
        return allIngredients;
    }

    public static void setAllIngredients(HashMap<String, Integer> allIngredients) {
        Pizza.allIngredients = allIngredients;
    }

    public Pizza() {

    }
}
