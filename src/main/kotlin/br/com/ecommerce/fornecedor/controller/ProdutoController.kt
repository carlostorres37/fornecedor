package br.com.ecommerce.fornecedor.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/produtos")
class ProdutoController {

    @GetMapping
    fun getAll(): String {
        return "Hello"
    }

}