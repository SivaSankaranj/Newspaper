package com.project.newspaperservice;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.project.dto.NewspaperDto;
import com.project.newspaper.dao.NewspaperDao;
import com.project.newspaper.entity.Newspaper;

@Component
public class NewspaperServiceImpl implements NewspaperServiceDAO {
	@Autowired
	private NewspaperDao newspaperDao;
	
	public NewspaperServiceImpl() {
		System.out.println("object is created:"+this.getClass().getName());
	}

	@Override
	public boolean validateNewspaperdto(NewspaperDto newspaperDto) {
		System.out.println("Invoked validate newspaperDTO");
		boolean flag=false;
		if(newspaperDto.getNewspaperName()!=null &&! newspaperDto.getNewspaperName().isEmpty()) {
			flag=true;
			}
		else {
			flag=false;
			System.out.println("Newspaper name is invalid");
			return flag;
			}
		if(newspaperDto.getPrice()>0){
			flag=true;
			}
		else {
			flag=false;
			System.out.println("Newspaper price is Invalid");
			return flag;
		}
		if(newspaperDto.getLanguage()!=null &&! newspaperDto.getLanguage().isEmpty()) {
			flag=true;
			}
		else {
			flag=false;
			System.out.println("Newspaper language is invalid");
			return flag;
			}
		if(newspaperDto.getNoOfPages()!=null &&! newspaperDto.getNoOfPages().isEmpty()) {
			flag=true;
			}
		else {
			flag=false;
			System.out.println("Newspaper noOfPages is invalid");
			return flag;
			}
		return flag;
	}

	@Override
	public boolean savenewspaperdto(NewspaperDto newspaperDto) {
		System.out.println("Invoked save newspaperdto method()");
		Newspaper newspaper=new Newspaper();
		BeanUtils.copyProperties(newspaperDto, newspaper);
		boolean result=this.newspaperDao.saveNewspaperEntity(newspaper);
		return result;
	}

}
