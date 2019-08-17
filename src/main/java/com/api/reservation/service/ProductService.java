package com.api.reservation.service;

import java.util.List;

import com.api.reservation.model.product.ProductOptionVo;
import com.api.reservation.model.product.response.ProductOneResponse;
import com.api.reservation.model.product.response.ProductResponse;

public interface ProductService {

	/**
	 * 해당 매장의 상품리스트를 보여준다
	 * @param bizSeq
	 * @return
	 */
	List<ProductResponse> getProducts(int bizSeq);

	/**
	 * 해당 매장의 상품 1가지의 상세정보를 가져온다.
	 * @param productSeq
	 * @return
	 */
	ProductOneResponse getProduct(int productSeq);
	
	/**
	 * 상품에대한 옵션을 조회합니다.
	 * @param productSeq
	 * @return
	 */
	List<ProductOptionVo> getOptions(int productSeq);

	

}
