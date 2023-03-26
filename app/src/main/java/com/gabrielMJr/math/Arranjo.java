package com.gabrielmjr.math;

import com.gabrielmjr.math.Mathe;

public class Arranjo extends Mathe {
    private int n;
    private int p;

    @Override
    public Long valueOf(int n, int p) {
        this.setN(n);
        this.setP(p);
        return this.genArranjos();
    }

    private Long genArranjos() {
        Long n = Long.valueOf(this.getN());
        Long p = Long.valueOf(this.getP());
        Long result = Long.valueOf(1);

        for (Long i = p; i > 0; i--) {
            result *= n;
            n--;
        }
        return result;
    } 


    private void setN(int n) {
        this.n = n;
    }

    private int getN() {
        return this.n;
    }

    private void setP(int p) {
        this.p = p;
    }

    private int getP() {
        return this.p;
    }
}
