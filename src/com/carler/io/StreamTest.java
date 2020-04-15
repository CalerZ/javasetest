package com.carler.io;

import org.junit.Test;

import java.io.*;

/**
 * @author Caler_赵康乐
 * @create 2020-02-25 16:24
 * @description :
 */
public class StreamTest implements  Serializable{


    @Test
    public void copy() {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("");
            fos = new FileOutputStream("");//如果有同名文件会被覆盖，如果使用new FileOutputStream("",true),则会追加内容

            byte[] arrs = new byte[1024];
            int len;
            while ((len = fis.read(arrs)) != -1) {
                fos.write(arrs, 0, len);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (fis!=null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if(fos!=null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    @Test
    public  void copy1(){
        FileReader fr = null;
        FileWriter fw = null;
        try {
            fr = new FileReader("");
            fw = new FileWriter("");
            char[] arrs = new char[1024];
            while (fr.read(arrs)!=-1) {
                fw.write(new String(arrs));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fr!=null){
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(fr!=null){
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }

    }

    public void copy3(){
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            bis = new BufferedInputStream(new FileInputStream(""));
            bos = new BufferedOutputStream(new FileOutputStream(""));
            byte[] arrs = new byte[1024];
            int len;
            while((len=bis.read(arrs))!=-1){
                bos.write(arrs,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(bis!=null){

                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(bos!=null){

                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }

    }

    public void copy4(){
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            br = new BufferedReader(new FileReader(""));
            bw = new BufferedWriter(new FileWriter(""));
            String str;

            while((str=br.readLine())!=null){
                bw.write(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(br!=null){
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
            if(bw!=null){
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }

    }

    public void convert(){
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            //把inputstream转成reader
            InputStreamReader isr = new InputStreamReader(new FileInputStream(""),"UTF-8");
            //把write转成outputstream
            OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(""),"UTF-8");

            br = new BufferedReader(isr);
            bw = new BufferedWriter(osw);

            String str;
            while((str=br.readLine())!=null){
                bw.write(str);
                bw.newLine();
                bw.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(bw!=null){

                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(br!=null){

                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }


    }

}
