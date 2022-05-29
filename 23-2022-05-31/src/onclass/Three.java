package onclass;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Three {
    public static void main(String[] args) throws DocumentException, IOException {
        SAXReader saxReader = new SAXReader();//读取xml文件
        String path = "xml/Animals.xml";
        Document document = saxReader.read(path);//获取树的形式
        Element element = document.getRootElement();//获取根节点
        Element Animal = element.addElement("Animal");//添加一个动物
        Animal.addAttribute("id","01");//设置动物编号
        Element name = Animal.addElement("name");//添加一个动物名称 元素
        name.setText("小花猫");//设置文本
        Element type = Animal.addElement("type");//添加一个动物类别    元素
        type.setText("步子到");//设置文本
        OutputFormat outputFormat = new OutputFormat("\t",true);//格式化,碰到\t换行
        outputFormat.setTrimText(true);//这句话是给追加的准备的,碰到回车不换行,防止追加的没空行，之前的有空行
        Writer writer = new OutputStreamWriter(new FileOutputStream(path), StandardCharsets.UTF_8);//将文件输出流转化成writer对象

        XMLWriter xmlWriter = new XMLWriter(writer, outputFormat);//获取xml文件输出流
        xmlWriter.write(document);//向writer写入doc
        writer.close();//关闭流
    }
}
