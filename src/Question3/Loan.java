/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question3;

/**
 *
 * @author Venkata Gopi Siva Sai Nallapati
 */
public class Loan {

    public String loanType;
    public double loanAmount;
    public int periodOfMonths;

    public Loan(String loanType, double loanAmount, int periodOfMonths) {
        this.loanType = loanType;
        this.loanAmount = loanAmount;
        this.periodOfMonths = periodOfMonths;
    }

    public String getLoanType() {
        return loanType;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public int getPeriodOfMonths() {
        return periodOfMonths;
    }

    @Override
    public String toString() {
        return "Loan:" + "\nLoanType=" + loanType + 
               "\nLoanAmount=" + loanAmount + 
                "\nPeriodOfMonths=" + periodOfMonths;
    }

}
