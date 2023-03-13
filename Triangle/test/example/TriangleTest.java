package example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTest {

    @Test
    public void equilateralTriangleHaveEqualSides() throws Exception {
        Triangle triangle = new Triangle(2, 2, 2);

        assertEquals(TriangleKind.EQUILATERAL, triangle.getKind());
    }

    @Test
    public void verificandoTrianguloIsosceles() throws Exception {
        Triangle triangle = new Triangle(5, 5, 8);

        assertEquals(TriangleKind.ISOSCELES, triangle.getKind());
    }

    @Test
    public void verificandoTrianguloEscaleno() throws Exception {
        Triangle triangle = new Triangle(3, 4, 5);

        assertEquals(TriangleKind.SCALENE, triangle.getKind());
    }

    @Test
    public void trianguloInvalidoLadoNegativo() {

        assertThrows(TriangleException.class, () -> new Triangle(1, -4, 9));
    }

    @Test
    public void TestandoDesigualdadeTriangular() {

        assertThrows(TriangleException.class, () -> new Triangle(1, 2, 4));
    }

    @Test
    public void trianguloComUmDosLadosZero() {

        assertThrows(TriangleException.class, () -> new Triangle(0, 3, 4));
    }

    @Test
    public void trianguloComTodosOSLadosZero() {

        assertThrows(TriangleException.class, () -> new Triangle(0, 0, 0));
    }

    @Test
    public void testNumeroDeLadosUnicos() throws TriangleException {
        Triangle triangulo = new Triangle(3, 3, 3);
        assertEquals(1, triangulo.getNumberOfUniqueSides());

        triangulo = new Triangle(7, 7, 10);
        assertEquals(2, triangulo.getNumberOfUniqueSides());

        triangulo = new Triangle(5, 6, 7);
        assertEquals(3, triangulo.getNumberOfUniqueSides());
    }
}