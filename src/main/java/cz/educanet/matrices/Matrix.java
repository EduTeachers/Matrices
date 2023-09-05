package cz.educanet.matrices;

public class Matrix implements IMatrix {

    private final double[][] rawArray;

    public Matrix(double[][] rawArray) {
        this.rawArray = rawArray;
    }

    /**
     * TODO: Implement
     */
    @Override
    public IMatrix times(IMatrix matrix) {
        return null;
    }

    /**
     * TODO: Implement
     */
    @Override
    public IMatrix times(Number scalar) {
        return null;
    }

    /**
     * TODO: Implement
     */
    @Override
    public IMatrix add(IMatrix matrix) {
        return null;
    }

    /**
     * TODO: Implement
     */
    @Override
    public IMatrix transpose() {
        return null;
    }

    /**
     * TODO: Implement
     */
    @Override
    public double determinant() {
        return 0;
    }

    /**
     * TODO: Implement
     */
    @Override
    public boolean isSquare() {
        return false;
    }

    /**
     * TODO: Implement
     */
    @Override
    public boolean isDiagonal() {
        return false;
    }

    /**
     * TODO: Implement
     */
    @Override
    public Number getTrace() {
        return null;
    }

    @Override
    public int getRows() {
        return rawArray.length;
    }

    @Override
    public int getColumns() {
        if (getRows() > 0)
            return rawArray[0].length;

        return 0;
    }

    @Override
    public double get(int n, int m) {
        if(n >= getRows() || n < 0 || m >= getColumns() || m < 0)
            throw new IllegalArgumentException();

        return rawArray[n][m];
    }
}
