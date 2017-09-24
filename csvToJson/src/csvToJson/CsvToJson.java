package csvToJson;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

public class CsvToJson {

	public static void main(String[] args) {
//		 TODO Auto-generated method stub
		CsvToJson h = new CsvToJson();
		boolean isSuccess = exportCsv();
		System.out.print(isSuccess);
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String line = null;
//		// 瀹氫箟鏂囦欢澶у皬鐨勫崟浣嶏紝1涓篕B锛�2涓篗B锛�3涓篏B
//		int unit = 0;
//		// 瀹氫箟鏂囦欢鐨勫ぇ灏�
//		int lager = 0;
//		// 瀹氫箟鏂囦欢瀛樻斁鐨勫垎鍖猴紝榛樿涓篊鐩樸��
//		String partition = "C";
//		
//			FileWriter fw = null;
//			// 鏂板缓鏂囦欢
//			try {
//				fw = new FileWriter("xxx.txt", true);
//			} catch (IOException e) {
//				System.out.println("杈撳叆鐨勫垎鍖洪敊璇�");
//			}
//			PrintWriter pw = new PrintWriter(fw);
//			// 杈撳叆鏂囦欢澶у皬鐨勫崟浣�
//			System.out.println("杈撳叆瑕佺敓鎴愮殑鏂囦欢鐨勫崟浣嶏紝1涓篕B锛�2涓篗B锛�3涓篏B");
//			try {
//				line = br.readLine();
//
//			} catch (IOException e1) {
//				System.out.println("杈撳叆閿欒");
//			}
//			try {
//				unit = Integer.parseInt(line);
//			} catch (NumberFormatException e2) {
//				System.out.println("杈撳叆閿欒");
//			}
//			if (unit < 0 || unit > 3) {
//				System.out.println("杈撳叆閿欒");
//			}
//			// 杈撳叆鏂囦欢鐨勫ぇ灏�
//			System.out.println("杈撳叆瑕佺敓鎴愮殑鏂囦欢鐨勫ぇ灏�");
//			try {
//				line = br.readLine();
//
//			} catch (IOException e1) {
//				System.out.println("杈撳叆閿欒");
//			}
//			try {
//				lager = Integer.parseInt(line);
//			} catch (NumberFormatException e1) {
//				System.out.println("杈撳叆閿欒");
//			}
//			if (unit == 1) {
//				lager = lager * 1024;
//			} else if (unit == 2) {
//				lager = lager * 1024 * 1024;
//			} else if (unit == 3) {
//				lager = lager * 1024 * 1024 * 1024;
//			} else {
//				System.out.println("杈撳叆閿欒");
//			}
//			// 寮�濮嬪啓鏂囦欢
//			for (int i = 0; i < lager; i++) {
//				pw.print(" ");
//			}
//			System.out.println("-->completed-->O(鈭鈭�)O~");
//			pw.close();
//			try {
//				fw.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
		
		
		
//		JSONArray arr = h.readcsv("Pedestrian_volume__updated_monthly_.csv");
//		System.out.println(arr);
//		
//		File file = new File("others.json");
//		char [] stack = new char[1024];
//		int top=-1;
//		
//		String string = arr.toString();
//		
//		StringBuffer sb = new StringBuffer();
//		char [] charArray = string.toCharArray();
//		for(int i=0;i<charArray.length;i++){
//			char c= charArray[i];
//			if ('{' == c || '[' == c) {  
//                stack[++top] = c; 
//                sb.append("\n"+charArray[i] + "\n");  
//                for (int j = 0; j <= top; j++) {  
//                    sb.append("\t");  
//                }  
//                continue;  
//            }
//			 if ((i + 1) <= (charArray.length - 1)) {  
//	                char d = charArray[i+1];  
//	                if ('}' == d || ']' == d) {  
//	                    top--; 
//	                    sb.append(charArray[i] + "\n");  
//	                    for (int j = 0; j <= top; j++) {  
//	                        sb.append("\t");  
//	                    }  
//	                    continue;  
//	                }  
//	            }  
//	            if (',' == c) {  
//	                sb.append(charArray[i] + "");  
//	                for (int j = 0; j <= top; j++) {  
//	                    sb.append("");  
//	                }  
//	                continue;  
//	            }  
//	            sb.append(c);  
//	        }  
//	          
//	        Writer write;
//			try {
//				write = new FileWriter(file);
//				 write.write(sb.toString());  
//			        write.flush();  
//			        write.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}  
	         
	}
	
	
	public static boolean exportCsv(){
        boolean isSucess=false;
        CsvUtil util;
        try {
			util = new CsvUtil("Pedestrian_volume__updated_monthly_.csv");
			String str1[] = util.getCol(1).split(",");
			String str2[] = util.getCol(2).split(",");
			String str3[] = util.getCol(3).split(",");
			String str4[] = util.getCol(4).split(",");
			String str5[] = util.getCol(5).split(",");
			String str6[] = util.getCol(6).split(",");
			String str7[] = util.getCol(7).split(",");
			String str8[] = util.getCol(8).split(",");
			String str9[] = util.getCol(9).split(",");
        List<String> dataList=new ArrayList<String>();
        for(int i=0;i<str1.length;i++){
        	dataList.add(str1[i]+","+str2[i]+","+str3[i]+","+str4[i]+","+str5[i]+","+str6[i]+","+str7[i]+","+str8[i]+","+str9[i]);
        }

        FileOutputStream out=null;
        OutputStreamWriter osw=null;
        BufferedWriter bw=null;
        try {
            out = new FileOutputStream("sensor.csv");
            osw = new OutputStreamWriter(out);
            bw =new BufferedWriter(osw);
            if(dataList!=null && !dataList.isEmpty()){
                for(String data : dataList){
                    bw.append(data).append("\r");
                }
            }
            isSucess=true;
        } catch (Exception e) {
            isSucess=false;
        }finally{
            if(bw!=null){
                try {
                    bw.close();
                    bw=null;
                } catch (IOException e) {
                    e.printStackTrace();
                } 
            }
            if(osw!=null){
                try {
                    osw.close();
                    osw=null;
                } catch (IOException e) {
                    e.printStackTrace();
                } 
            }
            if(out!=null){
                try {
                    out.close();
                    out=null;
                } catch (IOException e) {
                    e.printStackTrace();
                } 
            }
        }} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        
        return isSucess;
    }
	
	
	public JSONArray readcsv(String path){
		JSONArray array = new JSONArray();
		
			CsvUtil util;
			try{
				util = new CsvUtil(path);
				int row = util.getRowNum();
				int col = util.getColNum();
				String v1 = util.getCol(0);
				String v2 = util.getCol(1);
				String v3 = util.getCol(3);
				String v4 = util.getCol(4);
				String v5 = util.getCol(5);
				String v6 = util.getCol(6);
				String v7 = util.getCol(7);
//				String v8 = util.getCol(8);
				String v9 = util.getCol(9);
				String str1[] = util.removehead(v1).split(",");
				String str2[] = util.removehead(v2).split(",");
				String str3[] = util.removehead(v3).split(",");
				String str4[] = util.removehead(v4).split(",");
				String str5[] = util.removehead(v5).split(",");
				String str6[] = util.removehead(v6).split(",");
				String str7[] = util.removehead(v7).split(",");
//				String str8[] = util.removehead(v8).split(",");
				String str9[] = util.removehead(v9).split(",");
				List<String> list = new ArrayList<String>();
				for(int a=0;a<str1.length;a++){
					if(!list.contains(str1[a])){
						list.add(str1[a]);
					}
				}
				String dates[] = list.toArray(new String[1]);
				String t1 = util.getString(0, 0);
				String t2 = util.getString(0, 1);
				String t3 = util.getString(0, 3);
				String t4 = util.getString(0, 4);
				String t5 = util.getString(0, 5);
				String t6 = util.getString(0, 6);
				String t7 = util.getString(0, 7);
//				String t8 = util.getString(0, 8);
				String t9 = util.getString(0, 9);
			for(int j=0;j<dates.length;j++){
				JSONObject object = new JSONObject();
				JSONObject obj = new JSONObject();
//				JSONObject obj1 = new JSONObject();
//				JSONObject obj2 = new JSONObject();
//				JSONObject obj3 = new JSONObject();
//				JSONArray arr = new JSONArray();
				JSONArray arr1 = new JSONArray();
//				JSONArray arr2 = new JSONArray();
//				JSONArray arr3 = new JSONArray();
				String datetime = dates[j];
				int count=0;
				for(int i=0; i<row-1;i++){
					if(str1[i]==datetime){
						if(count==0){
							object.put(t1, str1[i]);
							object.put(t2, str2[i]);
							object.put(t3, str3[i]);
							object.put(t4, str4[i]);
							object.put(t5, str5[i]);
							object.put(t6, str6[i]);
							count++;
						}
						obj.put(t7, str7[i]);
						obj.put(t9, str9[i]);
						arr1.put(obj);
					}	
				}
				object.put("SensorInfo", arr1);
				array.put(object);
			}		
			}catch(Exception e){
				e.printStackTrace();
			}
			return array;
	}
}

//object.put(t7, str7[i]);
//object.put(t8, str8[i]);
//object.put(t9, Integer.parseInt(str9[i]));
//object.put(t6, str6[i]);
//obj.put(t1, str1[i]);
//obj.put("SensorInfo", object);
//obj1.put(t4, str4[i]);
//obj1.put(t5, str5[i]);
//obj1.put("Times", obj);
//obj2.put(t3, str3[i]);
//obj2.put("Dates", obj1);
//obj3.put(t2, str2[i]);
//obj3.put("Months", obj2);

//obj.put(t9, Integer.parseInt(str9[i]));
//obj.put(t2, str2[i]);
//obj.put(t3, str3[i]);
//obj.put(t4, str4[i]);
//obj.put(t5, str5[i]);
//obj.put(t6, str6[i]);
//arr.put(obj);
//obj1.put(t7, str7[i]);
//obj1.put(t8, str8[i]);
//obj1.put(t1, str1[i]);
//obj1.put("Details", arr);