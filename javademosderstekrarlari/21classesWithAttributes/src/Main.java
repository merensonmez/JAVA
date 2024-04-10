public class Main {
    public static void main(String[] args) {

        Product product = new Product(0,"Laptop","LENOVO ThinkPad T480s",356,12,"Black","https://a.co/d/fjICOse");
        Product product1 = new Product(1,"Gaming Laptop","ASUS TUF Gaming F15",797,5,"Graphite Black","https://a.co/d/5aNDKgA");


        ProductManager productManager = new ProductManager();
        productManager.Add(product);
        String[] properties = {product.name, product.description, String.valueOf(product.price), String.valueOf(product.stockAmount), product.link, product.getCode()};

        for (String property : properties) {
            System.out.println(property);
        }

        System.out.println("--------------------");

        ProductManager productManager1 = new ProductManager();
        productManager1.Add(product);
        String[] properties1 = {product1.name, product1.description, String.valueOf(product1.price), String.valueOf(product1.stockAmount), product1.link, product1.getCode()};

        for (String property : properties1) {
            System.out.println(property);
        }
    }
}