package com.douzone.shape;

import com.douzone.inter.Drawable;

public abstract class Shape implements Drawable{
	private String lineColor;
	private String fillColor;
	
	
	public String getFillColor() {
		return fillColor;
	}
	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}
	public String getLineColor() {
		return lineColor;
	}
	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}
	
}
