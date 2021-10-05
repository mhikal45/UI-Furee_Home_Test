package com.tugas.fureehometest.data

import com.tugas.fureehometest.R

val paymentMethod = listOf<PaymentMethod>(
    PaymentMethod(
        id = 0,
        method = "Paypal",
        pic = R.drawable.paypal
    ),
    PaymentMethod(
        id = 1,
        method = "Credit Card",
        pic = R.drawable.credit_card
    )
)