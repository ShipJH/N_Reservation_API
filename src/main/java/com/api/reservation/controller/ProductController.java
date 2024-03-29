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

import com.api.reservation.model.product.ProductOptionVo;
import com.api.reservation.model.product.response.ProductOneResponse;
import com.api.reservation.model.product.response.ProductResponse;
import com.api.reservation.service.ProductService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;

@Slf4j
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
	
	@ApiOperation(value = "상품상세정보 조회 API")
	@GetMapping(value = "/product/{productSeq}")
	public ResponseEntity<ProductOneResponse> getProduct(@PathVariable int productSeq) {
		
		log.info("상품 조회 접근 prductSeq : " + productSeq);
		ProductOneResponse res = productService.getProduct(productSeq);
		
		return new ResponseEntity<>(res, HttpStatus.OK);
	}
	
	@ApiOperation(value = "상품옵션 조회 API")
	@GetMapping(value = "/options/{productSeq}")
	public ResponseEntity<List<ProductOptionVo>> getOptions(@PathVariable int productSeq) {
		
		log.info("상품옵션 조회 접근 prductSeq : " + productSeq);
		List<ProductOptionVo> res = productService.getOptions(productSeq);
		
		return new ResponseEntity<>(res, HttpStatus.OK);
	}
	

	
	
}
