package com.qinshijia.baseproject.http.bean;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

public class BiyingResponse {

	@JSONField(name="images")
	private List<ImagesItem> images;

	@JSONField(name="tooltips")
	private Tooltips tooltips;

	public void setImages(List<ImagesItem> images){
		this.images = images;
	}

	public List<ImagesItem> getImages(){
		return images;
	}

	public void setTooltips(Tooltips tooltips){
		this.tooltips = tooltips;
	}

	public Tooltips getTooltips(){
		return tooltips;
	}

	@Override
 	public String toString(){
		return 
			"BiyingResponse{" +
			"images = '" + images + '\'' + 
			",tooltips = '" + tooltips + '\'' + 
			"}";
		}
}