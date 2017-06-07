package Array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestEquilibrium {
    Equilibrium _equilibrium = new Equilibrium();

    @Test
    public void test1() {
        int[] A = {-1, 3, -4, 5, 1, -6, 2, 1};
        assertEquals(1, _equilibrium.equilibrium(A));
    }

    @Test
    public void test2() {
        int[] A = {1, 2, 1, 3, 4};
        assertEquals(3, _equilibrium.equilibrium(A));
    }
}
