package com.company.models.plano;

import com.company.models.Plano;
import com.company.models.Usuario;

public class PlanoPremium extends Plano {
    public PlanoPremium(String nomePlano, int nivelAcesso, String resolucao, double valor) {
        super(nomePlano, nivelAcesso, resolucao, valor);
    }
}
