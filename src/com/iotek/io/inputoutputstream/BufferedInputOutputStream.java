package com.iotek.io.inputoutputstream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedInputOutputStream {

	public static void main(String[] args) {
		try {
			FileUtil.copyFile(new File("e:/zhangsan/a.mp3"), new File("e:/开发资料/陈豪JavaSE基础视频/bufferedInputOutputStream.mp3"));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

class FileUtil {
	public static void copyFile(File src, File dst) throws IOException {
		FileInputStream fis = new FileInputStream(src);
		FileOutputStream fos = new FileOutputStream(dst);
		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		long time1 = System.currentTimeMillis();
		int data;
		while ((data = bis.read()) != -1) {
			bos.write(data);
		}
		bis.close();
		bos.close();
		long time2 = System.currentTimeMillis();
		System.out.println("复制完成，共花费：" + (time2 - time1) + "毫秒");
	}
}