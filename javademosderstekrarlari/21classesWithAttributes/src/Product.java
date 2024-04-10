public class Product {

    public Product(int id,String name,String description,double price,int stockAmount,String color,String link){
        System.out.println("The constructor block executed.");
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price ;
        this.stockAmount = stockAmount;
        this.color = color;
        this.link = link;

    }

    public Product(){

    }
    int id;
    String name;
    String description;
    double price;
    int stockAmount;
    String color;
    String code;
    String link;

    public int getId(){
        return this.id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getName(){return name;}

    public void setName(String name){this.name = name;}

    public String getDescription(){return description;}

    public void setDescription(String description) {this.description = description;}

    public double getPrice(double price){return price;}

    public void setPrice(double price){this.price = price;}

    public int getStockAmount(){return stockAmount;}

    public void setStockAmount(int stockAmount){this.stockAmount = stockAmount;}

    public String getColor(){return color;}

    public void setColor(String color){this.color = color;}

    public String getCode(){return this.name.substring(0,1)+id;}

    public String getLink(){return link;}

    public void setLink(String link){this.link = link;}
}
