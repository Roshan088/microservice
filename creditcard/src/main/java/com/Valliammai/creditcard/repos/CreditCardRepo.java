package com.Valliammai.creditcard.repos;

import com.Valliammai.creditcard.model.CreditCard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CreditCardRepo  extends JpaRepository<CreditCard,String> {
}
