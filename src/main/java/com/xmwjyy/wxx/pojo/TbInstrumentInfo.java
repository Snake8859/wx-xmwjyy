package com.xmwjyy.wxx.pojo;



public class TbInstrumentInfo {
	   
	 //信息id
    private  String iid;
   
	 //项目编号
    private  long ItemID;
   
	 //批次编号
    private  long BatchID;
   
	 //样本编号
    private  String sampleID;
   
	 //项目名称(若有多个项目，则以/分隔)
    private  String ItemName;
   
	 //批次名称
    private  String BatchName;
   
	 //检测时间
    private  String TestTime;
   
	 //C值
    private  long CValue;
   
	 //T值
    private  long T1Value;
   
	 //T值
    private  long T2Value;
   
	 //T值
    private  long T3Value;
   
	 //检查结果浓度值
    private  String Concentration;
   
	 //单位名称(若有多个项目，则每个项目的单位以@分隔)
    private  String Unit;
   
	 //参考范围
    private  String CRange;
   
	 //结果定性判断
    private  String Judge;
   
	 //仪器序列号
    private  String sncode;
   
	 //未知
    private  String humidity;
   
	 //未知
    private  String landform;
   
	 //未知
    private  String operator_worker;
   
	 //未知
    private  String sample_addr;
   
	 //未知
    private  String sample_time;
   
	 //未知
    private  String sample_type;
   
	 //未知
    private  String sample_worker;
   
	 //未知
    private  String temperature;
   
	 //未知
    private  String weather;
   
	 //未知
    private  String windDirection;
   
	 //未知
    private  String windSpeed;
   
    
    public  String  getIid(){
    		return  this.iid;
    };
    public  void  setIid(String iid){
    	this.iid=iid;
    }  
   
    public  long  getItemID(){
    		return  this.ItemID;
    };
    public  void  setItemID(long ItemID){
    	this.ItemID=ItemID;
    }  
   
    public  long  getBatchID(){
    		return  this.BatchID;
    };
    public  void  setBatchID(long BatchID){
    	this.BatchID=BatchID;
    }  
   
    public  String  getSampleID(){
    		return  this.sampleID;
    };
    public  void  setSampleID(String sampleID){
    	this.sampleID=sampleID;
    }  
   
    public  String  getItemName(){
    		return  this.ItemName;
    };
    public  void  setItemName(String ItemName){
    	this.ItemName=ItemName;
    }  
   
    public  String  getBatchName(){
    		return  this.BatchName;
    };
    public  void  setBatchName(String BatchName){
    	this.BatchName=BatchName;
    }  
   
    public  String  getTestTime(){
    		return  this.TestTime;
    };
    public  void  setTestTime(String TestTime){
    	this.TestTime=TestTime;
    }  
   
    public  long  getCValue(){
    		return  this.CValue;
    };
    public  void  setCValue(long CValue){
    	this.CValue=CValue;
    }  
   
    public  long  getT1Value(){
    		return  this.T1Value;
    };
    public  void  setT1Value(long T1Value){
    	this.T1Value=T1Value;
    }  
   
    public  long  getT2Value(){
    		return  this.T2Value;
    };
    public  void  setT2Value(long T2Value){
    	this.T2Value=T2Value;
    }  
   
    public  long  getT3Value(){
    		return  this.T3Value;
    };
    public  void  setT3Value(long T3Value){
    	this.T3Value=T3Value;
    }  
   
    public  String  getConcentration(){
    		return  this.Concentration;
    };
    public  void  setConcentration(String Concentration){
    	this.Concentration=Concentration;
    }  
   
    public  String  getUnit(){
    		return  this.Unit;
    };
    public  void  setUnit(String Unit){
    	this.Unit=Unit;
    }  
   
   
    public String getCRange() {
		return CRange;
	}
	public void setCRange(String cRange) {
		CRange = cRange;
	}
	public  String  getJudge(){
    		return  this.Judge;
    };
    public  void  setJudge(String Judge){
    	this.Judge=Judge;
    }  
   
    public  String  getSncode(){
    		return  this.sncode;
    };
    public  void  setSncode(String sncode){
    	this.sncode=sncode;
    }  
   
    public  String  getHumidity(){
    		return  this.humidity;
    };
    public  void  setHumidity(String humidity){
    	this.humidity=humidity;
    }  
   
    public  String  getLandform(){
    		return  this.landform;
    };
    public  void  setLandform(String landform){
    	this.landform=landform;
    }  
   
    public  String  getOperator_worker(){
    		return  this.operator_worker;
    };
    public  void  setOperator_worker(String operator_worker){
    	this.operator_worker=operator_worker;
    }  
   
    public  String  getSample_addr(){
    		return  this.sample_addr;
    };
    public  void  setSample_addr(String sample_addr){
    	this.sample_addr=sample_addr;
    }  
   
    public  String  getSample_time(){
    		return  this.sample_time;
    };
    public  void  setSample_time(String sample_time){
    	this.sample_time=sample_time;
    }  
   
    public  String  getSample_type(){
    		return  this.sample_type;
    };
    public  void  setSample_type(String sample_type){
    	this.sample_type=sample_type;
    }  
   
    public  String  getSample_worker(){
    		return  this.sample_worker;
    };
    public  void  setSample_worker(String sample_worker){
    	this.sample_worker=sample_worker;
    }  
   
    public  String  getTemperature(){
    		return  this.temperature;
    };
    public  void  setTemperature(String temperature){
    	this.temperature=temperature;
    }  
   
    public  String  getWeather(){
    		return  this.weather;
    };
    public  void  setWeather(String weather){
    	this.weather=weather;
    }  
   
    public  String  getWindDirection(){
    		return  this.windDirection;
    };
    public  void  setWindDirection(String windDirection){
    	this.windDirection=windDirection;
    }  
   
    public  String  getWindSpeed(){
    		return  this.windSpeed;
    };
    public  void  setWindSpeed(String windSpeed){
    	this.windSpeed=windSpeed;
    }
    
}