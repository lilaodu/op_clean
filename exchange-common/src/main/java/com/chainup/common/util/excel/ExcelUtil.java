package com.chainup.common.util.excel;

import org.apache.poi.hssf.usermodel.*;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.io.IOException;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by xmf on 2017/5/25.
 */
public class ExcelUtil {
    final static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日");

    public HSSFWorkbook expExcel(String[] title, List<? extends Object> data) {
        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet();
        if (title == null || title.length == 0) {
            return workbook;
        }

        //写入表头
        HSSFRow head = sheet.createRow(0);
        HSSFCell cell;
        int colIndex;
        for (colIndex = 0; colIndex < title.length; colIndex++) {
            cell = head.createCell(colIndex);
            cell.setCellValue(title[colIndex]);
        }

        Map<Integer, Field> fieldMap = new HashMap<Integer, Field>();
        HSSFCellStyle bodyStyle = workbook.createCellStyle();
        bodyStyle.setWrapText(true);
        for (int i = 0; i < data.size(); i++) {
            Object record = data.get(i);
            if (record instanceof Map) {//Map 类型
                try {
                    // 写入数据
                    HSSFRow row = sheet.createRow(i + 1);
                    colIndex = 0;
                    JSONObject jsonObject = (JSONObject) JSONObject.toJSON(record);
                    Collection c = jsonObject.values();
                    Iterator iterator = c.iterator();
                    for (int j = 0; j < c.size(); j++) {
                        HSSFCell cells = row.createCell(colIndex++);
                        //cells.setCellStyle(bodyStyle);
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
                System.out.println("fields.size======================" + fields.length);
                int k = 0;
                for (Field field : fields) {
                    fieldMap.put(k, field);
                    k++;
                }
            }

            // 写入数据
            HSSFRow row = sheet.createRow(i + 1);
            colIndex = 0;
            for (int j = 0; j < title.length; j++) {
                Field field = fieldMap.get(j);

                try {
                    field.setAccessible(true);
                    Object obj = field.get(record);
                    HSSFCell cells = row.createCell(colIndex++);
                    if (obj == null) {
                        continue;
                    }

                    if (obj instanceof Date) {
                        String dateStr = dateFormat.format(obj);
                        cells.setCellValue(dateStr);
                        continue;
                    }

                    cells.setCellValue(obj.toString());

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return workbook;
    }
}
