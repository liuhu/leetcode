package me.liuhu.study.pattern.p46;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/2/24
 **/
public class InvoiceDto {
    private Integer imsiFee;
    private Integer simFee;
    private Integer totalFee;

    public Integer getImsiFee() {
        return imsiFee;
    }

    public void setImsiFee(Integer imsiFee) {
        this.imsiFee = imsiFee;
    }

    public Integer getSimFee() {
        return simFee;
    }

    public void setSimFee(Integer simFee) {
        this.simFee = simFee;
    }

    public Integer getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(Integer totalFee) {
        this.totalFee = totalFee;
    }

    @Override
    public String toString() {
        return "InvoiceDto{" +
                "imsiFee=" + imsiFee +
                ", simFee=" + simFee +
                ", totalFee=" + totalFee +
                '}';
    }
}
