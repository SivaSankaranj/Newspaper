package com.project.newspaperservice;

import com.project.dto.NewspaperDto;

public interface NewspaperServiceDAO {
	boolean validateNewspaperdto(NewspaperDto newspaperDto); 
	boolean savenewspaperdto(NewspaperDto newspaperDto);

}
