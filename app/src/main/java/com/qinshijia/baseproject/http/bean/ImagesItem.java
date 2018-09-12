package com.qinshijia.baseproject.http.bean;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

public class ImagesItem{

	@JSONField(name="quiz")
	private String quiz;

	@JSONField(name="urlbase")
	private String urlbase;

	@JSONField(name="copyright")
	private String copyright;

	@JSONField(name="bot")
	private int bot;

	@JSONField(name="hs")
	private List<Object> hs;

	@JSONField(name="startdate")
	private String startdate;

	@JSONField(name="title")
	private String title;

	@JSONField(name="url")
	private String url;

	@JSONField(name="enddate")
	private String enddate;

	@JSONField(name="top")
	private int top;

	@JSONField(name="fullstartdate")
	private String fullstartdate;

	@JSONField(name="wp")
	private boolean wp;

	@JSONField(name="copyrightlink")
	private String copyrightlink;

	@JSONField(name="hsh")
	private String hsh;

	@JSONField(name="drk")
	private int drk;

	public void setQuiz(String quiz){
		this.quiz = quiz;
	}

	public String getQuiz(){
		return quiz;
	}

	public void setUrlbase(String urlbase){
		this.urlbase = urlbase;
	}

	public String getUrlbase(){
		return urlbase;
	}

	public void setCopyright(String copyright){
		this.copyright = copyright;
	}

	public String getCopyright(){
		return copyright;
	}

	public void setBot(int bot){
		this.bot = bot;
	}

	public int getBot(){
		return bot;
	}

	public void setHs(List<Object> hs){
		this.hs = hs;
	}

	public List<Object> getHs(){
		return hs;
	}

	public void setStartdate(String startdate){
		this.startdate = startdate;
	}

	public String getStartdate(){
		return startdate;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setUrl(String url){
		this.url = url;
	}

	public String getUrl(){
		return url;
	}

	public void setEnddate(String enddate){
		this.enddate = enddate;
	}

	public String getEnddate(){
		return enddate;
	}

	public void setTop(int top){
		this.top = top;
	}

	public int getTop(){
		return top;
	}

	public void setFullstartdate(String fullstartdate){
		this.fullstartdate = fullstartdate;
	}

	public String getFullstartdate(){
		return fullstartdate;
	}

	public void setWp(boolean wp){
		this.wp = wp;
	}

	public boolean isWp(){
		return wp;
	}

	public void setCopyrightlink(String copyrightlink){
		this.copyrightlink = copyrightlink;
	}

	public String getCopyrightlink(){
		return copyrightlink;
	}

	public void setHsh(String hsh){
		this.hsh = hsh;
	}

	public String getHsh(){
		return hsh;
	}

	public void setDrk(int drk){
		this.drk = drk;
	}

	public int getDrk(){
		return drk;
	}

	@Override
 	public String toString(){
		return 
			"ImagesItem{" + 
			"quiz = '" + quiz + '\'' + 
			",urlbase = '" + urlbase + '\'' + 
			",copyright = '" + copyright + '\'' + 
			",bot = '" + bot + '\'' + 
			",hs = '" + hs + '\'' + 
			",startdate = '" + startdate + '\'' + 
			",title = '" + title + '\'' + 
			",url = '" + url + '\'' + 
			",enddate = '" + enddate + '\'' + 
			",top = '" + top + '\'' + 
			",fullstartdate = '" + fullstartdate + '\'' + 
			",wp = '" + wp + '\'' + 
			",copyrightlink = '" + copyrightlink + '\'' + 
			",hsh = '" + hsh + '\'' + 
			",drk = '" + drk + '\'' + 
			"}";
		}
}