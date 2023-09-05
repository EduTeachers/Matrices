package cz.educanet.matrices;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * See possible naming <a href="https://medium.com/@stefanovskyi/unit-test-naming-conventions-dd9208eadbea"></a>conventions</a>
 */
class CreateZeroMatrixTest {

    private final IMatrixFactory matrixFactory = MatrixFactory.instance;

    @Test
    public void should_Succeed_When_SizeIsValid() {
        int[] validSizes = {2, 4, 6, 10};

        for (int size : validSizes) {
            IMatrix matrix = matrixFactory.createZero(size);

            Assertions.assertEquals(size, matrix.getRows());
            Assertions.assertEquals(size, matrix.getColumns());
            assertEmptyMatrix(matrix);
        }
    }

    @Test
    public void should_ThrowException_When_NegativeSize() {
        int[] negativeSizes = {-2, -10, -Integer.SIZE};

        for (int size : negativeSizes)
            Assertions.assertThrows(IllegalArgumentException.class, () -> matrixFactory.createZero(size));
    }

    // region: Private util methods
    private void assertEmptyMatrix(IMatrix matrix) {
        for (int n = 0; n < matrix.getRows(); n++)
            for (int m = 0; m < matrix.getColumns(); m++)
                Assertions.assertEquals(0, matrix.get(n, m));
    }
    // endregion
}