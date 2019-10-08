package com.xmwjyy.wxx.common.utils;

import java.io.FileOutputStream;
import java.io.IOException;
/**
 * 解析工具
 * @author snake8859
 *
 */
public class ParseUtil1 {

	
		/**
		 * 解析Char
		 * @param buf
		 * @param in
		 * @param name
		 * @param out
		 * @return
		 * @throws IOException
		 */
		public static String getMessage(byte[] buf, String name,FileOutputStream out) throws IOException {
			String message = new String(buf,"GB2312").trim();
			message = deletTailChar0(message);
			out.write((name+":"+message+"\r\n").getBytes("GB2312"));
			return message;

		}
		

	  /**
	   * 截取掉C中之前的字符串。即只截取前的字符
	   * @param s
	   * @return
	   */
	   public static String deletTailChar0(String s){  
	       if(s == null){  
	           return null;  
	       }  
	       char[] chars = s.toCharArray();  
	       StringBuffer sb = new StringBuffer();  
	       for(char c : chars){  
	           Character ch = c;  
	           if(0 == ch.hashCode()){ //如果到了字符串结束，则跳出循环  
	               break;  
	           }else{  
	               sb.append(c);  
	           }  
	       }  
	       return sb.toString();  
	   }

		/**
		 * 解析Int
		 * @param buf
		 * @param in
		 * @param name
		 * @param out
		 * @return
		 * @throws IOException
		 */
		public static int getInt(byte[] buf,String name,FileOutputStream out) throws IOException {
			int message = bytesToInt(buf, 0);
			out.write((name+":"+message+"\r\n").getBytes("GB2312"));
			return message;

		}

		/**
		 * 解析float
		 * @param buf
		 * @param in
		 * @param name
		 * @param out
		 * @return
		 * @throws IOException
		 */
		public static float getFloat(byte[] buf,String name,FileOutputStream out) throws IOException {
			float message = byte2float(buf, 0);
			out.write((name+":"+message+"\r\n").getBytes("GB2312"));
			return message;

		}
		
		/**
		 * 获取UINT8
		 * @param buf
		 * @param in
		 * @param name
		 * @param out
		 * @return
		 * @throws IOException
		 */
		public static short getUINT8(byte[] buf, String name,FileOutputStream out) throws IOException {
			short message = (short) (buf[0] & 0xFF);
			out.write((name+":"+message+"\r\n").getBytes("GB2312"));
			return message;
		}
		
		/**
		 * 解析UINT16
		 * @param buf
		 * @param in
		 * @param name
		 * @param out
		 * @return
		 * @throws IOException
		 */
		public static int getUINT16(byte[] buf,String name,FileOutputStream out) throws IOException {
			int message = (buf[0] & 0xff) | ((buf[1] << 8) & 0xff00);
			out.write((name+":"+message+"\r\n").getBytes("GB2312"));
			return message;
		}

		

		/**
		 * byte数组中取int数值，本方法适用于(低位在前，高位在后)的顺序，和和intToBytes（）配套使用
		 * 
		 * @param src
		 *            byte数组
		 * @param offset
		 *            从数组的第offset位开始
		 * @return int数值
		 */
		public static int bytesToInt(byte[] src, int offset) {
			int value;
			value = (int) ((src[offset] & 0xFF) | ((src[offset + 1] & 0xFF) << 8) | ((src[offset + 2] & 0xFF) << 16)
					| ((src[offset + 3] & 0xFF) << 24));
			return value;
		}

		/**
		 * 将int数值转换为占四个字节的byte数组，本方法适用于(低位在前，高位在后)的顺序。 和bytesToInt（）配套使用
		 * 
		 * @param value
		 *            要转换的int值
		 * @return byte数组
		 */
		public static byte[] intToBytes(int value) {
			byte[] src = new byte[4];
			src[3] = (byte) ((value >> 24) & 0xFF);
			src[2] = (byte) ((value >> 16) & 0xFF);
			src[1] = (byte) ((value >> 8) & 0xFF);
			src[0] = (byte) (value & 0xFF);
			return src;
		}

		/**
		 * 浮点转换为字节
		 * 
		 * @param f
		 * @return
		 */
		public static byte[] float2byte(float f) {

			// 把float转换为byte[]
			int fbit = Float.floatToIntBits(f);

			byte[] b = new byte[4];
			for (int i = 0; i < 4; i++) {
				b[i] = (byte) (fbit >> (24 - i * 8));
			}

			// 翻转数组
			int len = b.length;
			// 建立一个与源数组元素类型相同的数组
			byte[] dest = new byte[len];
			// 为了防止修改源数组，将源数组拷贝一份副本
			System.arraycopy(b, 0, dest, 0, len);
			byte temp;
			// 将顺位第i个与倒数第i个交换
			for (int i = 0; i < len / 2; ++i) {
				temp = dest[i];
				dest[i] = dest[len - i - 1];
				dest[len - i - 1] = temp;
			}

			return dest;

		}

		/**
		 * 字节转换为浮点
		 * 
		 * @param b
		 *            字节（至少4个字节）
		 * @param index
		 *            开始位置
		 * @return
		 */
		public static float byte2float(byte[] b, int index) {
			int l;
			l = b[index + 0];
			l &= 0xff;
			l |= ((long) b[index + 1] << 8);
			l &= 0xffff;
			l |= ((long) b[index + 2] << 16);
			l &= 0xffffff;
			l |= ((long) b[index + 3] << 24);
			return Float.intBitsToFloat(l);
		}
	
}
