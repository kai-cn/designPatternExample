package cn.kklin.dp.builder;

//  ���彨������Builder2
public class ConcreteBuilder2 extends Builder {
    private Product product = new Product();

    @Override
    public void buildPartA() {
        product.add("����X");
    }

    @Override
    public void buildPartB() {
        product.add("����Y");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
