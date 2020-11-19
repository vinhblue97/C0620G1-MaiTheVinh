package service.Impl;

import org.springframework.stereotype.Service;
import service.ConvertService;
@Service
public class ConvertServiceImpl implements ConvertService {
    @Override
    public String convert(double currency, String type_1, String type_2) {
        double result = 0.0;
        if (type_1.equals("1")) {
            if (type_2.equals("1")) {
                result = currency;
            } else if (type_2.equals("2")) {
                result = currency / 23300;
            }
        } else if (type_1.equals("2")) {
            if (type_2.equals("1")) {
                result = currency * 23300;
            } else if (type_2.equals("2")) {
                result = currency;
            }
        }
        String finalResult = String.format("%.0f", result);
        return finalResult;
    }
}
