package com.iotek.net.url;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

public class URLDemo {

	public static void main(String[] args) {
		try {
			DownloadUtil.download(
					"http://29e5534ea20a8.cdn.sohucs.com/c_zoom,h_213/c_cut,x_0,y_0,w_1076,h_717/os/news/b3d0cba917bc78f8ffd1bf7ab258dfb6.jpg",
					"URLDemo.jpg", "E:\\开发资料\\陈豪JavaSE基础视频");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

class DownloadUtil {
	public static void download(String urlStr, String fileName, String savePath) throws IOException {
		URL url = new URL(urlStr);
//		URLConnection conn = url.openConnection();
		BufferedInputStream bis = new BufferedInputStream(/*conn.getInputStream()*/url.openStream());
		int len;
		File file = new File(savePath);
		if (!file.exists()) {
			file.mkdirs();
		}

		BufferedOutputStream bos = new BufferedOutputStream(
				new FileOutputStream(file.getAbsolutePath() + "\\" + fileName));
		while ((len = bis.read()) != -1) {
			bos.write(len);
		}
		bis.close();
		bos.close();
	}
}