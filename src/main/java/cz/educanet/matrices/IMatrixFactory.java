package cz.educanet.matrices;

public interface IMatrixFactory {

    /**
     * Creates a matrix
     *
     * @param data Matrix data to set
     * @return New matrix
     */
    IMatrix create(double[][] data);

    /**
     * Creates a square diagonal matrix, where the size of the matrix is the length of the diagonal.
     *
     * @param diagonal Diagonal elements
     * @return New diagonal matrix
     */
    IMatrix createDiagonal(double[] diagonal);

    /**
     * Creates an identity matrix with the specified size.
     *
     * @param size Size of the new matrix
     * @return New identity matrix
     */
    IMatrix createIdentity(int size);

    /**
     * Creates an zero matrix (where all entries are zeroes)
     *
     * @return New zero matrix
     */
    IMatrix createZero(int size);

}
