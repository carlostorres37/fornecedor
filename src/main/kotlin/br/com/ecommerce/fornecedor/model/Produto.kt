package br.com.ecommerce.fornecedor.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Produto (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long,
    val nome: String,
    val descricao: String,
    val foto: String,
    val preco: String,
    val quantidade: Int = 0

)