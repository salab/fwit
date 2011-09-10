package jp.ac.titech.cs.se.fwit.core.util;

public class RepeatedCombinationCounter {
	private Integer from;
	private Integer choose;
	
	private Integer[] counter;
	
	public RepeatedCombinationCounter(Integer from, Integer choose){
		this.from = from;
		this.choose = choose;
		this.counter = null;
	}
	
	public Boolean hasNext(){
		if(this.counter == null){
			return true;
		}
		for(int i=0;i<choose;i++){
			if(this.counter[i] < from -1 ){
				return true;
			}
		}
		return false;
	}
	
	public Integer[] next(){
		if(this.counter == null){
			this.counter = new Integer[choose];
			for(int i=0;i<choose;i++){
				this.counter[i] = 0;
			}
			return this.counter;
		}
		for(int i=0;i<choose;i++){
			if(this.counter[i] == from -1){
				this.counter[i] = 0;
			}else{
				this.counter[i]++;
				break;
			}
		}
		return this.counter;
	}

	public String toString(){
		int size=0;
		StringBuffer buf = new StringBuffer();
		RepeatedCombinationCounter counter = new RepeatedCombinationCounter(from,choose);
		while(counter.hasNext()){
			size++;
			Integer[] value = counter.next();
			for(int i=0;i<choose;i++){
				buf.append(value[i]+", ");
			}
			buf.append(System.getProperty("line.separator"));
		}
		buf.append("|"+from+"H"+choose+ "| = "+size);
		return buf.toString();
	}
}
