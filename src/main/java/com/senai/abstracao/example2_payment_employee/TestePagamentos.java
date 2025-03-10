package com.senai.abstracao.example2_payment_employee;

import java.util.ArrayList;
import java.util.List;

public class TestePagamentos {

    public static void main(String[] args) {
        List<Pagamentos> pagamentosList = new ArrayList<>();
        pagamentosList.add(new CLT("Rafael",10000));
        pagamentosList.add(new PJ("Andrew",8,10));
        pagamentosList.add(new Freelancer("Thomas",10000));
    }
}
