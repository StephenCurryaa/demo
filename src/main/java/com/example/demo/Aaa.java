//package com.example.demo;
//
//import java.io.UnsupportedEncodingException;
//import java.security.MessageDigest;
//import java.security.NoSuchAlgorithmException;
//
///**
// * Created by 170251 on 2018/5/29.
// */
//public class Aaa {
//    public static void main(String[] args) {
//        String secret ="123456";
//        String theFirst = CryptoUtil.sha512(secret);
//        System.out.println(theFirst);
//    }
//    public static String sha512(String data) {
//
//        // 返回值
//        String strResult = null;
//
//        // 是否是有效字符串
//        if (data != null && data.length() > 0) {
////            try {
//                // SHA 加密开始
//                // 创建加密对象 并傳入加密類型
//                MessageDigest messageDigest = MessageDigest.getInstance("SHA-512");
//                // 传入要加密的字符串
//                messageDigest.update(data.getBytes());
//                // 得到 byte 類型结果
//                byte[] byteBufferSHA = messageDigest.digest();
//
//                // 將 byte 轉換爲 string
//                byte[] hex = new Hex().encode(byteBufferSHA);
//                // 得到返回結果
//                strResult = new String(hex, "ISO-8859-1");
//            } catch (NoSuchAlgorithmException e) {
//                logger.error("算法写错了", e);
//            } catch (UnsupportedEncodingException e) {
//                logger.error("编码错了", e);
//            }
//        }
//
//        return strResult;
//    }
//}
