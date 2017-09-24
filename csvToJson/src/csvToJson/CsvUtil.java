package csvToJson;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CsvUtil {
	private String fileName = null;
	private BufferedReader br = null;
	private List<String> list = new ArrayList<String>();
	
	public CsvUtil(){
		
	}
	
	public CsvUtil(String fileName) throws Exception{
		this.fileName = fileName;
		br = new BufferedReader(new FileReader(fileName));
		String stemp;
		while((stemp = br.readLine()) != null){
			list.add(stemp);
		}
	}
	
	public List getList(){
		return list;
	}
	
	public int getRowNum(){
		return list.size();
	}
	
	public int getColNum(){
		if(!list.toString().equals("[]")){
			if(list.get(0).toString().contains(",")){
				return list.get(0).toString().split(",").length;
			}else if(list.get(0).toString().trim().length() != 0){
				return 1;
			}else{
				return 0;
			}
		}else{
			return 0;
		}
	}
	
	public String getCol(int index){
		if(this.getColNum() == 0){
			return null;
		}
		StringBuffer sb = new StringBuffer();
		String tmp = null;
		int colnum = this.getColNum();
		if(colnum >1){
			for(Iterator it = list.iterator(); it.hasNext();){
				tmp = it.next().toString();
				sb = sb.append(tmp.split(",")[index] + ",");
			}
		}else{
			for(Iterator it = list.iterator(); it.hasNext();){
				tmp = it.next().toString();
				sb = sb.append(tmp + ",");
			}
		}
		String str = new String(sb.toString());
		str = str.substring(0,str.length() - 1);
		return str;
	}
	
	public String getString(int row, int col) {  
            String temp = null;  
            int colnum = this.getColNum();  
            if (colnum > 1) {  
                    temp = list.get(row).toString().split(",")[col];  
            } else if(colnum == 1){  
                    temp = list.get(row).toString();  
	            } else {  
	                    temp = null;  
	            }  
	            return temp;  
	    }  
	
	public void CsvClose()throws Exception{  
            this.br.close();  
    }
	
	public String removehead(String str){  
        String[] str_1=str.split(",");  
        String sb=new String();  
        for(int i=1;i<str_1.length;i++){  
            if(i<str_1.length-1){
            	sb=sb+str_1[i]+","; 
            }else{sb=sb+str_1[i];}
        	 
//            if(i == str_1.length-1)
        }  
        return sb;  
    }  


}
