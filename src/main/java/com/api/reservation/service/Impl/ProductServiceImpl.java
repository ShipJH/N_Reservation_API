package com.api.reservation.service.Impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.reservation.mapper.ProductMapper;
import com.api.reservation.model.product.ProductImageVo;
import com.api.reservation.model.product.ProductOptionVo;
import com.api.reservation.model.product.ProductVo;
import com.api.reservation.model.product.response.ProductResponse;
import com.api.reservation.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{

	private ProductMapper productMapper;
	
	@Autowired
	public ProductServiceImpl(ProductMapper productMapper) {
		this.productMapper = productMapper;
	}
	
	@Override
	public List<ProductResponse> getProducts(int bizSeq) {

		List<ProductResponse> response = new ArrayList<>();
		List<ProductVo> productVo = productMapper.getProducts(bizSeq);
		
		productVo.stream().forEach(l -> {
			
			ProductResponse productResponse = new ProductResponse();
			
			productResponse.setProductSeq(l.getProductSeq());
			
			productResponse.setProduct(ProductVo.builder()
												.productSeq(l.getProductSeq())
												.bizSeq(l.getBizSeq())
												.productName(l.getProductName())
												.productDes(l.getProductDes())
												.productType(l.getProductType())
												.multiYn(l.getMultiYn())
												.useYn(l.getUseYn())
												.payYn(l.getPayYn())
												.regDate(l.getRegDate())
												.updDate(l.getUpdDate())
												.build() );
			
			List<ProductImageVo> productImageList = productMapper.getProductImgList(l.getProductSeq(), l.getBizSeq());
			productResponse.setProductImageList(productImageList);
			
			response.add(productResponse);
		});
		
		return response;
	}

	@Override
	public List<ProductOptionVo> getOptions(int productSeq) {
		return productMapper.getOptions(productSeq);
	}

	
	@Override
	public ProductVo getProduct(int productSeq) {
		// TODO Auto-generated method stub
		return null;
	}

}
