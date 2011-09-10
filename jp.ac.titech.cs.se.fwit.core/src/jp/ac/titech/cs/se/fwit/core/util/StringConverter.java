package jp.ac.titech.cs.se.fwit.core.util;

import java.util.Set;

public class StringConverter {

	private static final String DELEMETER = ", ";

	public static String set2String(Set set){
		StringBuffer buf = new StringBuffer();
		boolean first = true;
		for(Object o:set){
			if(first){
				first = false;
			}else{
				buf.append(DELEMETER);
			}
			buf.append(o);
		}
		return buf.toString();
	}
}
