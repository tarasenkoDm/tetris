package net.tetris.dom;

public class FigurePattern {
    private String[] rows;
    private int centerX;
    private int centerY;
    private int nullzero;
    private String present = "Present";


    public FigurePattern(int centerX, int centerY, String... rows) {
        this.rows = rows;
        this.centerX = centerX;
        this.centerY = centerY;
    }

    public String[] getRows() {
        return rows;
    }

    public int getCenterX() {
        return centerX;
    }

    public int getCenterY() {
        return centerY;
    }

    public String getPresent(){
    return presentn;
    }

}
