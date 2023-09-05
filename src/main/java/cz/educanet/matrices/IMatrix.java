package cz.educanet.matrices;

public interface IMatrix {

    /**
     * Multiplies the two matrices together and returns the resulting matrix.
     *
     * @param matrix Matrix to multiply with
     * @return Multiplied matrix
     */
    IMatrix times(IMatrix matrix);

    /**
     * Multiplies the matrix with a number.
     *
     * @param scalar Number to multiply with
     * @return Scalar times "larger" matrix
     */
    IMatrix times(Number scalar);

    /**
     * Adds two matrices together
     *
     * @param matrix Matrix to add
     * @return sum of the two matrices
     */
    IMatrix add(IMatrix matrix);

    /**
     * Transposes the matrix (flips rows and columns)
     *
     * @return flipped matrix
     */
    IMatrix transpose();

    /**
     * Calculates the determinant by using the <a href="https://en.wikipedia.org/wiki/Laplace_expansion">Laplace Expansion</a>
     *
     * @return Determinant of a matrix
     */
    double determinant();

    /**
     * "Calculates" whether the matrix is square or not
     *
     * @return True if the matrix squared else false
     */
    boolean isSquare();

    /**
     * "Calculates" whether the matrix is a <a href="https://en.wikipedia.org/wiki/Diagonal_matrix">squared diagonal matrix</a>
     *
     * @return True if the matrix is square and diagonal else false
     */
    boolean isDiagonal();

    /**
     * Calculates the <a href="https://en.wikipedia.org/wiki/Trace_(linear_algebra)">trace</a> of the matrix
     *
     * @return Trace
     */
    Number getTrace();

    /**
     * @return rows
     */
    int getRows();

    /**
     * @return columns
     */
    int getColumns();

    /**
     * @param n Nth index
     * @param m Mth index
     * @return the value of the "cell"
     */
    double get(int n, int m);

}
