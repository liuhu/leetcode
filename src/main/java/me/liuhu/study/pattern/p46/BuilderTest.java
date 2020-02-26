package me.liuhu.study.pattern.p46;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/2/24
 **/
public class BuilderTest {
    public static void main(String[] args) {
        InvoiceBuilder builder = new InvoiceBuilder();
        InvoiceDto dto = builder
                .setImsiFee(1)
                .setSimFee(2)
                .build();

        System.out.println(dto);
    }
}
