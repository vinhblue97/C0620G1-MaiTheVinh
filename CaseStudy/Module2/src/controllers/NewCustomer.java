package controllers;

import models.Customer;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;

public class NewCustomer<E extends Comparable> {
    transient Scanner scanner = new Scanner(System.in);
    List<Customer> customersList;

    public NewCustomer(List<Customer> customersList) {
        this.customersList = customersList;
    }

    public void addNewCustomer() throws IOException {
        String name = setName();
        System.out.println("Enter the birthDay (dd/MM/yyyy)");
        String birthDay = setBirthDay();
        System.out.println("Enter the gender (Unknow, Male, Female)");
        String gender = setGender();
        System.out.println("Enter the Id card");
        String idCard = setIdCard();
        System.out.println("Enter the phoneNumber");
        String phoneNumber = scanner.nextLine();
        String email = setEmail();
        System.out.println("Enter the type of customer");
        String customerType = "dasdasdasdasd";
        System.out.println("Enter the address");
        String address = "15asd";
        Customer newCustomer = new Customer(name, birthDay, gender, idCard, phoneNumber, email, customerType, address);
        customersList.add(newCustomer);
        writeCSV();
    }

    public String setName() {
        Pattern pattern;
        Matcher matcher;
        String name = null;
        try {
            System.out.println("Enter the new customer's name");
            name = scanner.nextLine();
            String validateName = "^[A-Z][a-z]+(\\s[A-Z][a-z]+)+$";
            pattern = Pattern.compile(validateName);
            matcher = pattern.matcher(name);
            if (!matcher.matches()) {
                throw new Exception();
            }
        } catch (Exception e) {
            System.err.println("Name is not correct form");
            return setName();
        }
        return name;
    }

    public String setEmail() {
        Pattern pattern;
        Matcher matcher;
        String email = null;
        try {
            System.out.println("Enter the email");
            email = scanner.nextLine();
            String validateName = "^[A-z]\\w+@[a-z]{2,7}\\.[a-z]{2,3}$";
            pattern = Pattern.compile(validateName);
            matcher = pattern.matcher(email);
            if (!matcher.matches()) {
                throw new Exception();
            }
        } catch (Exception e) {
            System.err.println("Email is not correct form: abc@abc.abc");
            return setEmail();
        }
        return email;
    }

    public String setGender() {
        String gender = null;
        do {
            gender = scanner.nextLine();
            gender = gender.replaceAll("\\s+", "");
            String temp = gender.toLowerCase();
            gender = temp.toUpperCase().charAt(0) + temp.substring(1, temp.length());
            if (!gender.equals("Male") && !gender.equals("Female") && !gender.equals("Unknow")) {
                System.out.println("Gender is one of : Unknow, Male or Female" + "\n" +
                        "Enter again please");
            }
        } while (!gender.equals("Male") && !gender.equals("Female") && !gender.equals("Unknow"));
        return gender;
    }

    public String setIdCard() {
        Pattern pattern;
        Matcher matcher;
        String idCard = null;
        try {
            String idCardRegex = "^[0-9]{3}(\\s[0-9]{3}){2}$";
            idCard = scanner.nextLine();
            pattern = Pattern.compile(idCardRegex);
            matcher = pattern.matcher(idCard);
            if (!matcher.matches()) {
                throw new Exception();
            }
        } catch (Exception e) {
            System.err.println("ID card must have 9 number XXX XXX XXX, please enter id card again");
            return setIdCard();
        }
        return idCard;
    }

    public String setBirthDay() {
        Pattern pattern;
        Matcher matcher;
        String birthDay = null;
        try {
            String birthDayRegex = "^[0-9]{2}\\/[0-9]{2}\\/([1][9][0-9]{2})|([2][0-9]{3})$";
            birthDay = scanner.nextLine();
            pattern = Pattern.compile(birthDayRegex);
            matcher = pattern.matcher(birthDay);
            if (!matcher.matches() && !isRightDate(birthDay)) {
                System.out.println(isRightDate(birthDay));
                throw new DataFormatException();
            }
            String age = birthDay.substring(birthDay.length() - 4, birthDay.length());
            Date now = new Date();
            String currenYear = now + "";
            currenYear = currenYear.substring(currenYear.length() - 4, currenYear.length());
            boolean isRightYear = (Integer.parseInt(currenYear) - Integer.parseInt(age) < 18) || (Integer.parseInt(age) <= 1900);
            if (isRightYear) {
                throw new Exception();
            }
        } catch (DataFormatException day) {
            System.err.println("Day is not correct form, enter the birthDay (dd/MM/yyyy) again");
            setBirthDay();
        } catch (Exception e) {
            System.err.println("Birth day is greater than 1900 and lower than current year 18 years, please enter again");
            setBirthDay();
        }
        return birthDay;
    }

    public boolean isRightDate(String date) {
        int day = Integer.parseInt(date.substring(0, 2));
        int month = Integer.parseInt(date.substring(3, 5));
        int year = Integer.parseInt(date.substring(date.length() - 4, date.length()));
        switch (month) {
            case 1:
                if (day > 31) {
                    System.out.println("jannuary just has 31 days");
                    return false;
                } else return true;
            case 3:
                if (day > 31) {
                    System.out.println("Mart just has 31 days");
                    return false;
                } else return true;
            case 5:
                if (day > 31) {
                    System.out.println("May just has 31 days");
                    return false;
                } else return true;
            case 7:
                if (day > 31) {
                    System.out.println("July just has 31 days");
                    return false;
                } else return true;
            case 8:
                if (day > 31) {
                    System.out.println("August just has 31 days");
                    return false;
                } else return true;
            case 10:
                if (day > 31) {
                    System.out.println("October just has 31 days");
                    return false;
                } else return true;
            case 12:
                if (day > 31) {
                    System.out.println("December just has 31 days");
                    return false;
                } else return true;
            case 4:
                if (day > 30) {
                    System.out.println("April just has 30 days");
                    return false;
                } else return true;
            case 6:
                if (day > 30) {
                    System.out.println("June just has 30 days");
                    return false;
                } else return true;
            case 9:
                if (day > 30) {
                    System.out.println("September just has 30 days");
                    return false;
                } else return true;
            case 11:
                if (day > 30) {
                    System.out.println("November just has 30 days");
                    return false;
                } else return true;
            case 2:
                if (isLeapYear(year)) {
                    if (day > 29) {
                        System.out.println("February in " + year + " just has 29 days");
                        return false;
                    } else return true;
                } else {
                    if (day > 28) {
                        System.out.println("February in " + year + " just has 28 days");
                        return false;
                    } else return true;
                }
            default:
                return false;
        }
    }

    public boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    public void writeCSV() throws IOException {
        String filePath = "E:\\C0620G1-MaiTheVinh\\CaseStudy\\Module2\\src\\data\\Customer.csv";
        FileOutputStream outputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            outputStream = new FileOutputStream(filePath);
            objectOutputStream = new ObjectOutputStream(outputStream);

            objectOutputStream.writeObject(customersList);
            System.out.println("Write file successfully");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            outputStream.close();
            objectOutputStream.close();
        }
    }
}
