package me.liuhu.study.effective.java.builder;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

/**
 * @description:
 * @author: LiuHu
 * @create: 2019-01-22 21:09
 **/
public abstract class Pizza {
    public enum Topping {
        ONION, // 洋葱
        PEPPER, // 胡椒
        SAUSAGE // 香肠
    }

    final Set<Topping> toppings;

    abstract static class Builder<T extends Builder> {
        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);

        public T addTopping(Topping topping) {
            toppings.add(Objects.requireNonNull(topping));
            return self();
        }

        public abstract Pizza build();

        protected abstract T self();
    }

    Pizza(Builder<?> builder) {
        toppings = builder.toppings.clone();
    }
}
