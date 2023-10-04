package shop;

public class Cart {
    private Costumer costumer;
    private Article[] content;
    private int totalPrice;

    public Cart(Costumer costumer, Article[] content) {
        this.costumer = costumer;
        this.content = content;
        this.totalPrice = calcTotalPrice();
    }

    private int calcTotalPrice() {
        this.totalPrice=0;
        for (int i = 0; i < this.content.length; i++) {
            this.totalPrice+=this.content[i].getPrice();
        }
        return this.totalPrice;
    }

    public Costumer getCostumer() {
        return costumer;
    }

    public Article[] getContent() {
        return content;
    }

    public int getTotalPrice() {
        return totalPrice;
    }
}
