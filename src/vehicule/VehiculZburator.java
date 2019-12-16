package vehicule;

public abstract class VehiculZburator {
    protected String model;
    protected int viteza;

    public VehiculZburator(String model, int viteza) {
        this.model = model;
        this.viteza = viteza;
    }

    public VehiculZburator(){
        this.model = "nava spatiala";
        this.viteza = 0;
    }

    public String getModel() {
        return model;
    }

    public boolean setModel(String model) {
        int length = model.length();
        if(length >= 2){
            this.model = model;
            System.out.println("Model: " + model);
            return true;

        }else{
            System.out.println("Modelul trebuie sa aiba mai mult de 3 caractere");
            return true;
        }


    }

    public abstract void setViteza();
}
