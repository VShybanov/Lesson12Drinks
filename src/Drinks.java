public enum Drinks {
    COFFEE("кава", 40.0f),
    TEA("чай", 30.0f),
    LEMONADE("лимонад", 35.0f),
    MOJITO("мохіто", 50.0f),
    MINERAL("мінералка", 30.0f),
    COCA_COLA("кока-кола", 35.0f);
    private String name;
    private float price;
    Drinks(String name, float price){
        this.name = name;
        this.price = price;
    }
    public String getName(){
        return name;
    }
    public float getPrice(){
        return price;
    }
    @Override
    public String toString(){
        return name + " по " + price + " грн.";
    }
};


