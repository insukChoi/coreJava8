package ch4.exercise.ex1ex2ex3;

public class LabeledPoint extends Point {

    private String label;

    public LabeledPoint() {

    }

    public LabeledPoint(String label, double x, double y) {
        super(x, y);
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    @Override
    public String toString() {
        return getClass().getName() + "[label = " + this.label + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        LabeledPoint that = (LabeledPoint) obj;

        if (this.label == null && that.label != null) {
            return false;
        }
        if (this.label.equals(that.label)) {
            return true;
        }

        return false;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((label == null) ? 0 : label.hashCode());
        return result;
    }


}



