package first_step.java8;

public class Number {

    private int id;
    private Integer[] values;

    public Number(int id, Integer[] values) {
        this.id = id;
        this.values = values;
    }

    public Integer[] getValues() {
        return values;
    }

    public void setValues(Integer[] values) {
        this.values = values;
    }
}
