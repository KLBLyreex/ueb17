package main;

import java.util.function.IntPredicate;

public interface MyFunctionErweiterung extends MyFunction {

    default public MyFunctionErweiterung conditionateInput(IntPredicate ipred){
        return (int value) -> {
            if(ipred.test(value)){
                return apply(value);
            } else {
                return 0;
            }
        };
    }

    default public MyFunctionErweiterung condiitionateOutput(IntPredicate iped){
        return (int value) -> {
            if(iped.test(apply(value))){
                return apply(value);
            } else {
                return 0;
            }
        };
    }
}
