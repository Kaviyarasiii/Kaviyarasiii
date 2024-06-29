package in.dev.gmsk.variables;

import org.junit.jupiter.api.Test;

import static in.dev.gmsk.variables.ExercisesVariables.*;
import static org.junit.jupiter.api.Assertions.*;

class ExercisesVariablesTest {

    @Test
    void testExercisesUnaryOperators() {
        exercisesUnaryOperators();
        assertTrue(true);
    }

    @Test
    void testPrintStaircase() {
        printStaircase(6);
        assertTrue(true);
    }
}