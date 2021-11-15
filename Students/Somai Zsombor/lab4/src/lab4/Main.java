package lab4;

public class Main {

    public static void main(String[] args) {
        Category[] listCat = new Category[4];

        for(int i = 0; i < listCat.length; i++){
            listCat[i] = new Category("Cat" + i);
        }
        Product[] listProd = new Product[10];

        for(int i = 0; i < listProd.length; i++){
            listProd[i] = new Product("Name" + i, i, listCat[i%4], i);
        }
        ShopService shopService = new ShopService(listCat,listProd);
        shopService.displayProductsFromACategory(listCat[1]);
        System.out.println("\n\n\n");
        shopService.searchForProduct("Name5").getData();
    }
}

