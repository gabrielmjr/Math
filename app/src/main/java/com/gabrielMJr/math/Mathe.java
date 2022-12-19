/* autor e criador:
 * Gabriel MJr
 * github.com/gabrielmjr
 */

package com.gabrielMJr.math;

import com.gabrielMJr.math.MathManager;

public class Mathe implements MathManager {

    public static void main(String[] args) {
        return;
    }

    /* Classe principal do pacote
     * abaixo tem todos os métodos principais para funcionamento da classe
     * Os métodos abaixo devem ser sobre-esctitas na classe alvo
     * A classe deve ser extendida na classe alvo
     */


    /* Para Função quadrática
     * 
     */

    @Override
    public void setABC(Long a, Long b, Long c) {
        return;
    };

    @Override
    public Long getA() {
        return Long.valueOf(0);
    }

    @Override
    public Long getB() {
        return Long.valueOf(0);
    }

    @Override
    public Long getC() {
        return Long.valueOf(0);
    }

    @Override
    public Long getDelta() {
        return Long.valueOf(0);
    }

    @Override
    public Double getX1() {
        return 0.0;
    }

    @Override
    public Double getX2() {
        return 0.0;
    }

    @Override
    public Double getXv() {
        return 0.0;
    }

    @Override
    public Double getYv() {
        return 0.0;
    }

    @Override
    public String getDominio() {
        return null;
    }

    @Override
    public String getContraDominio() {
        return null;
    }

    @Override
    public String getConcavidade() {
        return null;
    }

    @Override
    public Long getEES() {
        return Long.valueOf(0);
    }
    
    @Override
    public Long getOrdenadaNaOrigem() {
        return Long.valueOf(1);
    }

     @Override
     public String[] getStepDelta() {
     return new String[2];
     }

    /*
     * Fim da função quadrática
     */

    /*
     * Arranjos
     */

    @Override
    public Long valueOf(int n, int p) {
        return Long.valueOf(0);
    }
}
