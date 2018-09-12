package com.qinshijia.baseproject.http.bean;

import com.alibaba.fastjson.annotation.JSONField;

public class Tooltips{

	@JSONField(name="next")
	private String next;

	@JSONField(name="walle")
	private String walle;

	@JSONField(name="walls")
	private String walls;

	@JSONField(name="previous")
	private String previous;

	@JSONField(name="loading")
	private String loading;

	public void setNext(String next){
		this.next = next;
	}

	public String getNext(){
		return next;
	}

	public void setWalle(String walle){
		this.walle = walle;
	}

	public String getWalle(){
		return walle;
	}

	public void setWalls(String walls){
		this.walls = walls;
	}

	public String getWalls(){
		return walls;
	}

	public void setPrevious(String previous){
		this.previous = previous;
	}

	public String getPrevious(){
		return previous;
	}

	public void setLoading(String loading){
		this.loading = loading;
	}

	public String getLoading(){
		return loading;
	}

	@Override
 	public String toString(){
		return 
			"Tooltips{" + 
			"next = '" + next + '\'' + 
			",walle = '" + walle + '\'' + 
			",walls = '" + walls + '\'' + 
			",previous = '" + previous + '\'' + 
			",loading = '" + loading + '\'' + 
			"}";
		}
}