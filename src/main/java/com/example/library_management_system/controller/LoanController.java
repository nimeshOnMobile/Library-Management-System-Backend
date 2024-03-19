package com.example.library_management_system.controller;

import com.example.library_management_system.model.Loan;
import com.example.library_management_system.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/loans")
public class LoanController {

    @Autowired
    private LoanService loanService;

    @GetMapping
    public List<Loan> getAllLoans(){
        return loanService.findAllLoans();
    }

    @PostMapping("/loan")
    public Loan loanBook(@RequestBody Loan loan){
        return loanService.loanBook(loan);
    }

    @PostMapping("/return/{loanId}")
    public Loan returnBook(@PathVariable Long loanId, @RequestBody Date returnDate){
        return loanService.returnBook(loanId, returnDate);
    }
}
