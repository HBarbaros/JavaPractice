package day36_Inheritance.cryptoTokenTask;

public class CryptoToken {

    public double price;
    public int quantity;
    public long marketCap;
    public long circulatingSupply;
    public boolean isMineAble;

    public void setInfo(double price, int quantity, long marketCap, long circulatingSupply, boolean isMineAble) {
        this.price = price;
        this.quantity = quantity;
        this.marketCap = marketCap;
        this.circulatingSupply = circulatingSupply;
        this.isMineAble = isMineAble;
    }

    public String toString() {
        return "CryptoToken{" +
                "price=" + price +
                ", quantity=" + quantity +
                ", marketCap=" + marketCap +
                ", circulatingSupply=" + circulatingSupply +
                ", isMineAble=" + isMineAble +
                '}';
    }

    public double totalPrice(){
        return price * quantity;
    }

}
