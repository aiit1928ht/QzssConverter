package qzssconverter;

import java.util.HashMap;

public class DCCommonDecoder {
    String pab;
    String messageType;
    String reportClassification;
    String disasterCategory;
    String reportTime;
    String infoType;
    String otherData;

    public String decodeHexToBin(String hexData) {
        /**
         * CRCを除いた16進数のQZQMSデータを2進数へ変換する.
         */
        final int dec = Integer.parseInt(hexData, 16);
        final String binData = Integer.toBinaryString(dec);
        return binData;
    }

    public HashMap decord(String hexData) {
        /**
         * CRCを除いたQZQMSデータの内, PABからInfomation Typeまでを2進数からデコードする.
         * @param hexData CRCを除いたQXQMS
         * @return dcCommonInfo DCReportと残りのデータ
         */
        String binData = decodeHexToBin(hexData);
        return dcCommonInfo;
    }
}
