package main;

import org.junit.Test;

public class FunctionTest {

    @Test
    public void xQuadrat() throws MathException{
        if (LambdaAusdruecke.xQuadratLambda.apply(5) == 25){

        }else{
            throw new MathException();
        }
    }

    @Test
    public void xFakultaet() throws MathException{
        if (LambdaAusdruecke.xFakultaetLambda.apply(8) == 40320){

        }else{
            throw new MathException();
        }

        if (FakultaetKlasse.FakultaetBerechnen(8) == 40320){

        }else{
            throw new MathException();
        }
    }

    @Test
    public void xhochxPlus1() throws MathException{
        if (LambdaAusdruecke.xHochXPlus1Lambda.apply(5) == 15625){

        }else{
            throw new MathException();
        }
    }

    @Test
    public void fibonacci() throws MathException{
        if (LambdaAusdruecke.fibonacciLambda.apply(7) == 13){

        }else{
            throw new MathException();
        }
    }

    @Test(expected = MathException.class)
    public void xQuadrat_NEG() throws MathException{
        if (LambdaAusdruecke.xQuadratLambda.apply(5) == 20){

        }else{
            throw new MathException();
        }
    }

    @Test(expected = MathException.class)
    public void fakultaet_NEG() throws MathException{
        if (LambdaAusdruecke.xFakultaetLambda.apply(8) == 40620){

        }else{
            throw new MathException();
        }

        if (FakultaetKlasse.FakultaetBerechnen(8) == 40620){

        }else{
            throw new MathException();
        }
    }

    @Test(expected = MathException.class)
    public void xHochXPlus1_NEG() throws MathException{
        if (LambdaAusdruecke.xHochXPlus1Lambda.apply(5) == 17625){

        }else{
            throw new MathException();
        }
    }

    @Test(expected = MathException.class)
    public void fibonacci_NEG() throws MathException{
        if (LambdaAusdruecke.fibonacciLambda.apply(7) == 15){

        }else{
            throw new MathException();
        }
    }

    @Test
    public void xQuadratEven() throws MathException{
        if (LambdaAusdruecke.xQuadratLambda2.conditionateInput(LambdaAusdruecke.even).apply(4)==16){

        }else{
            throw new MathException();
        }

    }

    @Test(expected = MathException.class)
    public void xQuadratEven_NEG() throws MathException{
        if (LambdaAusdruecke.xQuadratLambda2.conditionateInput(LambdaAusdruecke.even).apply(3)==9){

        }else{
            throw new MathException();
        }

    }

    @Test
    public void fakultaetEven() throws MathException{
        if (LambdaAusdruecke.xFakultaetLambda2.condiitionateOutput(LambdaAusdruecke.even).apply(5)==120){

        }else{
            throw new MathException();
        }
    }

    @Test(expected = MathException.class)
    public void fakultaetEven_NEG() throws MathException{
        if (LambdaAusdruecke.xFakultaetLambda2.condiitionateOutput(LambdaAusdruecke.even).apply(5)==0){

        }else{
            throw new MathException();
        }
    }

    @Test
    public void fakultaetEven_odd() throws MathException{
        if (LambdaAusdruecke.xFakultaetLambda2.condiitionateOutput(LambdaAusdruecke.odd).apply(1)==1){

        }else{
            throw new MathException();
        }
    }

    @Test(expected = MathException.class)
    public void fakultaetEven_odd_NEG() throws MathException{
        if (LambdaAusdruecke.xFakultaetLambda2.condiitionateOutput(LambdaAusdruecke.odd).apply(1)==0){

        }else{
            throw new MathException();
        }
    }
}