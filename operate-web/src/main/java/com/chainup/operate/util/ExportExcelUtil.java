package com.chainup.operate.util;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;

import com.alibaba.fastjson.JSONObject;

/** 
 * Description:  导出Excel表格
 * Created by dongya on	2018-09-13
 */
public class ExportExcelUtil {
	
	 final static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	 
	 final static  DecimalFormat decimalFormat = new DecimalFormat("#.################");
	 
	public  SXSSFWorkbook exportExcel(String[] title, List<? extends Object> data) {
		Integer rowaccess = 1000;// 内存中缓存记录行数，以免内存溢出
		SXSSFWorkbook sxssfWorkbook = new SXSSFWorkbook(rowaccess);
		Sheet sheet = sxssfWorkbook.createSheet();
		//表格标题行
		Row titleRow  = sheet.createRow(0);
        Cell cell;
        int colIndex;
        for (colIndex = 0; colIndex < title.length; colIndex++) {
        	cell = titleRow.createCell(colIndex);
            cell.setCellValue(title[colIndex]);
        }
        Map<Integer, Field> fieldMap = new HashMap<Integer, Field>();
        CellStyle bodyStyle = sxssfWorkbook.createCellStyle();
        bodyStyle.setWrapText(true);
		for (int i = 0; i < data.size(); i++) {
			Object record = data.get(i);
			if (record instanceof Map) {//Map 类型
                try {
                    // 写入数据
                	Row row = sheet.createRow(i + 1);
                    colIndex = 0;
                    JSONObject jsonObject = (JSONObject) JSONObject.toJSON(record);
                    Collection c = jsonObject.values();
                    Iterator iterator = c.iterator();
                    for (int j = 0; j < c.size(); j++) {
                    	Cell cells = row.createCell(colIndex++);
                        Object obj = iterator.next();
                        if (obj == null) {
                            continue;
                        }
                        if (obj instanceof Date) {
                            String dateStr = dateFormat.format(obj);
                            cells.setCellValue(dateStr);
                            continue;
                        }
                        cells.setCellValue(obj.toString());
                    }
                    continue;
                }catch (Exception e) {
                    e.printStackTrace();
                }
            }
            // 初始化列字段
            if (fieldMap.isEmpty()) {
                Field[] fields = record.getClass().getDeclaredFields();
//                System.out.println("fields.size======================" + fields.length);
                int k = 0;
                for (Field field : fields) {
                    fieldMap.put(k, field);
                    k++;
                }
            }
            // 写入数据
            Row row = sheet.createRow(i + 1);
            colIndex = 0;
            for (int j = 0; j < title.length; j++) {
                Field field = fieldMap.get(j);
                try {
                    field.setAccessible(true);
                    Object obj = field.get(record);
                    Cell cells = row.createCell(colIndex++);
                    if (obj == null) {
                        continue;
                    }
                    if (obj instanceof Date) {
                        String dateStr = dateFormat.format(obj);
                        cells.setCellValue(dateStr);
                        continue;
                    }
                    if(obj instanceof BigDecimal) {
                    	String format = decimalFormat.format(obj);
                    	 cells.setCellValue(format);
                         continue;
                    }
                    cells.setCellValue(obj.toString());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
		}
		return sxssfWorkbook;
	}
	/**
	 * 创建一个Excel只包含列名
	 * @param title
	 * @return
	 */
	public  SXSSFWorkbook creatWorkBook(String[] title) {
		Integer rowaccess = 5000;// 内存中缓存记录行数，以免内存溢出
		SXSSFWorkbook sxssfWorkbook = new SXSSFWorkbook(rowaccess);
		Sheet sheet = sxssfWorkbook.createSheet();
		//表格标题行
		Row titleRow  = sheet.createRow(0);
        Cell cell;
        int colIndex;
        for (colIndex = 0; colIndex < title.length; colIndex++) {
        	cell = titleRow.createCell(colIndex);
            cell.setCellValue(title[colIndex]);
        }
		return sxssfWorkbook;
	}
	
	/**
	 * 向excel中写入内容
	 * @param sxssfWorkbook
	 * @param data
	 * @return
	 */
	public SXSSFWorkbook writeData(SXSSFWorkbook sxssfWorkbook,String[] title,List<? extends Object> data,int index) {
	 Sheet sheet = sxssfWorkbook.getSheetAt(index);
	 int lastRowNum = sheet.getLastRowNum()+1;
//	 System.err.println("excel行数="+lastRowNum);
	 int colIndex;
      Map<Integer, Field> fieldMap = new HashMap<Integer, Field>();
      CellStyle bodyStyle = sxssfWorkbook.createCellStyle();
      bodyStyle.setWrapText(true);
		for (int i = 0; i < data.size(); i++) {
			Object record = data.get(i);
			if (record instanceof Map) {//Map 类型
              try {
                  // 写入数据
              	Row row = sheet.createRow(i + 1);
                  colIndex = 0;
                  JSONObject jsonObject = (JSONObject) JSONObject.toJSON(record);
                  Collection c = jsonObject.values();
                  Iterator iterator = c.iterator();
                  for (int j = 0; j < c.size(); j++) {
                  	Cell cells = row.createCell(colIndex++);
                      Object obj = iterator.next();
                      if (obj == null) {
                          continue;
                      }
                      if (obj instanceof Date) {
                          String dateStr = dateFormat.format(obj);
                          cells.setCellValue(dateStr);
                          continue;
                      }
                      cells.setCellValue(obj.toString());
                  }
                  continue;
              }catch (Exception e) {
                  e.printStackTrace();
              }
          }
          // 初始化列字段
          if (fieldMap.isEmpty()) {
              Field[] fields = record.getClass().getDeclaredFields();
//              System.err.println("fields.size======================" + fields.length);
              int k = 0;
              for (Field field : fields) {
                  fieldMap.put(k, field);
                  k++;
              }
          }
          // 写入数据
          
          Row row = sheet.createRow(lastRowNum+i);
          colIndex = 0;
          for (int j = 0; j < title.length; j++) {
              Field field = fieldMap.get(j);
              try {
                  field.setAccessible(true);
                  Object obj = field.get(record);
                  Cell cells = row.createCell(colIndex++);
                  if (obj == null) {
                      continue;
                  }
                  if (obj instanceof Date) {
                      String dateStr = dateFormat.format(obj);
                      cells.setCellValue(dateStr);
                      continue;
                  }
                  if(obj instanceof BigDecimal) {
                  	String format = decimalFormat.format(obj);
                  	 cells.setCellValue(format);
                       continue;
                  }
                  cells.setCellValue(obj.toString());
              } catch (Exception e) {
                  e.printStackTrace();
              }
          }
		}
		return sxssfWorkbook;
	}
}
