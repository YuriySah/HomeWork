package Lesson_4;

public class Payment {
    public static int moneyAmount = 45000;

    public static void main(String[] args) {

        Product[] product = new Product[3];
        product[0] = new Product(20000, "Телевизор Bravis LED-24G5000");
        product[1] = new Product(35000, "Apple iPhone 13 mini 512 GB");
        product[2] = new Product(10000, "Пылесос ROWENTA X-FORCE");

        buyProduct(product[0]);
        buyProduct(product[2]);

        System.out.println("Количество денег = " + moneyAmount);

    }

    public static void buyProduct(Product product) {
        if (moneyAmount >= product.getPrice()) {
            moneyAmount -= product.getPrice();
            System.out.println(product.getNameOfProduct() + " был куплен");
        } else {
            System.out.println("Не хватает денег на покупку");
        }
    }

    public static class Product {
        private int price;
        private String nameOfProduct;

        public Product(int price, String nameOfProduct) {
            this.price = price;
            this.nameOfProduct = nameOfProduct;
        }

        public int getPrice() {
            return price;
        }

        public String getNameOfProduct() {
            return nameOfProduct;
        }
    }
}
