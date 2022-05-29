package onclass;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import java.io.IOException;

public class One {
    static SAXReader saxReader = null;
    static Document document = null;
    static Element element = null;
    public static void main(String[] args) throws DocumentException, IOException {
        saxReader = new SAXReader();  //创建解析器
        document = saxReader.read("xml/student.xml");//读取xml文件内容
        element = document.getRootElement();//创建根元素对象
        for (Object object : element.elements()) {
            Element e = (Element) object;
            System.out.println("姓名：" + e.element("name").getText() + "\t性别：" + e.element("sex").getText());
        }
    }
}
