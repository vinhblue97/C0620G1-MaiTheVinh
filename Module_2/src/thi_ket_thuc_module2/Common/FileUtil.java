package thi_ket_thuc_module2.Common;

import thi_ket_thuc_module2.models.Telephone;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {
    final String COMMAN = ",";
    final String NEW_LINE = "\n";
    final String NUMBER_PHONE_PATH = "E:\\C0620G1-MaiTheVinh\\Module_2\\src\\thi_ket_thuc_module2\\data\\NumberPhone.csv";
    final String HEADER = "Số điện thoại,Nhóm,Họ tên,Giới tính,Địa chỉ,Ngày sinh,Email";

    public void writeCSV(List<Telephone> telephoneNumberLists) {
        try (FileWriter fileWriter = new FileWriter(NUMBER_PHONE_PATH)) {
            fileWriter.append(HEADER);
            fileWriter.append(NEW_LINE);
            for (Telephone element : telephoneNumberLists) {
                fileWriter.append(element.getNumberPhone());
                fileWriter.append(COMMAN);
                fileWriter.append(element.getType());
                fileWriter.append(COMMAN);
                fileWriter.append(element.getUserName());
                fileWriter.append(COMMAN);
                fileWriter.append(element.getGender());
                fileWriter.append(COMMAN);
                fileWriter.append(element.getAddress());
                fileWriter.append(COMMAN);
                fileWriter.append(element.getBirthday());
                fileWriter.append(COMMAN);
                fileWriter.append(element.getEmail());
                fileWriter.append(NEW_LINE);
            }
        } catch (NullPointerException e) {

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Telephone> readFileCSV() {
        List<Telephone> list = new ArrayList<>();
        try (FileReader fileReader = new FileReader(NUMBER_PHONE_PATH);
             BufferedReader reader = new BufferedReader(fileReader)) {
            String line = reader.readLine();
            while ((line = reader.readLine()) != null) {
                String[] temp = line.split(COMMAN);
                Telephone newPhone = new Telephone(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5], temp[6]);
                list.add(newPhone);
            }
        } catch (FileNotFoundException e) {
            FileWriter newFile = new FileWriter(NUMBER_PHONE_PATH);
        } catch (NullPointerException e) {

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            return list;
        }
    }
}
