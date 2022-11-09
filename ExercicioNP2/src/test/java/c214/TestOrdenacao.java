package c214;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.*;

import c214.OrdenaBubbleSort;
import c214.OrdenaInsertionSort;
import c214.OrdenaSelectionSort;
import c214.Ordenacao;
import c214.strategy.impl.BubbleSort;
import c214.strategy.impl.InsertionSort;
import c214.strategy.impl.SelectionSort;

public class TestOrdenacao {
    Ordenacao ordenacao;
    List<Integer> lista;
    List<Integer> esperado;

    @Before
    public void init() {
        this.lista = Arrays.asList(5, 4, 1, 2, 3, 7, 8, 6);
        this.esperado = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
    }

    @Test
    public void testSelectionSort() {
        this.ordenacao = new OrdenaSelectionSort();
        Assert.assertTrue(this.ordenacao.getStrategy() instanceof SelectionSort);
    }

    @Test
    public void testOrdenaSelectionSort() {
        this.ordenacao = new OrdenaSelectionSort();
        List<Integer> resultado = this.ordenacao.ordena(this.lista);
        Assert.assertEquals(this.esperado, resultado);
    }

    @Test
    public void testBubbleSort() {
        this.ordenacao = new OrdenaBubbleSort();
        Assert.assertTrue(this.ordenacao.getStrategy() instanceof BubbleSort);
    }

    @Test
    public void testOrdenaBubbleSort() {
        this.ordenacao = new OrdenaBubbleSort();
        List<Integer> resultado = this.ordenacao.ordena(this.lista);
        Assert.assertEquals(this.esperado, resultado);
    }

    @Test
    public void testInsertionSort() {
        this.ordenacao = new OrdenaInsertionSort();
        Assert.assertTrue(this.ordenacao.getStrategy() instanceof InsertionSort);
    }

    @Test
    public void testOrdenaInsertionSort() {
        this.ordenacao = new OrdenaInsertionSort();
        List<Integer> resultado = this.ordenacao.ordena(this.lista);
        Assert.assertEquals(this.esperado, resultado);
    }
}