package discount;

class CustomerOrder {
    private String customerName;
    private double billAmount;
    private char discountType;
    private DiscountStrategy discountStrategy;

    public CustomerOrder(String customerName, double billAmount, char discountType, DiscountStrategy discountStrategy) {
        this.customerName = customerName;
        this.billAmount = billAmount;
        this.discountType = discountType;
        this.discountStrategy = discountStrategy;
    }

    public double getBillAmount() {
        return discountStrategy.applyDiscount(billAmount);
    }

    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public String toString() {
        return "Customer{"
                + "customerName='" + customerName + '\''
                + ", billAmount=" + billAmount
                + ", discountType=" + discountType
                + '}';
    }
}
