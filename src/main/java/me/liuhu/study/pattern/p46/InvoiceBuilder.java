package me.liuhu.study.pattern.p46;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/2/24
 **/
public class InvoiceBuilder {

    private Integer imsiFee;
    private Integer simFee;

    public InvoiceBuilder setImsiFee(Integer imsiFee) {
        if (null == imsiFee) {
            throw new IllegalArgumentException("imsi fee must not null");
        }
        this.imsiFee = imsiFee;
        return this;
    }

    public InvoiceBuilder setSimFee(Integer simFee) {
        if (null == simFee) {
            throw new IllegalArgumentException("sim fee must not null");
        }
        this.simFee = simFee;
        return this;
    }

    public InvoiceDto build() {
        InvoiceDto dto = new InvoiceDto();
        dto.setImsiFee(imsiFee);
        dto.setSimFee(simFee);
        dto.setTotalFee(imsiFee + simFee);
        return dto;
    }

}
