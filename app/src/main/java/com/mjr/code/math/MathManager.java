package com.mjr.code.math;

interface MathManager {
    public abstract void setABC(Long a, Long b, Long c);
    public abstract Long getA();
    public abstract Long getB();
    public abstract Long getC();
    public abstract Long getDelta();
    public abstract Double getX1();
    public abstract Double getX2();
    public abstract Double getXv();
    public abstract Double getYv();
    public abstract String getDominio();
    public abstract String getContraDominio();
    public abstract String getConcavidade();
    public abstract Long valueOf(int n, int p);
    public abstract Long getEES();
    public abstract Long getOrdenadaNaOrigem();
    public abstract String[] getStepDelta();
}
