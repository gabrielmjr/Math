package com.gabrielmjr.math;

import com.gabrielmjr.math.Mathe;

public class SDF extends Mathe {
    // Atributos
    private Long a;
    private Long b;
    private Long c;
    private Long delta;
    private Double x1;
    private Double x2;
    private Double xv;
    private Double yv;
    private String dominio;
    private String contradominio;
    private String concavidade;
    private Long ees;
    private Long oo;
    private String[] stepDelta;

    // Calcular delta
    private void genDelta() {
        this.setDelta((b * b) - 4 * a * c);
        this.genStepDelta();
        this.genX12();
        this.setEES(this.getA());
        this.setOrdenadaNaOrigem(this.getC());
    }

    // Passo a passo de como calcular delta
     private void genStepDelta() {
     String[] steps = new String[5];
     String a;
     String b;
     String c;
     Double s1 = Math.pow(this.getB(), 2);
     Long s2 = this.getA() * this.getC();
     String s2f;
     Long s3 = -4 * s2;
     String s3f;
     String signal;

     if (this.getA() < 0) {
     a = "(" + this.getA() + ")";
     } else {
     a = String.valueOf(this.getA());
     }

     if (this.getB() < 0) {
     b = "(" + this.getB() + ")";
     } else {
     b = String.valueOf(this.getB());
     }

     if (this.getC() < 0) {
     c = "(" + this.getC() + ")";
     } else {
     c = String.valueOf(this.getC());
     }
     
     if (s2 < 0) {
       s2f = "(" + s2 + ")";
     } else {
       s2f = String.valueOf(s2);
     }
     
     if (s3 < 0) {
       signal = "";
       s3f = "- " + -s3;
     } else {
       signal = "+";
       s3f = String.valueOf(s3);
     }

     steps[0] = "∆ = (b)² - 4 × a × c";
     steps[1] = "∆ = " + b + "² - 4 × " + a + " × " + c;
     steps[2] = "∆ = " + s1 + " - 4 × " + s2f;
     steps[3] = "∆ = " + s1 + " " + signal + " " + s3f;
     steps[4] = "∆ = " + (s1 + s3);      
     this.setStepDelta(steps);
     }

    // Calcular X1 e X2
    private void genX12() {
        Double x1;
        Double x2;
        x1 = (- b - Math.sqrt(this.getDelta())) / (2 * this.getA());
        x2 = (- b + Math.sqrt(this.getDelta())) / (2 * this.getA());

        //Verificar o maior número para definir x1 e x2
        if (x1 > x2) {
            this.setX1(x2);
            this.setX2(x1);
        } else {
            this.setX1(x1);
            this.setX2(x2);
        }

        // De seguida fazer o estudo do gráfico
        this.genGraphInfo();
    }
    
    // Fazer estudo do gráfico
    private void genGraphInfo() {
        // Para xv (x1 + x2) /2
        this.setXv((this.getX1() + this.getX2()) / 2);

        // Para yv (-∆) / (4 * a)
        this.setYv(Double.valueOf(- this.getDelta()) / (4 * this.getA()));

        // Dominio, sempee R
        this.setDominio("R");

        // Contradominio
        this.genCDf();
    }

    // ContraDominio
    private void genCDf() {
        Long a = this.getA();
        Long delta = this.getDelta();
        Double yv = this.getYv();
        String concavidade;
        String cdf;

        if (a > 0 && delta > 0) {
            cdf = "]" + yv + "; +∞[";
            concavidade = " cima e duas raízes reais distintas";
        } else if (a > 0 && delta == 0) {
            cdf = "]" + yv + "; +∞[";
            concavidade = " cima e uma raiz dupla, ou seja, x1 = x2";
        } else if (a > 0 && delta < 0) {
            cdf = "]" + yv + "; +∞[";
            concavidade = " cima e sem raízes reais";
        } else if (a < 0 && delta > 0) {
            cdf = "]-∞; " + yv + "[";
            concavidade = " baixo e duas raizes reais distintas";
        } else if (a < 0 && delta == 0) {
            cdf = "]-∞; " + yv + "[";
            concavidade = " baixo e uma raiz dupla  ou seja, x1 = x2";
        } else if (a < 0 && delta < 0) {
            cdf = "]-∞; " + yv + "[";
            concavidade = " baixo e sem raízes reais";
        } else {
            cdf = "";
            concavidade = "";
        }

        // Mandar os valores para as variáveis principais
        this.setContraDominio(cdf);
        this.setConcavidade(concavidade);
    }

    //Setters e Getters
    @Override
    public void setABC(Long a, Long b, Long c) {
        this.setA(a);
        this.setB(b);
        this.setC(c);
        this.genDelta();
    }

    private void setA(Long a) {
        this.a = a;
    }

    @Override
    public Long getA() {
        return this.a;
    }

    private void setB(Long b) {
        this.b = b;
    }

    @Override
    public Long getB() {
        return this.b;
    }

    private void setC(Long c) {
        this.c = c;
    }

    @Override
    public Long getC() {
        return this.c;
    }

    private void setDelta(Long delta) {
        this.delta = delta;
    }

    @Override
    public Long getDelta() {
        return this.delta;
    }

    private void setX1(Double x1) {
        this.x1 = x1;
    }

    @Override
    public Double getX1() {
        return this.x1;
    }

    private void setX2(Double x2) {
        this.x2 = x2;
    }

    @Override
    public Double getX2() {
        return this.x2;
    }

    private void setXv(Double xv) {
        this.xv = xv;
    }

    @Override
    public Double getXv() {
        return this.xv;
    }

    private void setYv(Double yv) {
        this.yv = yv;
    }

    @Override
    public Double getYv() {
        return this.yv;
    }

    private void setDominio(String dominio) {
        this.dominio = dominio;
    }

    @Override
    public String getDominio() {
        return this.dominio;
    }

    private void setContraDominio(String CDf) {
        this.contradominio = CDf;
    }

    @Override
    public String getContraDominio() {
        return this.contradominio;
    }

    private void setConcavidade(String concavidade) {
        this.concavidade = concavidade;
    }

    @Override
    public String getConcavidade() {
        return this.concavidade;
    }

    private void setEES(Long ees) {
        this.ees = ees;
    }

    @Override
    public Long getEES() {
        return this.ees;
    }
    
    private void setOrdenadaNaOrigem(Long OO) {
        this.oo = OO;
    }
   
    @Override
    public Long getOrdenadaNaOrigem() {
        return this.oo;
    }

     private void setStepDelta(String[] stepDelta) {
     this.stepDelta = stepDelta;
     }

     @Override
     public String[] getStepDelta() {
     return this.stepDelta;
     }

}
