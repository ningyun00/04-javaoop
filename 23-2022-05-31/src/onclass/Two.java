package onclass;

import org.dom4j.*;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class Two {
    public static void main(String[] args) throws DocumentException, IOException {
        SAXReader saxReader = new SAXReader();//读取xml文件
        String path = "xml/Animals.xml";
        Document document = saxReader.read(path);//获取树的形式
        Element element = document.getRootElement();//获取根节点
        document = DocumentHelper.createDocument();
        String root = element.getName();
        element = document.addElement(root);
        Element Animal = element.addElement("Animal");//添加一个动物
        Animal.addAttribute("id","01");//设置动物编号
        Element name = Animal.addElement("name");//添加一个动物名称 元素
        name.setText("小花猫");
        Element type = Animal.addElement("type");//添加一个动物类别    元素
        type.setText("步子到");

        OutputFormat outputFormat = new OutputFormat("\t",true);
        outputFormat.setTrimText(true);

        Writer writer = new OutputStreamWriter(new FileOutputStream(path),StandardCharsets.UTF_8);
        XMLWriter xmlWriter = new XMLWriter(writer, outputFormat);
        xmlWriter.write(document);
        writer.close();
    }
   /* private static void add(String name, String sex) {
        String file = "E:/workspace/eclipse/HelloWorld/src/test2/hr.xml";//XML文件地址
        SAXReader reader = new SAXReader();//SAXReader类是读取XML文件的核心类
        try {
            Document document = reader.read(file);//将XML解析后以“树”的形式保存在内存中
            Element root = document.getRootElement();//获取XML文档的根节点，即hr标签

            Element employee = root.addElement("employee");//加入一个员工
            employee.addAttribute("no", "009");//设置员工属性
            Element name = employee.addElement("name");//加入一个员工名称
            name.setText("李四");//设置员工名称
            employee.addElement("age").setText("34");//加入并设置员工的年龄
            employee.addElement("salary").setText("6000");//加入并设置员工的薪水
            Element department = employee.addElement("department");//加入员工所属部门
            department.addElement("dname").setText("人事部");//加入并设置员工所属部门的名字
            department.addElement("address").setText("XX大厦-B105");//加入并设置员工所属部门的地址
            Writer writer = new OutputStreamWriter(new FileOutputStream(file), "UTF-8");//将文件输出流转化成writer对象
            document.write(writer);//将内存中构建的DOM模型写入XML文件中
            writer.close();//关闭输出流
        } catch (Exception e) {
            e.printStackTrace();//如果有异常则打印堆栈信息
        }
    }*/
}
