import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.core.IsEqual.equalTo;

/**
 * Created by Sougata Bhattacharjee
 * On 18.03.18
 */
@RunWith(JUnitParamsRunner.class)
public class TestDisjointRegionsFinder {

    @Test
    @Parameters(method = "params")
    public void test(final String testCase,
                     final int[][] array, final int expectedRegions) {

        Assert.assertThat(DisjointRegionsFinder.countDisjointRegions(array),
                equalTo(expectedRegions));
    }

    public static Collection<Object[]> params() {

        return Arrays.asList(
                new Object[][]{
                        {"4x4 all zero elements Matrix with 0 regions",
                                new int[][]{
                                        {0, 0, 0, 0},
                                        {0, 0, 0, 0},
                                        {0, 0, 0, 0},
                                        {0, 0, 0, 0}
                                }, 0
                        },
                        {"4x4 empty Matrix with 0 regions",
                                new int[][]{}, 0
                        },
                        {"4x4 null Matrix with 0 regions",
                                null, 0
                        },
                        {"4x4 Matrix with 3 regions",
                                new int[][]{
                                        {1, 1, 0, 1},
                                        {1, 0, 0, 1},
                                        {0, 1, 0, 0},
                                        {0, 0, 0, 0}
                                }, 3
                        },
                        {"4x4 Matrix with 2 regions",
                                new int[][]{
                                        {1, 0, 0, 1},
                                        {1, 0, 1, 1},
                                        {1, 0, 0, 1},
                                        {1, 1, 0, 0}
                                }, 2
                        },
                        {"4x4 Matrix with 1 regions",
                                new int[][]{
                                        {1, 0, 0, 1},
                                        {1, 0, 0, 1},
                                        {1, 0, 0, 1},
                                        {1, 1, 1, 1}
                                }, 1
                        },
                        {"4x4 Matrix with 1 regions",
                                new int[][]{
                                        {1, 1, 1, 1},
                                        {1, 0, 0, 1},
                                        {1, 0, 0, 1},
                                        {1, 0, 0, 1}
                                }, 1
                        },
                        {"4x4 Matrix with 1 regions",
                                new int[][]{
                                        {1, 1, 1, 1},
                                        {1, 0, 0, 1},
                                        {1, 1, 0, 1},
                                        {1, 0, 0, 1}
                                }, 1
                        },
                        {"4x4 Matrix with 2 regions",
                                new int[][]{
                                        {1, 0, 0, 1},
                                        {1, 0, 0, 1},
                                        {1, 0, 0, 1},
                                        {1, 0, 0, 1}
                                }, 2
                        },
                        {"4x4 Matrix with 1 regions",
                                new int[][]{
                                        {1, 1, 1, 1},
                                        {0, 0, 0, 1},
                                        {0, 0, 0, 1},
                                        {1, 1, 1, 1}
                                }, 1
                        },
                        {"4x4 Matrix with 3 regions",
                                new int[][]{
                                        {1, 0, 0, 1},
                                        {0, 0, 0, 1},
                                        {0, 0, 0, 1},
                                        {1, 0, 0, 1}
                                }, 3
                        },
                        {"4x4 Matrix with 4 regions",
                                new int[][]{
                                        {1, 0, 0, 1},
                                        {0, 0, 0, 0},
                                        {0, 0, 0, 1},
                                        {1, 0, 0, 1}
                                }, 4
                        },
                        {"4x4 Matrix with 4 regions",
                                new int[][]{
                                        {1, 0, 0, 1},
                                        {1, 0, 0, 0},
                                        {0, 0, 0, 1},
                                        {1, 0, 0, 1}
                                }, 4
                        },
                        {"4x4 Matrix with 4 regions",
                                new int[][]{
                                        {1, 0, 0, 0},
                                        {0, 1, 0, 0},
                                        {0, 0, 1, 0},
                                        {0, 0, 0, 1}
                                }, 4
                        },
                        {"4x4 Matrix with 6 regions",
                                new int[][]{
                                        {1, 0, 0, 1},
                                        {0, 0, 1, 0},
                                        {0, 1, 0, 0},
                                        {1, 0, 0, 1}
                                }, 6
                        },
                        {"4x4 Matrix with 2 regions",
                                new int[][]{
                                        {1, 0, 0, 1},
                                        {0, 0, 0, 1},
                                        {0, 0, 0, 1},
                                        {0, 0, 0, 1}
                                }, 2
                        },
                        {"4x4 Matrix with 1 regions",
                                new int[][]{
                                        {0, 0, 0, 1},
                                        {0, 1, 1, 1},
                                        {0, 0, 0, 1},
                                        {0, 0, 0, 1}
                                }, 1
                        },
                        {"4x4 Matrix with 2 regions",
                                new int[][]{
                                        {0, 0, 0, 1},
                                        {0, 0, 1, 1},
                                        {0, 1, 0, 1},
                                        {0, 0, 0, 1}
                                }, 2
                        },
                        {"4x4 Matrix with 2 regions",
                                new int[][]{
                                        {0, 0, 0, 0},
                                        {0, 0, 1, 0},
                                        {0, 1, 0, 0},
                                        {0, 0, 0, 0}
                                }, 2
                        },
                        {"4x4 Matrix with 8 regions",
                                new int[][]{
                                        {1, 0, 1, 0},
                                        {0, 1, 0, 1},
                                        {1, 0, 1, 0},
                                        {0, 1, 0, 1}
                                }, 8
                        },
                        {"4x4 Matrix with 6 regions",
                                new int[][]{
                                        {1, 0, 1, 0},
                                        {0, 1, 0, 1},
                                        {1, 0, 1, 1},
                                        {0, 1, 0, 1}
                                }, 6
                        },
                        {"4x4 Matrix with 7 regions",
                                new int[][]{
                                        {1, 0, 1, 0},
                                        {0, 1, 0, 1},
                                        {1, 0, 1, 0},
                                        {0, 1, 0, 0}
                                }, 7
                        },
                        {"4x4 Matrix with 7 regions",
                                new int[][]{
                                        {2, 0, 1, 0},
                                        {0, 1, 0, 1},
                                        {3, 0, 1, 0},
                                        {0, 1, 0, 0}
                                }, 7
                        },
                        {"5x5 Matrix with 7 regions",
                                new int[][]{
                                        {2, 0, 1, 0, 3},
                                        {0, 1, 0, 1, 4},
                                        {3, 0, 1, 0, 5},
                                        {0, 1, 0, 0, 6},
                                        {0, 0, 0, 0, 6}
                                }, 7
                        },
                        {"5x5 Matrix with 7 regions",
                                new int[][]{
                                        {2, 0, 1, 0, 3},
                                        {0, 1, 0, 1, 4},
                                        {3, 0, 1, 0, 5},
                                        {0, 1, 0, 0, 6},
                                        {0, 0, 0, 0, 6}
                                }, 7
                        },
                        {"5x5 Matrix with 2 regions",
                                new int[][]{
                                        {2, 0, 0, 0, 3},
                                        {3, 0, 0, 0, 4},
                                        {3, 0, 0, 0, 5},
                                        {5, 0, 0, 0, 6},
                                        {7, 0, 0, 0, 6}
                                }, 2
                        },
                        {"5x5 Matrix with 3 regions",
                                new int[][]{
                                        {2, 0, 0, 0, 3},
                                        {3, 0, 0, 0, 4},
                                        {3, 0, 5, 0, 5},
                                        {5, 0, 0, 0, 6},
                                        {7, 0, 0, 0, 6}
                                }, 3
                        },
                        {"5x5 Matrix with 1 regions",
                                new int[][]{
                                        {0, 0, 0, 0, 0},
                                        {0, 1, 2, 3, 0},
                                        {0, 8, 9, 4, 0},
                                        {0, 7, 6, 5, 0},
                                        {0, 0, 0, 0, 0}
                                }, 1
                        },
                        {"5x5 Matrix with negative numbers with 5 regions",
                                new int[][]{
                                        {-1, 0, 0, 0, -100},
                                        {0, 1, 2, 3, 0},
                                        {0, 8, 9, 4, 0},
                                        {0, 7, 6, 5, 0},
                                        {-8, 0, 0, 0, -9}
                                }, 5
                        },
                        {"5x5 Matrix with invalid numbers with 0 regions",
                                new int[][]{
                                        {-1, 0, 0, 0, -100},
                                        {0, 1, 2, 3, 0},
                                        {0, 8, Integer.MIN_VALUE, 4, 0},
                                        {0, 7, 6, 5, 0},
                                        {-8, 0, 0, 0, -9}
                                }, 0
                        },
                        {"5x5 Matrix with invalid numbers with 0 regions",
                                new int[][]{
                                        {-1, 0, 0, 0, -100},
                                        {0, 1, 2, 3, 0},
                                        {0, 8, Integer.MAX_VALUE, 4, 0},
                                        {0, 7, 6, 5, 0},
                                        {-8, 0, 0, 0, -9}
                                }, 0
                        },
                }
        );
    }
}
