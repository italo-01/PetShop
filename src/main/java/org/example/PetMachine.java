package org.example;

public class PetMachine {
    private boolean clean;
    private int water;
    private int shampoo;
    private Pet pet;

    public void takeAShower(){
        if (this.pet == null){
            System.out.println("Coloque o pet na maquina para iniciar o banho");
            return;
        }
        this.water -= 10;
        this.shampoo -= 2;
        pet.setClean(true);
        System.out.println("O pet" + pet.getName() +  "está limpo "  );
    }
    public void addWater(){
        if (water == 30){
            System.out.println("a capacidade de agua está no maximo");
            return;
        }
        water += 2;
    }
    public void addShampoo(){
        if (shampoo == 10){
            System.out.println("A Capacidade de água está no máximo");
            return;
        }
        shampoo += 2;
    }

    public int getShampoo() {
        return shampoo;
    }

    public int getWater() {
        return water;
    }

    public boolean hasPet(){
        return pet != null;
    }

    public void setPet(Pet pet) {
        if(!this.clean){
            System.out.println("A máquina está suja, Para colocar o pet é necessário limpa-la ");
            return;
        }
        if (hasPet()){
            System.out.println("O pet " + this.pet.getName() + " está na máquina nesse momento");
            return;
        }
        this.pet = pet;
    }
    public void removePet(){
        if (pet.getName() != null){
            this.clean = this.pet.isClean();
            System.out.println("O pet " + this.pet.getName() + " Está limpo");
            this.pet = null;
            return;
        }
        System.out.println("Não tem Pet na máquina");
    }
    public void wash(){
        this.water -= 10;
        this.shampoo -= 2;
        this.clean = true;
        System.out.println("A maquina está limpa");
    }
}
