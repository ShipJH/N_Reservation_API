package com.api.reservation.model.product.response;

import java.util.List;

import com.api.reservation.model.product.ProductImageVo;
import com.api.reservation.model.product.ProductVo;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor @AllArgsConstructor
@Builder
@Getter @Setter
public class ProductResponse {

	@ApiModelProperty(value="상품번호", dataType="int")
	private int productSeq;
	
	@ApiModelProperty(value="상품정보", dataType="Object")
	private ProductVo product;
	
	@ApiModelProperty(value="상품 이미지리스트", dataType="Object")
	private List<ProductImageVo> productImageList;
	
}
