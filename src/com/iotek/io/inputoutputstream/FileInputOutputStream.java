package com.iotek.io.inputoutputstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputStream {

	public static void main(String[] args) {
		try {
			FileCopyUtil.copyFile(new File("e:/zhangsan/a.mp3"), new File("e:/开发资料/陈豪JavaSE基础视频/fileInputOutputStream.mp3"));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

class FileCopyUtil {
	public static void copyFile(File src, File dst) throws IOException {
		FileInputStream fis = new FileInputStream(src);
		FileOutputStream fos = new FileOutputStream(dst);
		long time1 = System.currentTimeMillis();
		// int data;
		// while ((data = fis.read()) != -1) {
		// fos.write(data);
		// }
		byte[] buf = new byte[fis.available()];
		int length;
		while ((length = fis.read(buf)) != -1) {
			fos.write(buf, 0, length);
		}
		fis.close();
		fos.close();
		long time2 = System.currentTimeMillis();
		System.out.println("复制完成，共花费：" + (time2 - time1) + "毫秒");
	}
}