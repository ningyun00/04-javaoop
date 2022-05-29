package onclass;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;

public class Four {
    public static void main(String[] args) throws DocumentException, IOException {
        add("01", "小猫", "花猫");
        add("02", "中猫", "黑猫");
        add("03", "大猫", "白猫");
    }

    public static void add(String id, String name, String type) throws DocumentException, IOException {
        SAXReader saxReader = new SAXReader();//读取xml文件
        String path = "xml/Animals.xml";
        Document document = saxReader.read(path);//获取树的形式
        Element element = document.getRootElement();//获取根节点
        Element Animal = element.addElement("Animal");//添加一个动物
        Animal.addAttribute("id", id);//设置动物编号
        Animal.addElement("name").setText(name);//添加一个动物名称 元素//设置文本
        Animal.addElement("type").setText(type);//添加一个动物类别    元素
        OutputFormat outputFormat = new OutputFormat("\t", true);//格式化,碰到\t换行
        outputFormat.setTrimText(true);//这句话是给追加的准备的,碰到回车不换行,防止追加的没空行，之前的有空行
        Writer writer = new OutputStreamWriter(new FileOutputStream(path), StandardCharsets.UTF_8);//将文件输出流转化成writer对象

        XMLWriter xmlWriter = new XMLWriter(writer, outputFormat);//获取xml文件输出流
        xmlWriter.write(document);//向writer写入doc
        xmlWriter.close();
        writer.close();//关闭流
    }
}
