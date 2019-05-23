package shop;

public class Main {
    public static void main(String[] arg){
        ProductCatalog productCatalog = ProductCatalog.getInstance();
        productCatalog.addProduct("kim",100);
        System.out.println(productCatalog.getProduct("kim").getName());
    }
}
