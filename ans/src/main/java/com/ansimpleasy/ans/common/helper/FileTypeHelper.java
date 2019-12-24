package com.ansimpleasy.ans.common.helper;

import com.ansimpleasy.ans.enums.FileType;
import org.apache.logging.log4j.util.Strings;
import org.springframework.util.Assert;

import java.util.Arrays;

/**
 * @author LiuCan
 * @date 2019/12/13 14:34
 */
public class FileTypeHelper {
    public static FileType getType(byte[] buff){

        Assert.isTrue(buff!=null &&buff.length>28 , "");

        byte[] bytes= Arrays.copyOfRange(buff, 0, 28);
        String magic = bytesToHex(bytes);

        for(FileType type:FileType.values()){
            if(Strings.isNotEmpty(type.getVal()) && magic.startsWith(type.getVal())){
                return type;
            }
        }
        return null;
    }

    /**
     * 判断是否为图片，是图片返回true，否则返回false
     *
     * @param buff
     * @return 图片返回true，否则返回false
     */
    public static boolean isImage(byte[] buff){
        FileType type = getType(buff);
        return FileType.JPEG.equals(type)||FileType.PNG.equals(type);
    }

    private static String bytesToHex(byte[] src) {
        StringBuilder stringBuilder = new StringBuilder();
        if (src == null || src.length <= 0) {return null;}
        for (int i = 0; i < src.length; i++) {
            int v = src[i] & 0xFF;
            String hv = Integer.toHexString(v);
            if (hv.length() < 2) {
                stringBuilder.append(0);
            }
            stringBuilder.append(hv);
        }
        return stringBuilder.toString().toUpperCase();
    }
}
