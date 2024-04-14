package com.benomads.cashcard2m;

import org.springframework.data.annotation.Id;

public record CashCard(@Id Long id, Double amount) {
}

