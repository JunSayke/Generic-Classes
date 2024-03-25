package Arithmetic;

public class Arithmetic <T1 extends Number, T2 extends Number> {
    private final T1 num1;
    private final T2 num2;
    public Arithmetic(T1 num1, T2 num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public <T extends Number> T add() {
        double result = num1.doubleValue() + num2.doubleValue();
        return determineType(result);
    }

    public <T extends Number> T subtract() {
        double result = num1.doubleValue() - num2.doubleValue();
        return determineType(result);
    }

    public <T extends Number> T multiply() {
        double result = num1.doubleValue() * num2.doubleValue();
        return determineType(result);
    }

    public <T extends Number> T divide() {
        double result = num1.doubleValue() / num2.doubleValue();
        return determineType(result);
    }

    @SuppressWarnings("unchecked")
    public <T extends Number> T getMin() {
        if (num1.doubleValue() <= num2.doubleValue()) {
            return (T) num1;
        }
        return (T) num2;
    }

    @SuppressWarnings("unchecked")
    public <T extends Number> T getMax() {
        if (num1.doubleValue() >= num2.doubleValue()) {
            return (T) num1;
        }
        return (T) num2;
    }

    @SuppressWarnings("unchecked")
    private <T extends Number> T determineType(double value) {
        Class<?> num1Class = num1.getClass();
        Class<?> num2Class = num2.getClass();

        if (num1Class.equals(Double.class) || num2Class.equals(Double.class)) {
            return (T) Double.valueOf(value);
        }

        if (num1Class.equals(Float.class) || num2Class.equals(Float.class)) {
            return (T) Float.valueOf((float) value);
        }

        if (num1Class.equals(Long.class) || num2Class.equals(Long.class)) {
            return (T) Long.valueOf((long) value);
        }

        if (num1Class.equals(Integer.class) || num2Class.equals(Integer.class)) {
            return (T) Integer.valueOf((int) value);
        }

        if (num1Class.equals(Short.class) || num2Class.equals(Short.class)) {
            return (T) Short.valueOf((short) value);
        }

        throw new IllegalArgumentException("Unsupported types");
    }
}
