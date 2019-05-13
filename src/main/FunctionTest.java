package main;

import org.junit.Test;

public class FunctionTest {

    @Test
    public void bi() throws Exception{
        if (LambdaAusdruecke.xQuadratLambda.apply(5) == 25){

        }else{
            throw new Exception();
        }
    }

    @Test
    public void bii() throws Exception{
        if (LambdaAusdruecke.xFakultaetLambda.apply(8) == 40320){

        }else{
            throw new Exception();
        }

        if (FakultaetKlasse.FakultaetBerechnen(8) == 40320){

        }else{
            throw new Exception();
        }
    }

    @Test
    public void biii() throws Exception{
        if (LambdaAusdruecke.xhochxPlus1Lambda.apply(5) == 15625){

        }else{
            throw new Exception();
        }
    }

    @Test
    public void biv() throws Exception{
        if (LambdaAusdruecke.fibonacciLambda.apply(7) == 13){

        }else{
            throw new Exception();
        }
    }

    @Test(expected = Exception.class)
    public void biN() throws Exception{
        if (LambdaAusdruecke.xQuadratLambda.apply(5) == 20){

        }else{
            throw new Exception();
        }
    }

    @Test(expected = Exception.class)
    public void biiN() throws Exception{
        if (LambdaAusdruecke.xFakultaetLambda.apply(8) == 40620){

        }else{
            throw new Exception();
        }

        if (FakultaetKlasse.FakultaetBerechnen(8) == 40620){

        }else{
            throw new Exception();
        }
    }

    @Test(expected = Exception.class)
    public void biiiN() throws Exception{
        if (LambdaAusdruecke.xhochxPlus1Lambda.apply(5) == 17625){

        }else{
            throw new Exception();
        }
    }

    @Test(expected = Exception.class)
    public void bivN() throws Exception{
        if (LambdaAusdruecke.fibonacciLambda.apply(7) == 15){

        }else{
            throw new Exception();
        }
    }
}