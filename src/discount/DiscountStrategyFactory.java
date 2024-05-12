package discount;

class DiscountStrategyFactory {
    public DiscountStrategy getDiscountStrategy(char discountType) {
        switch (discountType) {
            case 'S':
            case 's':
                return new SaleDiscountStrategy();
            case 'D':
            case 'd':
                return new DiscountDiscountStrategy();
            case 'L':
            case 'l':
                return new LiquidationDiscountStrategy();
            default:
                return null;
        }
    }
}
