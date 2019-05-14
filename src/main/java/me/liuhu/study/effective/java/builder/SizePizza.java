package me.liuhu.study.effective.java.builder;

import java.util.Objects;

/**
 * @description:
 * @author: LiuHu
 * @create: 2019-01-22 21:15
 **/
public class SizePizza extends Pizza {
    public enum Size {
        BIG,
        SMALL;
    }

    private final Size size;

    public static class Builder extends Pizza.Builder {
        private final Size size;

        public Builder(Size size) {
            this.size = Objects.requireNonNull(size);
        }

        @Override
        public SizePizza build() {
           return new SizePizza(this);
        }

        @Override
        protected Pizza.Builder self() {
            return this;
        }
    }

    private SizePizza(Builder builder) {
        super(builder);
        size = builder.size;
    }

    @Override
    public String toString() {
        return "SizePizza{" +
                "size=" + size +
                ", toppings=" + toppings +
                '}';
    }
}
