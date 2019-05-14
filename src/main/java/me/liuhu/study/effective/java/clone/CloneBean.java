package me.liuhu.study.effective.java.clone;

/**
 * @description:
 * @author: LiuHu
 * @create: 2019-02-04 16:38
 **/
public class CloneBean implements Cloneable {

    private String name;

    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "CloneBean{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    protected CloneBean clone() throws CloneNotSupportedException {
        CloneBean bean =  (CloneBean)super.clone();
        // bean.setAge(12);
        return bean;
    }

    public static void main(String[] args) throws Exception {
        CloneBean bean = new CloneBean();
        bean.setName("Hello");

        CloneBean bean2 = bean.clone();

        System.out.println(bean);
        System.out.println(bean2);

    }
}
