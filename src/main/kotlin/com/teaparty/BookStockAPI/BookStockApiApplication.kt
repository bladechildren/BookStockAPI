package com.teaparty.BookStockAPI

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BookStockApiApplication

fun main(args: Array<String>) {
	runApplication<BookStockApiApplication>(*args)
}
