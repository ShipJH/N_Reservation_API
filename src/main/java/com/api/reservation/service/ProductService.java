package com.api.reservation.service;

import java.util.List;

import com.api.reservation.model.product.response.ProductResponse;

public interface ProductService {

	/**
	 * 해당 매장의 상품리스트를 보여준다
	 * @param bizSeq
	 * @return
	 */
	List<ProductResponse> getProducts(int bizSeq);

}
