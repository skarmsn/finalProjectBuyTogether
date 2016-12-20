package com.buy.together.dao;

import java.util.List;

import com.buy.together.domain.AttachedPhoto;
import com.buy.together.domain.BuyTogether;
import com.buy.together.domain.BuyTogetherAddress;
import com.buy.together.domain.Category;
import com.buy.together.domain.HuntingStatus;
import com.buy.together.domain.HuntingType;
import com.buy.together.domain.ListSearchCriteria;
import com.buy.together.domain.MySearchCriteria;
import com.buy.together.dto.BuyTogetherDTO;

public interface BuyTogetherDao {
	
	public int searchBuyTogetherCount(ListSearchCriteria cri) throws Exception;
	
	public List<BuyTogetherDTO> searchBuyTogetherList(ListSearchCriteria cri) throws Exception;
		
	public List<BuyTogetherDTO> buyTogetherList(MySearchCriteria cri) throws Exception;
	
	public List<AttachedPhoto> photoList(Integer buytogether_number) throws Exception;
	
	public List<Category> categoryList() throws Exception;
	
	public List<HuntingType> huntingTypeList() throws Exception;
	
	public List<HuntingStatus> huntingStatusList() throws Exception;
	
	public void buyTogetherInsert(BuyTogether buyTogether) throws Exception;
	
	public Integer getBuyTogetherNumber(BuyTogether buyTogether) throws Exception;

	public void buyTogetherAddressInsert(BuyTogetherAddress BuyTogetherAddress) throws Exception;
	
	public void buyTogetherPhotoInsert(AttachedPhoto AttachedPhoto) throws Exception;

}
