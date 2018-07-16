package com.mypackage;
import com.mypackage.annotation.YzInspect;
import com.mypackage.summer.Summer;
import java.io.File;
import java.lang.annotation.Annotation;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public class SummerApplicationContext {
    private static final String fileType = "file";
    private static Summer summer =Summer.getInstance();
    public Object GetTaste(String Name)
    {
       return summer.resolve(Name);
    }
    public void SummerStart()
    {
        try
        {
            List<Object> classList = new ArrayList<Object>();
            //获取当前线程下的ClassLoader
            java.lang.ClassLoader loader =Thread.currentThread().getContextClassLoader();
            Enumeration<URL> dirs;
            //获取该文件所在的包
            String packageName = SummerApplicationContext.class.getPackage().getName().replace('.', '/');
            dirs = loader.getResources(packageName);
            while (dirs.hasMoreElements())
            {
                URL url =dirs.nextElement();
                String protocol = url.getProtocol();
                if(fileType.equals(protocol))
                {
                    getClassByFile(url.getPath(),classList);
                    System.out.println(classList.size());
                }
            }
        }catch (Exception e)
        {

        }
    }
    /**
     * 从项目文件获取某包下所有类
     * @param filePath 文件路径
     * @param classLists 类名集合
     * @return 类的完整名称
     */
    private static List<Object> getClassByFile(String filePath, List<Object> classLists) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        File file = new File(filePath);
        File[] childFiles = file.listFiles();
        for (File childFile : childFiles) {
            if (childFile.isDirectory()) {
                    getClassByFile(childFile.getPath(), classLists);
            } else {
                String childFilePath = childFile.getPath();
                if (childFilePath.endsWith(".class")) {
                    childFilePath = childFilePath.substring(childFilePath.indexOf("\\classes") + 9, childFilePath.lastIndexOf("."));
                    childFilePath = childFilePath.replace("\\", ".");
                    Class mClass = Class.forName(childFilePath);
                    Annotation annotation = mClass.getAnnotation(YzInspect.class);
                    if(annotation !=null)
                    {
                        classLists.add(mClass.newInstance());
                        String name = childFile.getName().split("\\.")[0];
                        char[] array =name.toCharArray();
                        array[0] =Character.toLowerCase(array[0]);
                        name = String.valueOf(array);
                        summer.add(name,mClass.newInstance());
                    }
                }
            }
        }
        return classLists;
    }
}
