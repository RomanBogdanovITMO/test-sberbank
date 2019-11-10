package ru.sberbank;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import ru.sberbank.db.DBServiceHiber;
import ru.sberbank.xmlObjects.Order;
import ru.sberbank.xmlObjects.Par;
import ru.sberbank.xmlObjects.ParList;

import java.io.*;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException, IllegalAccessException {
        sortedMapDocuments(parserXMLFile());
        System.out.println("_____________________________");
        namesAndValuesNationality(parserXMLFile());

        DBServiceHiber serviceHiber = new DBServiceHiber();
        addParListBD(parserXMLFile(),serviceHiber);

    }

    //парсим xml и создаем обьеткы java
    static Order parserXMLFile() throws IOException {
        File file = new File("test.xml");
        XmlMapper xmlMapper = new XmlMapper();
        String xml = inputStreamToString(new FileInputStream(file));
        Order order = xmlMapper.readValue(xml, Order.class);

        return order;
    }

    //формируем строку
    static String inputStreamToString(InputStream is) throws IOException {
        StringBuilder sb = new StringBuilder();
        String line;
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        while ((line = br.readLine()) != null) {
            sb.append(line);
        }
        br.close();
        return sb.toString();
    }

    //1. Необходимо сформировать коллекцию, содержащую все виды документов в отсортированном порядке
    static void sortedMapDocuments(Order order) {

        List<Par> list = order.getServices().getServ().getPars();
        Set<String> setList = new TreeSet<>();

        for (Par parss : list) {
            if ((parss.getPar_list() != null) & (parss.getName().equals("ВИД_ДОК"))) {
                for (ParList parr : parss.getPar_list()) {
                    setList.add(parr.getValue());
                }
            }
        }
        Iterator<String> iterator = setList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

    //2. Вывести имена и значения всех атрибутов для par step="1" name="ГРАЖДАНСТВО"
    static void namesAndValuesNationality(Order order) throws IllegalAccessException {

        List<Field> fields = new ArrayList<>();
        Map<String, String> map = new HashMap<>();
        List<Par> lisrPar = order.getServices().getServ().getPars();

        for (Par pars : lisrPar) {
            if (pars.getName().equals("ГРАЖДАНСТВО")) {
                Class clasz = pars.getClass();
                for (Field field : clasz.getDeclaredFields()) {
                    if (field.getType() == String.class && field.getModifiers() == Modifier.PRIVATE) {
                        fields.add(field);
                    }
                }
                for (Field field1 : fields) {
                    field1.setAccessible(true);
                    String v = (String) field1.get(pars);
                    map.put(field1.getName(), (String) field1.get(pars));
                }
            }
        }

        for (Map.Entry<String, String> maps : map.entrySet()) {
            System.out.println(maps.getKey() + " = " + maps.getValue());
        }
    }

    //3. Задача со звездочкой создать в базе таблицу справочник со значениями из первой части
    static void addParListBD(Order order, DBServiceHiber dbServiceHiber) {
        List<Par> list = order.getServices().getServ().getPars();
        List<ParList> lists = new ArrayList<>();

        for (Par parss : list) {
            if ((parss.getPar_list() != null) & (parss.getName().equals("ВИД_ДОК"))) {
                for (ParList parr : parss.getPar_list()) {
                    dbServiceHiber.create(parr);
                }
            }
        }

    }
}



