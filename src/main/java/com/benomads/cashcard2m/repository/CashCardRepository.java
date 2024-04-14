package com.benomads.cashcard2m.repository;

import com.benomads.cashcard2m.CashCard;
import org.springframework.data.repository.CrudRepository;
interface CashCardRepository extends CrudRepository<CashCard, Long> {
}
