package com.api.reservation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.reservation.model.product.response.ProductResponse;
import com.api.reservation.service.ProductService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin( value="*" )
@RestController
@RequestMapping(value = "/product")
@Api(tags = "상품 관련 API", value = "상품 관련 API", description = "상품 관련 API")
public class ProductController {

	private ProductService productService;
	
	@Autowired
	public ProductController(ProductService productService) {
		this.productService = productService;
	}
	
	@ApiOperation(value = "상품리스트 조회 API")
	@GetMapping(value = "/products/{bizSeq}")
	public ResponseEntity<List<ProductResponse>> getProducts(@PathVariable int bizSeq) {
		
		List<ProductResponse> res = productService.getProducts(bizSeq);
		
		return new ResponseEntity<>(res, HttpStatus.OK);
	}
	
	
}
