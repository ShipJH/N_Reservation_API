package com.api.reservation.service.Impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.api.reservation.mapper.BizMapper;
import com.api.reservation.model.biz.BizImageDto;
import com.api.reservation.model.biz.BizInfoDto;
import com.api.reservation.model.biz.response.BizInfoMainResponse;
import com.api.reservation.model.biz.response.BizInfoResponse;
import com.api.reservation.model.common.CommonResponseVo;
import com.api.reservation.service.BizService;

@Service
public class BizServiceImpl implements BizService {

	private BizMapper bizMapper;
	
	@Autowired
	public BizServiceImpl(BizMapper bizMapper) {
		this.bizMapper = bizMapper;
	}
	
	

//	@Override
//	public ResponseVo saveBiz(BizInfoDto bizInfoDto) {
//		
//		int insertFlag = 0;
//		try {
//			insertFlag = bizMapper.saveBiz(bizInfoDto);
//		} catch (Exception e) {
//			return ResponseVo.builder().httpStatus(HttpStatus.INTERNAL_SERVER_ERROR).build();
//		}
//		
//		if(insertFlag > 0) {
//			return ResponseVo.builder().httpStatus(HttpStatus.OK).build();
//		}
//		
//		return ResponseVo.builder().httpStatus(HttpStatus.BAD_REQUEST).build();
//	}


	@Override
	public List<BizInfoResponse> getBizAllList() {
		
		List<BizInfoResponse> response = new ArrayList<>();
		List<BizInfoDto> bizInfo = bizMapper.getBizInfoList();
		
		bizInfo.stream().forEach(l -> {
			
			BizInfoResponse bizInfoResponse = new BizInfoResponse();
			
			bizInfoResponse.setBizSeq(l.getBizSeq());
			
			bizInfoResponse.setBizInfo(BizInfoDto.builder()
									 .bizSeq(l.getBizSeq())
									 .bizName(l.getBizName())
									 .bizNum(l.getBizNum())
									 .bizType(l.getBizType())
									 .bizAddress(l.getBizAddress())
									 .bizZipcode(l.getBizZipcode())
									 .bizMapLat(l.getBizMapLat())
									 .bizMapLon(l.getBizMapLon())
									 .bizTel(l.getBizTel())
									 .bizDes(l.getBizDes())
									 .bizSimpleDes(l.getBizSimpleDes())
									 .approveYn(l.getApproveYn())
									 .useYn(l.getUseYn())
									 .regDate(l.getRegDate())
									 .updDate(l.getUpdDate())
									 .build() );
			
			List<BizImageDto> bizImageList = bizMapper.getBizImgList(l.getBizSeq());
			bizInfoResponse.setBizImageList(bizImageList);
			
			response.add(bizInfoResponse);
		});
		
		return response;
	}



	@Override
	public List<BizInfoMainResponse> getBizMainList() {
		List<BizInfoMainResponse> response = new ArrayList<>();
		List<BizInfoDto> bizInfo = bizMapper.getBizInfoList();
		
		bizInfo.stream().forEach(l -> {
			
			BizInfoMainResponse bizInfoMainResponse = new BizInfoMainResponse();
			
			bizInfoMainResponse.setBizSeq(l.getBizSeq());
			
			bizInfoMainResponse.setBizInfo(BizInfoDto.builder()
									 .bizSeq(l.getBizSeq())
									 .bizName(l.getBizName())
									 .bizNum(l.getBizNum())
									 .bizType(l.getBizType())
									 .bizAddress(l.getBizAddress())
									 .bizZipcode(l.getBizZipcode())
									 .bizMapLat(l.getBizMapLat())
									 .bizMapLon(l.getBizMapLon())
									 .bizTel(l.getBizTel())
									 .bizDes(l.getBizDes())
									 .bizSimpleDes(l.getBizSimpleDes())
									 .approveYn(l.getApproveYn())
									 .useYn(l.getUseYn())
									 .regDate(l.getRegDate())
									 .updDate(l.getUpdDate())
									 .build() );
			
			List<BizImageDto> bizImageList = bizMapper.getBizImgList(l.getBizSeq());
			if(bizImageList.size() > 0) {
				bizInfoMainResponse.setImg(bizImageList.get(0).getImgPath());
			}
			response.add(bizInfoMainResponse);
		});
		
		return response;
	}



	@Override
	public BizInfoResponse getBiz(int bizSeq) {

		BizInfoDto bizInfoDto = bizMapper.getBiz(bizSeq);
		List<BizImageDto> bizImageList = bizMapper.getBizImgList(bizSeq);
		
		BizInfoResponse response = new BizInfoResponse();
		response.setBizInfo(bizInfoDto);
		response.setBizImageList(bizImageList);
		
		return response;
	}


}
