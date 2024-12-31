package com.sample.data.remote.repo

import com.sample.data.remote.api.AuthAPI
import com.sample.domain.dto.login.products.ProductWrapper
import com.sample.domain.repo.ProductRepo

class ProductRepoImpl(private val api: AuthAPI) : ProductRepo {
    override suspend fun getProducts(): ProductWrapper {
        return api.getProducts().mapToDomainProduct()
    }
}