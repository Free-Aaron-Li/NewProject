package com.abnormal.exercise;

import java.io.Serial;

/**
 * @projectName: newJavaProject
 * @className: EcDef
 * @author: AaronLi
 * @description: nothing
 * @date: 2022/5/15 17:34
 * @version: JDK17
 */
public class EcDef extends Exception{
    @Serial
    private static final long serialVersionUID = 2821441833165501888L;
    public EcDef(){}
    public EcDef(String EcDef){
        super(EcDef);
    }
}
