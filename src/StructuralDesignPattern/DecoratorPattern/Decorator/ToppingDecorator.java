package StructuralDesignPattern.DecoratorPattern.Decorator;

import StructuralDesignPattern.DecoratorPattern.BasePizza;

public abstract class ToppingDecorator extends BasePizza {
    public abstract int cost();
}
