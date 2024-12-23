package ru.mirea.practices0000001;

class Multiply extends Expression {
    private Expression left;
    private Expression right;

    public Multiply(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int evaluate(int x) {
        return left.evaluate(x) * right.evaluate(x);
    }
}
