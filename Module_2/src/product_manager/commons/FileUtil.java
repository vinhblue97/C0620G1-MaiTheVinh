package product_manager.commons;

import product_manager.models.Export;
import product_manager.models.Import;
import product_manager.models.Normal;
import product_manager.models.ProductS;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {
    final String COMMAN = ",";
    final String NEW_LINE = "\n";
    final String PRODUCT_PATH = "E:\\C0620G1-MaiTheVinh\\Module_2\\src\\product_manager\\data\\ProductFile.csv";
    final String HEADER = "Id,Code,Name,Cost,Amount,Factory,Import Cost,Import From, Import Tax, Export Cost, Export To";

    public void writeCSV(List<ProductS> productList) {
        try (FileWriter fileWriter = new FileWriter(PRODUCT_PATH)) {
            fileWriter.append(HEADER);
            fileWriter.append(NEW_LINE);
            for (ProductS product : productList) {
                fileWriter.append(product.getProductId()+"");
                fileWriter.append(COMMAN);
                fileWriter.append(product.getProductCode());
                fileWriter.append(COMMAN);
                fileWriter.append(product.getProductName());
                fileWriter.append(COMMAN);
                fileWriter.append(product.getCost() + "");
                fileWriter.append(COMMAN);
                fileWriter.append(product.getAmount() + "");
                fileWriter.append(COMMAN);
                fileWriter.append(product.getFactory());
                fileWriter.append(COMMAN);
                fileWriter.append(product.getImportCost() + "");
                fileWriter.append(COMMAN);
                fileWriter.append(product.getImportFrom());
                fileWriter.append(COMMAN);
                fileWriter.append(product.getImportTax() + "");
                fileWriter.append(COMMAN);
                fileWriter.append(product.getExportCost() + "");
                fileWriter.append(COMMAN);
                fileWriter.append(product.getExportTo());
                fileWriter.append(NEW_LINE);
            }
        } catch (NullPointerException e) {

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<ProductS> readFileCSV() {
        List<ProductS> list = new ArrayList<>();
        try (FileReader fileReader = new FileReader(PRODUCT_PATH);
             BufferedReader reader = new BufferedReader(fileReader)) {
            String line = reader.readLine();
            while ((line = reader.readLine()) != null) {
                String[] temp = line.split(COMMAN);
                if (temp[6].equals("0") && temp[9].equals("0")) {
                    ProductS product = new Normal(temp[1], temp[2], Integer.parseInt(temp[3]), Integer.parseInt(temp[4]), temp[5]);
                    list.add(product);
                } else if (temp[6].equals("0")) {
                    ProductS anExport = new Export(temp[1], temp[2], Integer.parseInt(temp[3]), Integer.parseInt(temp[4]), temp[5], Integer.parseInt(temp[9]), temp[10]);
                    list.add(anExport);
                } else if (temp[9].equals("0")) {
                    ProductS product = new Import(temp[1], temp[2], Integer.parseInt(temp[3]), Integer.parseInt(temp[4]), temp[5], Integer.parseInt(temp[6]), temp[7], Integer.parseInt(temp[8]));
                    list.add(product);
                }
            }
        } catch (FileNotFoundException e) {
            FileWriter newFile = new FileWriter(PRODUCT_PATH);
        } catch (NullPointerException e) {

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            return list;
        }
    }
}
