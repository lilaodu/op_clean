package com.chainup.operate.service;

import com.chainup.common.exchange.entity.Transaction;
import com.chainup.common.stats.entity.TransferVO;

import java.util.List;
import java.util.Map;

/**
 * Created by mfXing.
 */
public interface TransferService {
    List<Map<String, String>> getTypeList();

    List<String> getSymbolList();

    String getScene();

    Boolean uidCheck(int uid);

    Boolean transfer(TransferVO transferVO) throws Exception;

    List<Transaction> transferRecord(String dateStart, String dateEnd, int pageStart, int pageCount, String scene);

    int recordCount(String ctimeStart,String ctimeEnd,String scene);
}
