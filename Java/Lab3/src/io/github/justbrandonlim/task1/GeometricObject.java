package io.github.justbrandonlim.task1;

public class GeometricObject {

    private String color = "white";
    private boolean filled = false;

    public GeometricObject() {}
    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return this.filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String toString() {
        return "Color: " + this.color + ", Filled: " + this.filled;
    }
}
