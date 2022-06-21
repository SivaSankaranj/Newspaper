package com.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.project.dto.NewspaperDto;
import com.project.newspaperservice.NewspaperServiceImpl;

@Component
@RequestMapping("/")
public class NewspaperController {
	@Autowired
	private NewspaperServiceImpl serviceImpl;

	public NewspaperController() {
		System.out.println("object is created:" + this.getClass().getName());
	}

	@RequestMapping("/save.do")
	public String saveNewspaperDetails(@ModelAttribute NewspaperDto newspaper, Model model) {
		System.out.println("Invoked save Newspaper details method()");
		if (this.serviceImpl.validateNewspaperdto(newspaper)) {
			boolean isSaved = this.serviceImpl.savenewspaperdto(newspaper);
			if (isSaved) {
				model.addAttribute("Name", newspaper.getNewspaperName());
				model.addAttribute("Price", newspaper.getPrice());
				model.addAttribute("Language", newspaper.getLanguage());
				model.addAttribute("NoOfpages", newspaper.getNoOfPages());
				model.addAttribute("validateMessgage", "data is saved successfully.......,,,");

			}
			else {
				model.addAttribute("ErrorMessage", "Invalid data,,, please check it once......");
			}
		}

		return "WEB-INF/pages/viewNewspaperDetails.jsp";

	}

}
