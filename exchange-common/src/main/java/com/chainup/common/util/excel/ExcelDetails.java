package com.chainup.common.util.excel;





import java.io.IOException;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelDetails {
	
	final static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
	
	public static HSSFWorkbook gennerateExcel(LinkedHashMap<String, String> titleMap, List<? extends Object> data) {
		
		
		System.out.println("data.size====================="+data.size());
	    HSSFWorkbook result = new HSSFWorkbook();
	    HSSFSheet sheet  = result.createSheet("帖子");
	    if (titleMap == null || titleMap.isEmpty()) {
	        return result;
	    }
	    
	    // 列顺序
	    List<String> headerKey  = new ArrayList<String>();
	    // 写入头 
	    HSSFRow header = sheet.createRow(0);
	    int colIndex = 0;
	    for (Map.Entry<String, String> entry: titleMap.entrySet()) {
	        headerKey.add(entry.getKey()); // 初始化列顺序
	        
	        HSSFCell cell = header.createCell(colIndex++);
	        cell.setCellValue(entry.getValue());
	    }
	    // 列字段
	    Map<String, Field> fieldMap = new HashMap<String, Field>();
	    for (int i = 0; i < data.size(); i++) {
	        Object record = data.get(i);
	        // 初始化列字段
	        if (fieldMap.isEmpty()) {
	            Field[] fields = record.getClass().getDeclaredFields();
	            System.out.println("fields.size======================"+fields.length);
	            for (Field field: fields) {
	                fieldMap.put(field.getName(), field);
	            }
	        }
	        
	        // 写入数据
	        HSSFRow row = sheet.createRow(i + 1);
	        colIndex = 0;
	        for (String key: headerKey) {
	            Field field = fieldMap.get(key);
	            
	            try {
	                field.setAccessible(true);
	                Object obj = field.get(record);
	                HSSFCell cell = row.createCell(colIndex++);
	                if (obj == null) {
	                    continue;
	                }
	                
	                if (obj instanceof Date) {
	                    String dateStr = dateFormat.format(obj);
	                    cell.setCellValue(dateStr);
	                    continue;
	                }
	                
	                cell.setCellValue(obj.toString());
	
	            } catch (Exception e) {
	                e.printStackTrace();
	            }
	        }
	    }
	    
	    return result;
	    
	}
	
	public static HSSFWorkbook CreateExcelXls(List<Map<String, Object>> resultMap,LinkedHashMap<String,Object> titleMap, String showHyperlink) throws IOException {
		HSSFWorkbook wb =  new HSSFWorkbook();
		HSSFSheet sheet  = wb.createSheet("sheet1");
		if(resultMap != null && !resultMap.isEmpty()){
			//当行数小于等于结果集的大小时，自动添加一行。
			for(int i = 0 ;i <= resultMap.size() ;i++){
				HSSFRow row = sheet.createRow(i);
				//第一行放入对应的key
				if(row.getRowNum() == 0){
					int count = 0;
					for(Entry<String, Object> entry:titleMap.entrySet()){
						HSSFCell cell = row.createCell(count);
						cell.setCellValue(entry.getKey());
						count++;
					}
				}else{
					//表格内容数据填充
					for(int n = 0;n < titleMap.size();n++){
						HSSFCell cell = row.createCell(n);
						//增加超链接 点击跳转到指定页面
						/*if(StringUtils.isNotEmpty(showHyperlink)){
							if(sheet.getRow(0).getCell(n).getStringCellValue().equals(showHyperlink)){
								HSSFCellStyle linkStyle = wb.createCellStyle();
								HSSFFont cellFont= wb.createFont();
								cellFont.setUnderline((byte) 1);
								cellFont.setColor(HSSFColor.BLUE.index);
								linkStyle.setFont(cellFont);
								cell.setCellStyle(linkStyle);
								cell.setCellType(HSSFCell.CELL_TYPE_FORMULA);
								if(StringUtils.isNotEmpty(resultMap.get(i-1).get(showHyperlink).toString())){
									String linkContent = resultMap.get(i-1).get(showHyperlink).toString();
									if(resultMap.get(i-1).get(showHyperlink).toString().contains("\"")){
										linkContent = resultMap.get(i-1).get(showHyperlink).toString().replaceAll("\"", " ");
									}
									if(resultMap.get(i-1).get(showHyperlink).toString().length() > 100 ){
										linkContent = linkContent.substring(0, 100)+"......";
									}
									cell.setCellFormula("HYPERLINK(\"" + pcPostURL +resultMap.get(i-1).get("postMasterId")+ "\",\"" + linkContent + "\")");
								}
							}
						}*/
						
						Object valueObj = resultMap.get(i-1).get(sheet.getRow(0).getCell(n).getStringCellValue());//对应key取得的Object
						if(		valueObj instanceof Integer || 
								valueObj instanceof Double || 
								valueObj instanceof Float || 
								valueObj instanceof Short || 
								valueObj instanceof Byte || 
								valueObj instanceof Boolean||
								valueObj instanceof Character ||
								valueObj instanceof Long ){
							cell.setCellValue(valueObj.toString());
						}else if(valueObj instanceof Date){
							SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
							String dateStr = format.format(valueObj);
							cell.setCellValue(dateStr);
						}else if(valueObj instanceof String){
							cell.setCellValue((String)valueObj);
						}else if(valueObj instanceof BigDecimal){
							if (((BigDecimal)valueObj).compareTo(new BigDecimal("0"))==0) {
								cell.setCellValue("0.00");
							}else {
								cell.setCellValue(((BigDecimal)valueObj).setScale(8, BigDecimal.ROUND_DOWN).toPlainString());
							}
						}
					}
					
				}
			}
			//将第一行的key换成汉字字段名
			HSSFRow row0 = sheet.getRow(0);
			int maxcell = row0.getLastCellNum();
			for(int i = 0;i < maxcell; i++){
				row0.getCell(i).setCellValue(titleMap.get(row0.getCell(i).getStringCellValue())+"");;
			}
		}
		return wb;
	}

}
