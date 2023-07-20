package com.l3gacy.dokka.workflow

import java.text.NumberFormat
import java.util.Locale

inline fun <reified T : Number> T?.toCurrency(locale: Locale = Locale.getDefault()): String = NumberFormat
    .getCurrencyInstance(locale)
    .format(this ?: 0.0)
    .orEmpty()

inline fun <reified T : Number> T?.toPercent(locale: Locale = Locale.getDefault()): String = NumberFormat
    .getPercentInstance(locale)
    .format(this ?: 0.0)
    .orEmpty()
