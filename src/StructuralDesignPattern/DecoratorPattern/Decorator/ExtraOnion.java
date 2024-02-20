package StructuralDesignPattern.DecoratorPattern.Decorator;

import StructuralDesignPattern.DecoratorPattern.BasePizza;

public class ExtraOnion extends ToppingDecorator {
    BasePizza basePizza;

    public ExtraOnion(BasePizza basePizza) {
        this.basePizza = basePizza;
    }
    @Override
    public int cost() {
        return basePizza.cost() + 20;
    }
}
