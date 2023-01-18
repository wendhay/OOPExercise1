class BicycleRegistration {
    public static void main(String[] args){
        Bicycle bike1, bike2, bike3;
        String owner1, owner2, owner3;
        String TN1, TN2, TN3;
        
        bike1 = new Bicycle();
        bike1.setOwnerName("Adam Smith");
        bike1.setTagNo("56NH7-789h");
        
        bike2 = new Bicycle();
        bike2.setOwnerName("Ben Jones");
        bike2.setTagNo("121298-293NM");
        
        bike3 = new Bicycle("Eusedio T. Villato III", "STCS-1456");
        
        //Output the information
        owner1 = bike1.getOwnerName();
        owner2 = bike2.getOwnerName();
        owner3 = bike3.getOwnerName();
        TN1 = bike1.getTagNo();
        TN2 = bike2.getTagNo();
        TN3 = bike3.getTagNo();
  
        System.out.println("1."+ owner1 + " owns a bicycle with a tag No. " +TN1);
        System.out.println("2."+ owner2 + " also owns a bicycle with a tag No. " +TN2);
        System.out.println("3."+ owner3 + " owns a bicycle with tag No. " +TN3);
    }
}
