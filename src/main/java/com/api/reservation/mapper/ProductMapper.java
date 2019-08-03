package com.api.reservation.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.api.reservation.model.product.ProductImageVo;
import com.api.reservation.model.product.ProductOptionVo;
import com.api.reservation.model.product.ProductVo;

@Mapper
public interface ProductMapper {

	@Select( "  SELECT * "
			+ "   FROM PRODUCT "
			+ "  WHERE BIZ_SEQ = #{bizSeq} "
			+ " " )
	List<ProductVo> getProducts(int bizSeq);

	@Select("   SELECT * "
			+ "   FROM PRODUCT_IMAGE "
			+ "  WHERE PRODUCT_SEQ = #{productSeq} "
			+ "    AND BIZ_SEQ = #{bizSeq} "
			+ " ")
	List<ProductImageVo> getProductImgList(@Param("productSeq") int productSeq, @Param("bizSeq") int bizSeq);

	@Select("  SELECT * "
			+ "  FROM PRODUCT_OPTION "
			+ " WHERE PRODUCT_SEQ = #{productSeq} "
			+ " ")
	List<ProductOptionVo> getOptions(int productSeq);

}
