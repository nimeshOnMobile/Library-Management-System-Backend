package com.example.library_management_system.service;

import com.example.library_management_system.model.Loan;
import com.example.library_management_system.repository.LoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class LoanService {

    @Autowired
    private LoanRepository loanRepository;

    public List<Loan> findAllLoans(){
        return loanRepository.findAll();
    }

    public Loan loanBook(Loan loan){
        return loanRepository.save(loan);
    }

    public Loan returnBook(Long loanId, Date returnDate){
        Loan loan = loanRepository.findById(loanId).get();
        loan.setReturnDate(returnDate);
        return loanRepository.save(loan);
    }
}
