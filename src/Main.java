public class Main {
    public static void main(String[] args) {
        ProductionHouse productionHouse = ProductionHouse.getInstance("Bucuresti",1000,7);
        Musician musician1 = new Musician("Vasile",30);
        Musician musician2 = new Musician("Cornel",43);
        Musician musician3 = new Musician("Andrei",28);
        Musician musician4 = new Musician("Cristian",20);
        musician1.setProductionHouse(productionHouse);
        musician2.setProductionHouse(productionHouse);
        musician3.setProductionHouse(productionHouse);
        musician4.setProductionHouse(productionHouse);
        System.out.println("Nume muzician:"+" "+musician1.getName()+", "+"Adresa studio"+" "+musician1.getProductionHouse().getAdress()+", "+"Pret studio"+" "+musician1.getProductionHouse().final_price());
        System.out.println("Nume muzician:"+" "+musician2.getName()+", "+"Adresa studio"+" "+musician2.getProductionHouse().getAdress()+", "+"Pret studio"+" "+musician2.getProductionHouse().final_price());
        System.out.println("Nume muzician:"+" "+musician3.getName()+", "+"Adresa studio"+" "+musician3.getProductionHouse().getAdress()+", "+"Pret studio"+" "+musician3.getProductionHouse().final_price());
        System.out.println("Nume muzician:"+" "+musician4.getName()+", "+"Adresa studio"+" "+musician4.getProductionHouse().getAdress()+", "+"Pret studio"+" "+musician4.getProductionHouse().final_price());
}
}
