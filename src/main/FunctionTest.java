package main;

import org.junit.Test;

public class FunctionTest {

    @Test
    public void xQuadrat() throws Exception{
        if (LambdaAusdruecke.xQuadratLambda.apply(5) == 25){

        }else{
            throw new Exception();
        }
    }

    @Test
    public void xFakultaet() throws Exception{
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
    public void xhochxPlus1() throws Exception{
        if (LambdaAusdruecke.xHochXPlus1Lambda.apply(5) == 15625){

        }else{
            throw new Exception();
        }
    }

    @Test
    public void fibonacci() throws Exception{
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
        if (LambdaAusdruecke.xHochXPlus1Lambda.apply(5) == 17625){

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

    @Test
    public void aufgabeE() throws Exception{
        if (LambdaAusdruecke.xQuadratLambda2.conditionateInput(LambdaAusdruecke.even).apply(4)==16){

        }else{
            throw new Exception();
        }

    }

    @Test(expected = Exception.class)
    public void aufgabeE_NEG() throws Exception{
        if (LambdaAusdruecke.xQuadratLambda2.conditionateInput(LambdaAusdruecke.even).apply(3)==9){

        }else{
            throw new Exception();
        }

    }

    @Test
    public void aufgabeF() throws Exception{
        if (LambdaAusdruecke.xFakultaetLambda2.condiitionateOutput(LambdaAusdruecke.even).apply(5)==120){

        }else{
            throw new Exception();
        }
    }

    @Test(expected = Exception.class)
    public void aufgabeF_NEG() throws Exception{
        if (LambdaAusdruecke.xFakultaetLambda2.condiitionateOutput(LambdaAusdruecke.even).apply(5)==0){

        }else{
            throw new Exception();
        }
    }

    @Test
    public void aufgabeF_odd() throws Exception{
        if (LambdaAusdruecke.xFakultaetLambda2.condiitionateOutput(LambdaAusdruecke.odd).apply(1)==1){

        }else{
            throw new Exception();
        }
    }

    @Test(expected = Exception.class)
    public void aufgabeF_odd_NEG() throws Exception{
        if (LambdaAusdruecke.xFakultaetLambda2.condiitionateOutput(LambdaAusdruecke.odd).apply(1)==0){

        }else{
            throw new Exception();
        }
    }
}