package cz.educanet.matrices;

public class MatrixFactory implements IMatrixFactory {

    public static final IMatrixFactory instance = new MatrixFactory();

    private MatrixFactory() {
    }

    /**
     * TODO: Implement
     */
    @Override
    public IMatrix create(double[][] data) {
        return null;
    }

    /**
     * TODO: Implement
     */
    @Override
    public IMatrix createDiagonal(double[] diagonal) {
        return null;
    }

    /**
     * TODO: Implement
     */
    @Override
    public IMatrix createIdentity(int size) {
        return null;
    }

    @Override
    public IMatrix createZero(int size) {
        if (size < 0)
            throw new IllegalArgumentException();

        return new Matrix(new double[size][size]);
    }
}
