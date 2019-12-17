package com.chainup.common.util.excel;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.commons.collections.MapUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

public class ExcelReaderUtils {

	private POIFSFileSystem fs;
	private HSSFWorkbook wb;
	private HSSFSheet sheet;
	private HSSFRow row;

	/**
	 * 读取Excel表格表头的内容
	 * 
	 * @param InputStream
	 * @return String 表头内容的数组
	 */
	public String[] readExcelTitle(InputStream is) {
		try {
			fs = new POIFSFileSystem(is);
			wb = new HSSFWorkbook(fs);
		} catch (IOException e) {
			e.printStackTrace();
		}
		sheet = wb.getSheetAt(0);
		row = sheet.getRow(0);
		// 标题总列数
		int colNum = row.getPhysicalNumberOfCells();
		System.out.println("colNum:" + colNum);
		String[] title = new String[colNum];
		for (int i = 0; i < colNum; i++) {
			title[i] = getStringCellValue(row.getCell((short) i));
			//title[i] = getCellFormatValue(row.getCell((short) i));
		}
		return title;
	}

	/**
	 * 读取Excel数据内容
	 * 
	 * @param InputStream
	 * @return Map 包含单元格数据内容的Map对象
	 */
	@SuppressWarnings("deprecation")
	public Map<Integer, String> readExcelContent(InputStream is) {
		Map<Integer, String> content = new HashMap<Integer, String>();
		String str = "";
		try {
			fs = new POIFSFileSystem(is);
			wb = new HSSFWorkbook(fs);
		} catch (IOException e) {
			e.printStackTrace();
		}
		sheet = wb.getSheetAt(0);
		// 得到总行数
		int rowNum = sheet.getLastRowNum();
		row = sheet.getRow(0);
		int colNum = row.getPhysicalNumberOfCells();
		// 正文内容应该从第二行开始,第一行为表头的标题
		for (int i = 1; i <= rowNum; i++) {
			row = sheet.getRow(i);
			int j = 0;
			while (j < colNum) {
				// 每个单元格的数据内容用"-"分割开，以后需要时用String类的replace()方法还原数据
				// 也可以将每个单元格的数据设置到一个javabean的属性中，此时需要新建一个javabean
				if(row!=null){
					
					HSSFCell cell = row.getCell((short) j);
					str += getMobileCellValue(cell).trim();
					// "-";
					//str += getCellFormatValue(row.getCell((short) j)).trim() + "    ";
					
				}
				j++;
			}
			content.put(i, str);
			str = "";
		}
		return content;
	}
	/**
	 * 获取单元格数据内容为字符串类型的数据
	 * 
	 * @param cell
	 *            Excel单元格
	 * @return String 单元格数据内容
	 */
	private String getMobileCellValue(HSSFCell cell) {
		DecimalFormat df = new DecimalFormat("#");  
		
		String strCell = "";
		switch (cell.getCellType()) {
		case HSSFCell.CELL_TYPE_STRING:
			strCell = cell.getStringCellValue();
			break;
		case HSSFCell.CELL_TYPE_NUMERIC:
			strCell = df.format(cell.getNumericCellValue());  
			break;
		case HSSFCell.CELL_TYPE_BOOLEAN:
			strCell = String.valueOf(cell.getBooleanCellValue());
			break;
		case HSSFCell.CELL_TYPE_BLANK:
			strCell = "";
			break;
		default:
			strCell = "";
			break;
		}
		
		return strCell;
		
	}
	
	

	/**
	 * 获取单元格数据内容为字符串类型的数据
	 * 
	 * @param cell
	 *            Excel单元格
	 * @return String 单元格数据内容
	 */
	private String getStringCellValue(HSSFCell cell) {
		String strCell = "";
		switch (cell.getCellType()) {
		case HSSFCell.CELL_TYPE_STRING:
			strCell = cell.getStringCellValue();
			break;
		case HSSFCell.CELL_TYPE_NUMERIC:
			strCell = String.valueOf(cell.getNumericCellValue());
			break;
		case HSSFCell.CELL_TYPE_BOOLEAN:
			strCell = String.valueOf(cell.getBooleanCellValue());
			break;
		case HSSFCell.CELL_TYPE_BLANK:
			strCell = "";
			break;
		default:
			strCell = "";
			break;
		}
		if (strCell.equals("") || strCell == null) {
			return "";
		}
		if (cell == null) {
			return "";
		}
		return strCell;
	}

	/**
	 * 获取单元格数据内容为日期类型的数据
	 * 
	 * @param cell
	 *            Excel单元格
	 * @return String 单元格数据内容
	 */
	private String getDateCellValue(HSSFCell cell) {
		String result = "";
		try {
			int cellType = cell.getCellType();
			if (cellType == HSSFCell.CELL_TYPE_NUMERIC) {
				Date date = cell.getDateCellValue();
				result = (date.getYear() + 1900) + "-" + (date.getMonth() + 1) + "-" + date.getDate();
			} else if (cellType == HSSFCell.CELL_TYPE_STRING) {
				String date = getStringCellValue(cell);
				result = date.replaceAll("[年月]", "-").replace("日", "").trim();
			} else if (cellType == HSSFCell.CELL_TYPE_BLANK) {
				result = "";
			}
		} catch (Exception e) {
			System.out.println("日期格式不正确!");
			e.printStackTrace();
		}
		return result;
	}

	/**
	 * 根据HSSFCell类型设置数据
	 * 
	 * @param cell
	 * @return
	 */
	private String getCellFormatValue(HSSFCell cell) {
		String cellvalue = "";
		if (cell != null) {
			// 判断当前Cell的Type
			switch (cell.getCellType()) {
			// 如果当前Cell的Type为NUMERIC
			case HSSFCell.CELL_TYPE_NUMERIC:
			case HSSFCell.CELL_TYPE_FORMULA: {
				// 判断当前的cell是否为Date
				if (HSSFDateUtil.isCellDateFormatted(cell)) {
					// 如果是Date类型则，转化为Data格式

					// 方法1：这样子的data格式是带时分秒的：2011-10-12 0:00:00
					// cellvalue = cell.getDateCellValue().toLocaleString();

					// 方法2：这样子的data格式是不带带时分秒的：2011-10-12
					Date date = cell.getDateCellValue();
					SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
					cellvalue = sdf.format(date);

				}
				// 如果是纯数字
				else {
					// 取得当前Cell的数值
					cellvalue = String.valueOf(cell.getNumericCellValue());
				}
				break;
			}
			// 如果当前Cell的Type为STRIN
			case HSSFCell.CELL_TYPE_STRING:
				// 取得当前的Cell字符串
				cellvalue = cell.getRichStringCellValue().getString();
				break;
			// 默认的Cell值
			default:
				cellvalue = " ";
			}
		} else {
			cellvalue = "";
		}
		return cellvalue;
	}
	
	
	public List<Map<String, Object>> readExcelByLine(InputStream is) {
        List<Map<String, Object>> contentList = new ArrayList<Map<String, Object>>();
        String[] title = null;
        try {
        	title = readExcelTitle(is);
            fs = new POIFSFileSystem(is);
            wb = new HSSFWorkbook(fs);
        } catch (IOException e) {
            e.printStackTrace();
        }
        sheet = wb.getSheetAt(0);
        // 得到总行数
        int rowNum = sheet.getLastRowNum();
        row = sheet.getRow(0);
        int colNum = row.getPhysicalNumberOfCells();
        
        // 正文内容应该从第二行开始,第一行为表头的标题
        for (int i = 1; i <= rowNum; i++) {
            row = sheet.getRow(i);
            Map<String, Object> content = new HashMap();
            int j = 0;
            while (j < colNum) {
                // 每个单元格的数据内容用"-"分割开，以后需要时用String类的replace()方法还原数据
                // 也可以将每个单元格的数据设置到一个javabean的属性中，此时需要新建一个javabean
            	String str = "";
                if (row != null) {

                    HSSFCell cell = row.getCell((short) j);
                    if(cell != null){
                    	if(StringUtils.isNotEmpty(getMobileCellValue(cell))){
                        	str = getMobileCellValue(cell).trim();
                        }else{
                        	str = getMobileCellValue(cell);
                        }
                    }
                    
                    // "-";
                    //str += getCellFormatValue(row.getCell((short) j)).trim() + "    ";
                    
                    content.put(title[j], str);

                }
                j++;
            }
            contentList.add(content);
        }
        return contentList;
    }

    public void createExcel(String path, List<Map<String, Object>> list) {
    	
    	HSSFWorkbook workbook = null;
		try {
			LinkedHashMap<String, Object> titleMap = new LinkedHashMap<String, Object>();
			titleMap.put("子订单ID", "子订单ID");
			titleMap.put("所在学院", "所在学院");
			titleMap.put("家族","家族");
			titleMap.put("学员ID","学员ID");
			titleMap.put("姓名", "姓名");
			titleMap.put("昵称", "昵称");
			titleMap.put("移动电话", "移动电话");
			titleMap.put("状态", "状态");
			titleMap.put("失败原因", "失败原因");
			
			workbook = ExcelDetails.CreateExcelXls(list, titleMap, null);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        /*HSSFWorkbook workbook = new HSSFWorkbook();
        //
        HSSFSheet sheet = workbook.createSheet("sheet1");
        // 3:创建首行
        HSSFRow row = sheet.createRow(0);
        createRow(row, list.get(0), 0);
        for (int j = 0; j < list.size(); j++) {
            Map<String, Object> dataCol = list.get(j);
            HSSFRow dataRow = sheet.createRow((j + 1));
            createRow(dataRow, dataCol, (j + 1));
        }*/
        // 7:创建输出流，讲excel文档存盘到d:/score.xls
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(path);
            workbook.write(fos);
            fos.flush();
            System.out.println("存盘完成！");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (null != fos) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private void createRow(HSSFRow dataRow, Map<String, Object> dataCol, int i) {
        Set<String> set = dataCol.keySet();//表头
        
        //设置表头内容
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            // 创建单元格
            HSSFCell cell = row.createCell(i++);
            // 设置单元格内容类型
            cell.setCellType(HSSFCell.CELL_TYPE_STRING);
            // 向单元格内写入内容
            System.out.println(MapUtils.getString(dataCol,it.next()));
            cell.setCellValue(MapUtils.getString(dataCol,it.next()));
           
        }
        //新增一列
       /* HSSFCell cell = row.createCell(i);
        cell.setCellType(HSSFCell.CELL_TYPE_STRING);
        if(i == 0){
        	cell.setCellValue("状态");//根据i的值赋表头还是数据
        }else{
        	cell.setCellValue(MapUtils.getString(dataCol,"col_1"));//根据i的值赋表头还是数据
        }*/
        
    }
}

