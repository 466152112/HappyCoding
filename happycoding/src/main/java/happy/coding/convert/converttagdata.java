package happy.coding.convert;

import happy.coding.io.FileIO;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

/**   
*    
* 项目名称：happycoding   
* 类名称：converttagdata   
* 类描述：   
* 创建人：zhouge   
* 创建时间：2015年4月28日 下午8:08:04   
* 修改人：zhouge 
* 修改时间：2015年4月28日 下午8:08:04   
* 修改备注：   
* @version    
*    
*/
public class converttagdata {
	String path="/home/zhouge/database/tagrec/data/lastfm/";
	String sourceFile=path+"train";
		public static void main(String[] arfg) {
			
		}
		
		public void run(){
			try {
				List<String> listsourceList=FileIO.readAsList(sourceFile);
				List<String> result=new ArrayList<String>();
				
				for (String oneline : listsourceList) {
					String[] splits=oneline.split("\t");
					result.add(splits[0]+"\t"+splits[2]+"\t"+1);
				}
				FileIO.writeList(sourceFile+"_userid_itemid", result);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
}
