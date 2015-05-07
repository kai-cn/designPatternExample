package cn.kklin.dp.builder;

//���彨������Builder1
public class ConcreteBuilder1 extends Builder {
    private Product product = new Product();

    @Override
    public void buildPartA() {
        product.add("����A");
    }

    @Override
    public void buildPartB() {
        product.add("����B");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
