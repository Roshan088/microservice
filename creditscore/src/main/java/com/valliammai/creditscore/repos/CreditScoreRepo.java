package com.valliammai.creditscore.repos;

import com.valliammai.creditscore.model.CreditScore;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CreditScoreRepo extends JpaRepository<CreditScore,String> {

}
